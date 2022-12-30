package eagyem2ilstu;

//This is the card class that stores the details of the cards we are using in this program
public class Card {

// The suit containing 10 Heart, 10 Spades. 10 Clubs and 10 Diamonds are declared
	private int suitType;
	private int cardNum;

	// We declare a default constructors here
	public Card() {
	}

	// We declare a constructor for the suit and the card numbers
	public Card(int suitType, int cardNum) {
		this.suitType = suitType;
		this.cardNum = cardNum;
	}

	// This is a getter for the suit type
	public int getSuitType() {
		return this.suitType;
	}

	// This is a getter for the card numbers on the face of the cards
	public int getCardNum() {
		return this.cardNum;
	}

	// This is a setter for the suit type
	public void setSuitType(int suit) {
		this.suitType = suit;
	}

	// This is a setter for the card numbers
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	// This is a getName method that returns the suit name of the cards
	public String getName() {
		String suitName = "";

		// We want to convert integer value to name of face value as String of the cards
		if (this.cardNum == 1) {
			suitName = "A";
			// now we code the else statement to cover the cards 2 through 10 for the rest
			// of a particular card suit type making 40 cards
		} else {
			suitName = Integer.toString(cardNum);
		}
		// We want to convert integer suit to name of suit as String
		if (suitType == 1) {
			// This is for clubs
			suitName += (char) '\u2663';

		} else if (suitType == 2) {
			// This is for diamonds
			suitName += (char) '\u2666';
		} else if (suitType == 3) {
			// This is for hearts
			suitName += (char) '\u2764';
		} else if (suitType == 4) {
			// This is for spades
			suitName += (char) '\u2660';
		}
		return suitName;
	}

	// The to string method to help us display the output
	public String toString() {
		return getName();
	}
}