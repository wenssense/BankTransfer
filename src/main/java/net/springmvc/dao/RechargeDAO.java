package net.springmvc.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import net.springmvc.entity.Recharge;

@Repository
@Transactional
@EnableTransactionManagement
public class RechargeDAO 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveRecharge(Recharge theRecharge) 
	{
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theRecharge);
	}
	
	public List<Recharge> getRecharge() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Recharge> cq = cb.createQuery(Recharge.class);
		Root<Recharge> root = cq.from(Recharge.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}
}
