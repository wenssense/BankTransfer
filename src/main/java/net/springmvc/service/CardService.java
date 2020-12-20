package net.springmvc.service;

import java.util.List;

import net.springmvc.entity.Card;



public interface CardService {
	public List<Card> getCards();
	
	public void saveCard(Card theCard);
}
