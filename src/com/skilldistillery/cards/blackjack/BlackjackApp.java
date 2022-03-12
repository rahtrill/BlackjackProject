package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackApp {

	Scanner kb = new Scanner(System.in);
	Deck deck = new Deck();

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

			deck.shuffle();
			dealerHand.add(deck.dealCard());
			deck.shuffle();
			dealerHand.add(deck.dealCard());

			deck.shuffle();
			userHand.add(deck.dealCard());
			deck.shuffle();
			userHand.add(deck.dealCard());


			BlackjackApp BA = new BlackjackApp();
			String dealerShows = ("Dealer hand: \n" + dealerHand.get(0) + " & [UNKNOWN CARD]");
			userHand = BA.userCards(userHand, dealerShows);
			dealerHand = BA.dealerCards(dealerHand);
			
			BA.compareCards(userHand, dealerHand);
			
			isPlaying = false;

		}

	}
	
	public List<Card> userCards(List<Card> cards, String dealer) {
		
		BlackjackApp BA = new BlackjackApp();
		int value = BA.getAllCardsValue(cards);
		
		loop: while (value < 21) {
			
			System.out.println(dealer);
			System.out.println();
			System.out.println("Your hand: ");
			System.out.println(cards);
			System.out.println("Value = " + value);
			System.out.println();
			System.out.println("Would you like to hit or stand?");
			System.out.println("1. Hit");
			System.out.println("2. Stand");
			int answer = kb.nextInt();
			
			switch (answer) {
			
			case 1:
				
				deck.shuffle();
				cards.add(deck.dealCard());
				break;
				
			case 2:
				
				break loop;
				
			default:
				
				System.out.println("Input not valid!");
				break;
				
			}
		
			value = BA.getAllCardsValue(cards);
		}
		
		return cards;
	}
	
	public List<Card> dealerCards(List<Card> cards) {
		
		BlackjackApp BA = new BlackjackApp();
		int value = BA.getAllCardsValue(cards);
		
		while (value < 21) {
			if (value >= 17) {
				break;
			} else if (value < 17) {
				deck.shuffle();
				cards.add(deck.dealCard());
			}
			value = BA.getAllCardsValue(cards);
		}
		
		return cards;
	}
	
	public int getAllCardsValue(List<Card> cards) {
		
		int sum = 0;
		
		for (Card card : cards) {
			sum += card.getValue();
		}
		
		return sum;
	}
	
	public void compareCards(List<Card> user, List<Card> dealer) {
		BlackjackApp BA = new BlackjackApp();
		
		if (BA.getAllCardsValue(user) > 21) {
			
			BA.showHands(user, dealer);
			System.out.println("You lost!");
			System.out.println();
			
		} else if (BA.getAllCardsValue(user) == 21) {
			
			BA.showHands(user, dealer);
			System.out.println("You won!");
			System.out.println();
			
		} else if (BA.getAllCardsValue(dealer) > 21) {
			
			BA.showHands(user, dealer);
			System.out.println("You won!");
			System.out.println();
		
		} else if (BA.getAllCardsValue(dealer) == 21) {
			
			BA.showHands(user, dealer);
			System.out.println("You lost!");
			System.out.println();
		
		} else if (BA.getAllCardsValue(user) > BA.getAllCardsValue(dealer)) {
			
			BA.showHands(user, dealer);
			System.out.println("You won!");
			System.out.println();
			
		} else if (BA.getAllCardsValue(dealer) > BA.getAllCardsValue(user)) {
			
			BA.showHands(user, dealer);
			System.out.println("You lost!");
			System.out.println();
		
		} else if (BA.getAllCardsValue(dealer) == BA.getAllCardsValue(user)) {
			
			BA.showHands(user, dealer);
			System.out.println("Push!");
			System.out.println();
		
		}
		
	}
	
	public void showHands(List<Card> user, List<Card> dealer) {
		BlackjackApp BA = new BlackjackApp();
		
		System.out.println("Dealer hand: " + dealer);
		System.out.println("Dealer hand value = " + BA.getAllCardsValue(dealer));
		System.out.println();
		System.out.println("Your hand: " + user);
		System.out.println("Hand value = " + BA.getAllCardsValue(user));
		System.out.println();
	}

}
