package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackApp {
	
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		
		BlackjackApp BA = new BlackjackApp();
		BA.launch();
		
	}
	
	public void launch() {
		
		boolean isPlaying = true;
		
		System.out.println("Welcome to the Blackjack game!");
		System.out.println();
		
		while (isPlaying) {
				
			List<Card> dealerHand = new ArrayList<>();
			List<Card> userHand = new ArrayList<>();
			Deck deck = new Deck();
			
			deck.shuffle();
			dealerHand.add(deck.dealCard());
			deck.shuffle();
			dealerHand.add(deck.dealCard());
			
			deck.shuffle();
			userHand.add(deck.dealCard());
			deck.shuffle();
			userHand.add(deck.dealCard());
		
		}
		
	}
	
}
