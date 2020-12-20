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

import net.springmvc.entity.Account;
import net.springmvc.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
		Root<Customer> root = cq.from(Customer.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer book = session.byId(Customer.class).load(id);
		session.delete(book);
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Customer.class, theId);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Account> listRemainedbeneficiaries(Account ac) {
		Session currentSession = sessionFactory.getCurrentSession();
		Criteria cr = currentSession.createCriteria(Customer.class);
		List<Customer> ll =(ArrayList<Customer>) cr.add(Restrictions.eq("user_id", ac.getId())).list();
		Criteria crr = currentSession.createCriteria(Account.class);
		crr.add(Restrictions.ne("aadhar", ac.getAadhar()));
		List<Account> listAccount =(ArrayList<Account>) crr.list();
		for (Customer cust : ll) {
			Account accc = currentSession.get(Account.class, cust.getBen_id());
			listAccount.remove(accc);
		}
		System.out.println("beneficiaries "+listAccount.size());
		return listAccount;
	}

	@Override
	public List<Account> listBeneficiary(Account ac) {
		Session currentSession = sessionFactory.getCurrentSession();
		Criteria cr = currentSession.createCriteria(Customer.class);
		List<Customer> ll =(ArrayList<Customer>) cr.add(Restrictions.eq("user_id", ac.getId())).list();
		List<Account> listBene = new ArrayList<>();
		for (Customer cust : ll) {
			Account accc = currentSession.get(Account.class, cust.getBen_id());
			listBene.add(accc);
		}
		return listBene;
	}
}
