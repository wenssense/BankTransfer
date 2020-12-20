package net.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.springmvc.entity.Account;
import net.springmvc.entity.Customer;
import net.springmvc.service.AccountService;
import net.springmvc.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	HttpSession httpSession;
		
	@Autowired
	private AccountService accountService;
	
	@GetMapping(value="/listShow")
	public String listSample(Model theModel) {
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-sample";
	}
	
	@GetMapping(path="/listManage")
	public String listCustomers(Model theModel) {
		Account ac = (Account) httpSession.getAttribute("account");
		List<Account> theCustomers = customerService.listBeneficiary(ac);
		theModel.addAttribute("accounts", theCustomers);
		return "list-customers"; 
	}
	
	@GetMapping(path="/showForm")
	public String showFormForAdd(Model theModel) {
		Account ac =(Account) httpSession.getAttribute("account");
		System.out.println("Name "+ac.getFirstname());
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	@PostMapping(value="/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.saveCustomer(theCustomer);	
		return "redirect:/listShow";
	}
	
	
	@RequestMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
									Model theModel) {
		Customer theCustomer = customerService.getCustomer(theId);	
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		customerService.deleteCustomer(theId);
		return "redirect:/listManage";
	}
	
	@RequestMapping("/index")
	public ModelAndView returningHomePage() 
	{
		Account ac = null;
		ModelAndView modell = new ModelAndView();
		ac = (Account) httpSession.getAttribute("account");
		modell.addObject("bal", ac.getBalance());
		modell.setViewName("index");
		return modell;
	}
	
	@GetMapping(path="/addBeneficiary")
	public ModelAndView addBeneficiary(@RequestParam("id") int id) {
		Account acount = (Account) httpSession.getAttribute("account");
		Customer customer = new Customer();
		customer.setUser_id(acount.getId());
		customer.setBen_id(id);
		customerService.saveCustomer(customer);
		List<Account> contacts = customerService.listRemainedbeneficiaries(acount);
		ModelAndView model = new ModelAndView("contacts");
		model.addObject("contacts", contacts);
		return model;
	}
}
