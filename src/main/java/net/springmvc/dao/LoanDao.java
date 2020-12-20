package net.springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import net.springmvc.entity.Loan;

@Transactional
@Repository
@EnableTransactionManagement
public class LoanDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveLoan(Loan theLoan) 
	{
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theLoan);
	}
}
