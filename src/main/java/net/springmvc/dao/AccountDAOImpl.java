package net.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.springmvc.entity.Account;
import net.springmvc.entity.Customer;
import net.springmvc.entity.MoneyTransfer_History;

@Repository
@Transactional
public class AccountDAOImpl implements AccountDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Account> getAccounts() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Account> cq = cb.createQuery(Account.class);
		Root<Account> root = cq.from(Account.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void saveAccount(Account theAccount) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theAccount);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Account> listAaccountExecptLoggedUser(Account ac) {
		Session currentSession = sessionFactory.getCurrentSession();
		/*
		 * Criteria cr = currentSession.createCriteria(Customer.class);
		 * cr.add(Restrictions.eq("user_id", ac.getId())); List<Customer> ll =
		 * cr.list();
		 */
		String hql = "FROM Account E WHERE E.aadhar <>" + ac.getAadhar();
		Query query = currentSession.createQuery(hql);
		List<Account> results = (ArrayList<Account>) query.getResultList();
		return results;
	}

	@Override
	@Transactional
	public Account loadAccount(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Account account = currentSession.get(Account.class, id);
		return account;
	}

	@Override
	@SuppressWarnings({"deprecation","unchecked"})
	public List<MoneyTransfer_History> listMoneyTransferForUser(int loggedUser) {
		Session currentSession = sessionFactory.getCurrentSession();
		Criteria cr = currentSession.createCriteria(MoneyTransfer_History.class);
		List<MoneyTransfer_History> ll = (ArrayList<MoneyTransfer_History>) cr
				.add(Restrictions.eq("fromUserId", loggedUser)).list();
		return ll;
	}

	@Override
	public void saveMoneyTransfer(MoneyTransfer_History money) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(money);
		
	}

}
