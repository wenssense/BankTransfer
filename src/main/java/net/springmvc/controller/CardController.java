package net.springmvc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.springmvc.entity.Account;
import net.springmvc.entity.Card;
import net.springmvc.entity.MoneyTransfer_History;
import net.springmvc.entity.Transfer;
import net.springmvc.service.AccountService;
import net.springmvc.service.CardService;
import net.springmvc.service.CustomerService;


@Controller
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	HttpSession httpSession;
	
	@GetMapping("/existingCard")
    public String listCards(Model theModel) {
        List < Card > theCards = cardService.getCards();
        theModel.addAttribute("cards", theCards);
        return "display";
        }
	
	@GetMapping("/apply")
	public String application(Model theModel) {
		
		return "applyCard";
	}
	
	@PostMapping("/saveNewCard")
	public String saveCard(@ModelAttribute("card") Card theCard,
			Model model) {
		 cardService.saveCard(theCard);
		
		return "cardCreationSuccess";
		
	}
	
	@GetMapping(value="/transferAmount")
	public ModelAndView transferAmount(@RequestParam("id") int id) {
		Account loggedUser =(Account) httpSession.getAttribute("account");
		Account beneficiary = accountService.loadAccount(id);
		Transfer tr = new Transfer();
		tr.setLoggedUserId(loggedUser.getId());
		tr.setLoggedUser(loggedUser.getFirstname());
		tr.setBeneficiaryId(beneficiary.getId());
		tr.setBenefic(beneficiary.getFirstname());
		tr.setAvailable(loggedUser.getBalance());
		ModelAndView md = new ModelAndView("transfer");
		md.addObject("transferForm", tr);
		Transfer tt = new Transfer();
		md.addObject("tranForm", tt);
		return md;
	}
	
	@RequestMapping(value="/transAmount",method = RequestMethod.POST)
	public ModelAndView transAmount(@Valid @ModelAttribute("tranForm") Transfer trans,
			BindingResult result) {
		Account loggedUser = (Account) httpSession.getAttribute("account");
		Account benefic = accountService.loadAccount(trans.getBeneficiaryId());
		int currntUserAmount = Integer.valueOf(loggedUser.getBalance()) - Integer.valueOf(trans.getChoosedAmount());
		int beneficUserAmount = Integer.valueOf(benefic.getBalance()) + Integer.valueOf(trans.getChoosedAmount());
		loggedUser.setBalance(currntUserAmount);
		benefic.setBalance(beneficUserAmount);
		MoneyTransfer_History mon = new MoneyTransfer_History();
		mon.setFromUserId(loggedUser.getId());
		mon.setFromUserName(loggedUser.getFirstname());
		mon.setToUserId(benefic.getId());
		mon.setToUserName(benefic.getFirstname());
		mon.setToAccNo(benefic.getAccountNo());
		mon.setTransferAmount(trans.getChoosedAmount());
		accountService.saveMoneyTransfer(mon);
		accountService.saveAccount(loggedUser);
		accountService.saveAccount(benefic);
		List<Account> theCustomers = customerService.listBeneficiary(loggedUser);
		ModelAndView model = new ModelAndView("list-customers");
		model.addObject("accounts", theCustomers);
		return model; 
	}
}
