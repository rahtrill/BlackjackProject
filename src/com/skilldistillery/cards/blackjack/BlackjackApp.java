package com.skilldistillery.cards.blackjack;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackApp {

	Scanner kb = new Scanner(System.in);
	Deck deck;
	BlackjackApp BA;
	BlackjackUser user = new BlackjackUser();
	BlackjackDealer dealer = new BlackjackDealer();

	public static void main(String[] args) {

		BlackjackApp BA = new BlackjackApp();
		BA.launch(BA);

	}

	public void launch(BlackjackApp mainBA) {
		
		BA = mainBA;

		boolean isPlaying = true;

		System.out.println("Welcome to the Blackjack game!");
		System.out.println();

		while (isPlaying) {
			
			deck = new Deck();

			dealer.addCard(deck);
			dealer.addCard(deck);

			user.addCard(deck);
			user.addCard(deck);
			
			List<Card> dealerHand = dealer.getHand();
			List<Card> userHand = user.getHand();

			String dealerShows = ("Dealer hand: \n" + dealerHand.get(0) + " & [UNKNOWN CARD]");
			userHand = BA.userCards(dealerShows);
			dealerHand = BA.dealerCards();
			
			BA.compareCards();
			
			System.out.println("=====================");
			System.out.println("= Continue playing? =");
			System.out.println("= 1. Yes            =");
			System.out.println("= 2. No             =");
			System.out.println("=====================");
			int answer = 0;
			try {
				answer = kb.nextInt();				
			} catch (InputMismatchException e) {
				System.err.println("Enter a valid number");
			}
			
			switch(answer) {
			
			case 1:
				
				System.out.println();
				System.out.println("Let's play again!");
				dealer.emptyHand();
				user.emptyHand();
				break;
				
			case 2:
				
				System.out.println("Thank you for playng!");
				isPlaying = false;
				break;
				
			default:
				
				System.out.println("Input invalid. Defaulting to playing again.");
				
			}
		}

	}
	
	public List<Card> userCards(String dealer) {
		
		int value = user.allCardsValue();
		
		loop: while (value < 21) {
			
			System.out.println("====================================");
			System.out.println(dealer);
			System.out.println("====================================");
			System.out.println();
			System.out.println("====================================");
			System.out.println("Your hand: ");
			System.out.println(user.getHand());
			System.out.println("Value = " + value);
			System.out.println("====================================");
			System.out.println();
			System.out.println("===================================");
			System.out.println("= Would you like to hit or stand? =");
			System.out.println("= 1. Hit                          =");
			System.out.println("= 2. Stand                        =");
			System.out.println("===================================");
			int answer = 0;
			try {
				answer = kb.nextInt();				
			} catch (InputMismatchException e) {
				System.err.println("Enter a valid number");
			}
			
			switch (answer) {
			
			case 1:
				
				user.addCard(deck);
				break;
				
			case 2:
				
				break loop;
				
			default:
				
				System.out.println("Input not valid!");
				break;
				
			}
		
			value = user.allCardsValue();
		}
		
		return user.getHand();
	}
	
	public List<Card> dealerCards() {
		
		int value = dealer.allCardsValue();
		
		while (value < 21) {
			if (value >= 17) {
				break;
			} else if (value < 17) {
				dealer.addCard(deck);
			}
			value = dealer.allCardsValue();
		}
		
		return dealer.getHand();
	}
	
	public void compareCards() {
		
		if (user.allCardsValue() > 21) {
			
			BA.showHands();
			System.out.println("You lost!");
			System.out.println();
			
		} else if (user.allCardsValue() == 21) {
			
			BA.showHands();
			System.out.println("You won!");
			System.out.println();
			
		} else if (dealer.allCardsValue() > 21) {
			
			BA.showHands();
			System.out.println("You won!");
			System.out.println();
		
		} else if (dealer.allCardsValue() == 21) {
			
			BA.showHands();
			System.out.println("You lost!");
			System.out.println();
		
		} else if (user.allCardsValue() > dealer.allCardsValue()) {
			
			BA.showHands();
			System.out.println("You won!");
			System.out.println();
			
		} else if (dealer.allCardsValue() > user.allCardsValue()) {
			
			BA.showHands();
			System.out.println("You lost!");
			System.out.println();
		
		} else if (dealer.allCardsValue() == user.allCardsValue()) {
			
			BA.showHands();
			System.out.println("Push!");
			System.out.println();
		
		}
		
	}
	
	public void showHands() {
		System.out.println("========================================");
		System.out.println("Dealer hand: " + dealer.getHand());
		System.out.println("Dealer hand value = " + dealer.allCardsValue());
		System.out.println("========================================");
		System.out.println();
		System.out.println("========================================");
		System.out.println("Your hand: " + user.getHand());
		System.out.println("Hand value = " + user.allCardsValue());
		System.out.println("========================================");
		System.out.println();
	}

}
