package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackDealer extends BlackjackHand{
	
		
		public BlackjackDealer() {super();}
		
		public void addCard(Deck deck) {
			
			// Shuffles the deck and adds a card to the dealer's hand.
			
			deck.shuffle();
			super.addHand(deck.dealCard());
		}
		
		public List<Card> getHand() {
			return super.getHand();
		}
		
		public int allCardsValue() {
			
			// Gets the value of the dealer's hand.
			
			return super.getHandValue();
		}
		
		public void emptyHand() {
			
			// Removes everything from the user's hand.
			
			
			super.emptyHand();
		}
}
