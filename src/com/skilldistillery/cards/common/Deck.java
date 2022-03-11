package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<>();
	
	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
}
