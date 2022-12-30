package eagyem2ilstu;

import java.util.*;

//This is the Game class that has a linked list of unShuffled deck, a faced down and up cards 
public class Game {
	LinkedList<String> unShuffledDeck = new LinkedList<>();
	Stack<String> facedDownCards = new Stack<>();
	Stack<String> facedUpCards = new Stack<>();

	// Default constructor
	public Game(boolean startShuffled) {
		deck = new Card[41];
		for (int i = 1; i <= 10; i++) {
			// First 10 cards for clubs
			deck[i] = new Card(1, i);
			// Second 10 cards for diamonds
			deck[i + 10] = new Card(2, i);
			// Third 10 cards for hearts
			deck[i + 20] = new Card(3, i);
			// Fourth 10 cards for spades
			deck[i + 30] = new Card(4, i);
		}
		// Set next to 1 since first card is in index 1
		next = 1;
		if (startShuffled == true) {
			shuffle();
		}
	}

	// We shuffle the cards using the Method shuffle
	public void shuffle() {
		Random randomNumber = new Random();
		for (int i = 1; i <= 40; i++) {
			int rand = randomNumber.nextInt(40) + 1;
			// Swap cards in the deck
			Card temp = deck[i];
			// Card from random position
			deck[i] = deck[rand];
			deck[rand] = temp;
		}
		// Reset the next
		next = 1;
	}

	// We can deal with one card at a time
	public Card deal() {
		// If deck is depleted we shuffle
		if (next > 40)
			shuffle();
		Card c = deck[next];
		next++;
		return c;
	}

	// Holds position of next card to be dealt with
	private Card deck[];
	private int next;
}