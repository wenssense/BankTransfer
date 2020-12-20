package net.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.springmvc.dao.AccountDAO;
import net.springmvc.entity.Account;
import net.springmvc.entity.MoneyTransfer_History;


@Service
public class AccountServiceImpl implements AccountService {
	
	
	@Autowired
	private AccountDAO accountDAO;

	@Override
	@Transactional
	public List<Account> getAccounts() {
		return accountDAO.getAccounts();
	}

	@Override
	public void saveAccount(Account theAccount) {
		accountDAO.saveAccount(theAccount);
		
	}

	@Override
	@Transactional
	public List<Account> listAaccountExecptLoggedUser(Account ac) {
		// TODO Auto-generated method stub
		return accountDAO.listAaccountExecptLoggedUser(ac);
	}

	@Override
	public Account loadAccount(int id) {
		// TODO Auto-generated method stub
		return accountDAO.loadAccount(id);
	}

	@Override
	@Transactional
	public List<MoneyTransfer_History> listMoneyTransferForUser(int loggedUser) {
		// TODO Auto-generated method stub
		return accountDAO.listMoneyTransferForUser(loggedUser);
	}

	@Override
	@Transactional
	public void saveMoneyTransfer(MoneyTransfer_History money) {
		// TODO Auto-generated method stub
		 accountDAO.saveMoneyTransfer(money);
	}

}
