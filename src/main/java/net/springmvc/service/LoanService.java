package net.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.springmvc.dao.LoanDao;
import net.springmvc.entity.Loan;

@Service
public class LoanService 
{
	@Autowired
	private LoanDao loanDao;
	
	public void saveLoan(Loan theLoan) 
	{
		loanDao.saveLoan(theLoan);
	}
}
