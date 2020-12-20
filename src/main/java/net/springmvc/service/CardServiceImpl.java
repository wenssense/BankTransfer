package net.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.springmvc.dao.CardDAO;
import net.springmvc.entity.Card;



@Service
public class CardServiceImpl implements CardService {
	
	@Autowired
	private CardDAO cardDAO;
	
	@Override
	public List<Card> getCards() {
		return cardDAO.getCards();
	}

	@Override
	public void saveCard(Card theCard) {
		cardDAO.saveCard(theCard);
	}
}
