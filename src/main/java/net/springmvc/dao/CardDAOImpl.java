package net.springmvc.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.springmvc.entity.Card;

@Repository
@Transactional
public class CardDAOImpl implements CardDAO {

	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Card> getCards() {
		Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Card > cq = cb.createQuery(Card.class);
        Root < Card > root = cq.from(Card.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
	}

	@Override
	public void saveCard(Card theCard) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theCard);
		
	}

}
