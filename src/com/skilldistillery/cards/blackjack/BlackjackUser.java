package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackUser {

	private List<Card> userHand = new ArrayList<>();
	
	public BlackjackUser() {}
	
	public void addCard(Deck deck) {
		deck.shuffle();
		userHand.add(deck.dealCard());
	}
	
	public List<Card> getHand() {
		return this.userHand;
	}
	
	public int allCardsValue() {
		int sum = 0;
		
		for (Card card : userHand) {
			sum += card.getValue();
		}
		
		return sum;
	}
	
	public void emptyHand() {
		userHand.clear();
	}
	
	
	
	
}
