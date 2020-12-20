package net.springmvc.service;

import java.util.List;

import net.springmvc.entity.Account;
import net.springmvc.entity.MoneyTransfer_History;

public interface AccountService {
	
	public List < Account > getAccounts();

    public void saveAccount(Account theAccount);
    
    public List<Account> listAaccountExecptLoggedUser(Account ac);
    
    public Account loadAccount(int id);
    
    public List<MoneyTransfer_History> listMoneyTransferForUser(int loggedUser);
    
    public void saveMoneyTransfer(MoneyTransfer_History money);
}
