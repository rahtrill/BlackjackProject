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

Though instructed to craft this project in an Object Oriented Design, I decided to initially write this program procedural in the app class. This was to see if initially writing out my logic and conditions, followed by converting it to an Object Oriented Design later, would make it easier for me to create the program. I can now say that after completing this project, that approach was not the correct way of going about the program.

Creating the program in a procedural way, and then trying to convert it to an Object Oriented Design made it difficult to refer to and delete methods that were redundant in the program. It made creating the other classes extremely tedious. This sort of approach is definitely a bit backwards, and I will not be approaching any other Object Oriented Design program with this sort of method again.

It is best to map out what you're going to do with objects and their methods before trying to design the program's logic and conditionals.

## Technologies Used

There were many technologies used for this program. This includes the following:

- Inheritance.
- Abstract classes.
- Enums.
- Switch/case statements.
- Declarations for while loops.
- Try/catch.
- The Java utility, Scanner.
- List/ArrayList.
- Collections methods.
- For loops.
- If/else statements.

## What was the most difficult part of this project?

The most difficult part of this program was the conversion of the procedural code to the Object Oriented Design code. As stated in lessons learned, I will not be using this method to write out OOD code in the future. It is imperative to stick to the UML design of the program and write your logic around the design, rather than trying to craft the design after completing the sequence.
