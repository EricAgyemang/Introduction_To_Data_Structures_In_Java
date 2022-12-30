package eagyem2ilstu;

//This is the hand class that positions the hands of each player
public class Hand {

	// We declare an attribute for the cards in a linked list
	private SingleLinkedList cards; 

	// Default constructor for the hand class
	public Hand() {
		cards = new SingleLinkedList(); // A singly linked list of cards
	}

	// The addCard method is defined her to add card to the game
	public void addCard(Card card) {
		cards.add(card);
	}

	// The play card method is defined here
	public Card playCard() {
		Card cardToPlay = (Card) cards.removeFirst();
		return cardToPlay;
	}

	// The get size method is defined here
	public int getSize() {
		return cards.size;
	}

	// We display the output by defining the display method
	public void display() {
		String[][] tempArray = new String[10][4];
		int k = 1;

		// Populate with cards
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 4; j++) {
				if (cards.getNode(k) != null) {
					tempArray[i][j] = cards.getNode(k).data.toString();
					k++;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			if (tempArray[i][0] != null) {
				for (int j = 0; j < 4; j++) {
					if (tempArray[i][j] != null) {
						System.out.print(String.format("%3s", tempArray[i][j]));
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}