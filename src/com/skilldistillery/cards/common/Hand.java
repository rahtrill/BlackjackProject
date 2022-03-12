package com.skilldistillery.cards.common;

import java.util.List;

public abstract class Hand {

	List<Card> cards;
	
	public Hand() {}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void clear() {
		for (Card card : cards) {
			cards.remove(card);
		}
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
	
}
