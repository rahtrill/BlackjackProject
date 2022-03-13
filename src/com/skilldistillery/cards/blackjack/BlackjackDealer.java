package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackDealer {
	private List<Card> dealerHand = new ArrayList<>();
		
		public BlackjackDealer() {}
		
		public void addCard(Deck deck) {
			deck.shuffle();
			dealerHand.add(deck.dealCard());
		}
		
		public List<Card> getHand() {
			return this.dealerHand;
		}
		
		public int allCardsValue() {
			int sum = 0;
			
			for (Card card : dealerHand) {
				sum += card.getValue();
			}
			
			return sum;
		}
		
		public void emptyHand() {
			dealerHand.clear();
		}
}
