package net.springmvc.dao;

import java.util.List;

import net.springmvc.entity.Card;

public interface CardDAO {
	
	public List < Card > getCards();

    public void saveCard(Card theCard);
}
