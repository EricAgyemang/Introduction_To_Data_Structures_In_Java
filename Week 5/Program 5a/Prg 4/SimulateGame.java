package eagyem2ilstu;
import java.util.*; 

//This is a class of Simulate Game
public class SimulateGame {

//Instance attributes of the class
	private static ArrayList<Card> table = new ArrayList<>();
	private static int roundsPlayed = 1;
	private static boolean gameOver = false;
	private static Game deck = new Game(true);
	private static Player playerOne = new Player("Bob");
	private static Player playerTwo = new Player("Alice");
	private static Player currentPlayer = playerOne;

	// Play the simple card game
	public static void playGame() {
		System.out.println("Starting simple card game simulation:");
		System.out.println();
		
		// This make us deal 4 cards to each player
		dealCards(); 
		
		// Choose who goes first
		chooseFirstPlayer(); 
		
		// Start the rounds
		playRounds(); 
		
		// Declare a winner
		declareWinner(); 
	}

	// Deal 4 cards to each hand in alternating order
	public static void dealCards() {
		for (int i = 0; i < 4; i++) {
			playerOne.takeCard(deck.deal());
			playerTwo.takeCard(deck.deal());
		}
	}

	// We choose which player goes first
	public static void chooseFirstPlayer() {
		Random random = new Random();
		int n = random.nextInt(2);
		// We want to make playerTwo the new playerOne
		if (n == 1) {
			Player temp = playerOne;
			playerOne = playerTwo;
			playerTwo = temp;
		}
	}

	// This method helps to set the rounds of the game
	public static void playRounds() {
		while (roundsPlayed <= 4 && (gameOver == false)) {
			// Display the round number
			System.out.println("ROUND " + roundsPlayed);
			System.out.println();

			// Display each player's hand
			displayHands();

			// Play individual round
			playRound();

			// Increment roundsPlayed counter
			roundsPlayed++;
		}
	}

	// Play the individual round
	public static void playRound() {
		boolean suitMatch = false;

		// Flag for notifying a suit match
		Card cardToPlay;
		if ((playerOne.handSize() == 20) || (playerTwo.handSize() == 20)) {
			gameOver = true;
		}
		while (suitMatch == false) {
			// Current player places card on table
			cardToPlay = currentPlayer.playCard();
			table.add(cardToPlay);

			// Check if there's a suit match
			suitMatch = checkSuitMatch();

			if (suitMatch == false)
				switchCurrentPlayer();
		}
		collectCards();
		System.out.println();
		// Sleep some seconds before beginning a new round
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
	}

	// Switch current player to the next player
	public static void switchCurrentPlayer() {
		if (currentPlayer == playerOne)
			currentPlayer = playerTwo;
		else if (currentPlayer == playerTwo)
			currentPlayer = playerOne;
	}

	// Check for a suit match of the game
	public static boolean checkSuitMatch() {
		int tableSize = table.size();
		int lastSuit;
		int topSuit;

		if (tableSize <= 2) {
			return false;
		} else {
			lastSuit = table.get(tableSize - 1).getSuitType();
			topSuit = table.get(tableSize - 1).getSuitType();
		}

		// Check suit equivalence of the game
		if (lastSuit == topSuit) {
			System.out.println();
			System.out.println(currentPlayer.getName() + " wins the round!");
			System.out.println();
			return true;
		}
		return false;
	}

	// This method makes a player takes cards from table
	public static void collectCards() {
		System.out.print(currentPlayer.getName() + " takes the table (" + table.size() + "): ");
		displayTable();

		// Player takes each card from the table and adds to hand
		for (int i = 0; i < table.size(); i++) {
			Card cardToTake = table.get(i);
			currentPlayer.takeCard(cardToTake);
		}
		table.clear();
	}

	// Displays all the cards currently on the table
	public static void displayTable() {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i) != null) {
				System.out.print(table.get(i).getCardNum() + " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	// Displays each player's current hand
	public static void displayHands() {
		playerOne.displayHand();
		playerTwo.displayHand();
	}

	// This method declares a winner of the game
	public static void declareWinner() {
		if (playerOne.handSize() == 20) {
			System.out.println(playerOne.getName().toUpperCase() + " WINS " + "WITH A TOTAL OF " + playerOne.handSize()
					+ " CARDS!");
		} else if (playerTwo.handSize() == 20) {
			System.out.println(playerTwo.getName().toUpperCase() + " WINS " + "WITH A TOTAL OF " + playerTwo.handSize()
					+ " CARDS!");
		} else {
			System.out.println("IT IS A TIE!");
		}

		System.out.println();
	}

	// Main method
	public static void main(String[] args) {
		playGame();
	}
}