package eagyem2ilstu;

import java.util.*;

//This is the class of player
public class Player {
	// We declare a queue of player
	Queue<String> player = new LinkedList<>();
	// We declare the attributes of the Player class
	private Hand hand;
	private String name;

	// Default constructor of the player class
	public Player(String name) {
		hand = new Hand(); // Instantiate new hand object
		this.name = name;
	}

	// This is the play card method
	public Card playCard() {
		Card c = hand.playCard();
		if (c != null) {
			System.out.println(" plays a " + c.getCardNum());
		}
		return c;
	}

	// This is the take card method that helps a player to take a card
	public void takeCard(Card card) {
		hand.addCard(card);
	}

	// This is the get name method
	public String getName() {
		return name;
	}

	// This method helps to display the hand of a player
	public void displayHand() {
		System.out.println(name + "\'s hand (" + hand.getSize() + "):");
		hand.display();
		System.out.println();
	}

//This method method calculate the sum of cards cards in the hand
	public int handSize() {
		return hand.getSize();
	}
}