package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand{
	
	private List<Card> hand = new ArrayList<>();
	
	public BlackjackHand() {
		super();
	}
	
	public int getHandValue() {
		
		// Gets current hand's value.
		
		int sum = 0;
		
		for (Card card : hand) {
			sum += card.getValue();
		}
		
		return sum;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void addHand(Card card) {
		hand.add(card);
	}
	
	public void emptyHand() {
		hand.clear();
	}

}
