package net.springmvc.service;

import java.util.List;

import net.springmvc.entity.Account;
import net.springmvc.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
	public List<Account> listRemainedbeneficiaries(Account ac);
	
	public List<Account> listBeneficiary(Account ac);
	
}
