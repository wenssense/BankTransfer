package net.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.springmvc.dao.CustomerDAO;
import net.springmvc.entity.Account;
import net.springmvc.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);
	}

	@Override
	@Transactional
	public List<Account> listRemainedbeneficiaries(Account ac) {
		return customerDAO.listRemainedbeneficiaries(ac);
	}

	@Override
	@Transactional
	public List<Account> listBeneficiary(Account ac) {
		// TODO Auto-generated method stub
		return customerDAO.listBeneficiary(ac);
	}
}





