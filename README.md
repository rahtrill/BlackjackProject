# Blackjack Project

## Description

This program is designed to let a user and a robot "dealer" play a game of Blackjack. It specifically uses Object Oriented Design to represent certain components of the game.

These are the parts of the game represented as objects in this program:

- The dealer.
- The user.
- The superclass that has the basic methods needed for the dealer and user's hands.
- The deck that the cards are pulled from and given to the user and dealer's hand.
- The card class that helps create the deck.
- The rank and suit classes that help create the card.

The actual function of the game is performed in the BlackjackApp. There, it sets the rules for the user's hand and their inputs, the dealer's hand and when they can hit or stand, and the comparison method to compare the two decks.

The rules are as follows:

- The dealer and user pull two cards from the deck at the beginning of the game.
- If either the dealer or the user pulls two cards that total to 21, the game ends and that person wins.
- If either the dealer or the user pulls two cards that total above 21, the game ends and that person loses.
- If the user pulls two cards and they are valued below 21, it will prompt them to hit or stand until the value is equal to or greater than 21.
- If the dealer pulls two cards and they are valued below 17, it will hit until the value is greater than 17, then it will stand.
- If at any point during a dealer's or user's hit, a new card is pulled and results in the card being 21 or above, the game will end.
- If both the user and dealer hit/stand and it comes to a comparison of the total value of their hands, the player with the most value will win.

Using a while loop, every input for both players is tracked to meet the given parameters above.

The user can continue to play the game until they decide to quit the program.

## Lessons Learned



## Technologies Used

## What was the most difficult part of this project?
