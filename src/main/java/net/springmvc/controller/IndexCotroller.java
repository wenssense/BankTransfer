package net.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.springmvc.entity.Account;
import net.springmvc.entity.Loan;
import net.springmvc.entity.MoneyTransfer_History;
import net.springmvc.entity.Recharge;
import net.springmvc.service.AccountService;
import net.springmvc.service.CustomerService;
import net.springmvc.service.LoanService;
import net.springmvc.service.RechargeService;

@Controller
@Transactional
public class IndexCotroller {
	@Autowired
	private AccountService accountService;
	@Autowired
	private LoanService loanService;
	@Autowired
	private RechargeService rechargeService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private SessionFactory session;

	@Autowired
	private HttpSession httpSession;

	@RequestMapping("/")
	public String startPage() {
		return "startpage";
	}

	@RequestMapping("/accountcreation")
	public String accountCreation() {
		return "accountcreation";
	}

	@RequestMapping("/accCrtd")
	public String accountCrtd(@ModelAttribute("account") Account theAccount, Model model) {
		accountService.saveAccount(theAccount);
		return "redirect:/";
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView modell = new ModelAndView();
		modell.addObject("account", new Account());
		modell.setViewName("login");
		return modell;
	}

	/*
	 * @RequestMapping("/dashboard") public ModelAndView dashboard(Model
	 * theModel,Account theAccount,htt) { Session currentSession =
	 * session.getCurrentSession(); ModelAndView mv = new ModelAndView();
	 * mv.setViewName("index"); theAccount = (Account)
	 * currentSession.get(Account.class, 1);
	 * mv.addObject("bal",theAccount.getBalance()); return mv; }
	 */

	@RequestMapping(value = "/dashboard", method = RequestMethod.POST)
	public ModelAndView submit(@Valid @ModelAttribute("account") Account account, BindingResult result,
			ModelMap model) {
		Session currentSession = session.getCurrentSession();
		Account ac = null;
		ModelAndView modell = new ModelAndView();
		if (httpSession.getAttribute("account") == null) {
			Criteria cr = currentSession.createCriteria(Account.class);
			cr.add(Restrictions.eq("email", account.getEmail()));
			List<Account> list = (ArrayList<Account>) cr.list();
			ac = new Account();
			if (list.size() > 0) {
				ac = list.get(0);
			}
			httpSession.setAttribute("account", ac);
		} else {
			ac = (Account) httpSession.getAttribute("account");
		}
		modell.addObject("bal", ac.getBalance());
		modell.setViewName("index");
		return modell;
	}

	@RequestMapping("/loan")
	public String LoanPage() {
		return "loanapplication";
	}

	@PostMapping("/save")
	public ModelAndView Page(@ModelAttribute("loan") Loan theLoan) {
		loanService.saveLoan(theLoan);
		Account ac = null;
		ModelAndView modell = new ModelAndView();
		ac = (Account) httpSession.getAttribute("account");
		modell.addObject("bal", ac.getBalance());
		modell.setViewName("index");
		return modell;
	}

	@RequestMapping("/transfer")
	public ModelAndView transferPage(ModelAndView mv) {
//		List<Customer> theCustomer = customerService.getCustomers();
//		mv.addObject("acc", theCustomer);
		mv.setViewName("transfer");
		return mv;
	}

	@RequestMapping("/bills")
	public String billPage() {
		return "bills";
	}

	@PostMapping("/recharge")
	public String phonePage(Model theModel) {
		List<Account> theAccount = accountService.getAccounts();
		theModel.addAttribute("acc", theAccount);
		return "recharge";
	}

	@PostMapping("/rechargedone")
	public ModelAndView Page(@ModelAttribute Recharge theRecharge) {
		rechargeService.saveRecharge(theRecharge);
		Account ac = null;
		ModelAndView modell = new ModelAndView();
		ac = (Account) httpSession.getAttribute("account");
		modell.addObject("bal", ac.getBalance());
		modell.setViewName("index");
		return modell;
	}

	@RequestMapping("/contactus")
	public String contactPage() {
		return "contactus";
	}

	@RequestMapping("/history")
	public String historyPage(Model theModel) {
		Account ac =  (Account) httpSession.getAttribute("account");
		List<Recharge> theRecharge = rechargeService.getRecharge();
		List<MoneyTransfer_History> listMoneyTransfer = accountService.listMoneyTransferForUser(ac.getId());
		theModel.addAttribute("rech", theRecharge);
		theModel.addAttribute("listMoney", listMoneyTransfer);
		return "history";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest request) {
		return "redirect:/";
	}

	@GetMapping(path = "/listContact")
	public String listContact(Model theModel) {
		Account ac = (Account) httpSession.getAttribute("account");
		List<Account> contacts = customerService.listRemainedbeneficiaries(ac);
		theModel.addAttribute("contacts", contacts);
		return "contacts";
	}
}
