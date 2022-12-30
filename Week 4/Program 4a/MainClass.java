package eagyem2.ilstu.edu;

import java.util.*;

//This is a class of main that ask for a player number and runs the game
public class MainClass {

	Game board = new Game();

	// This is the play method that prompts the user to enter the key R to roll the
	// diece
	public void play() {

		System.out.println("Welcome to the Chutes and Ladders Game! ");

		// We intantiant the array list of player object
		List<Player> players = new ArrayList<>();
		System.out.println("How many players are playing now?\n ");

		Scanner scanner = new Scanner(System.in);
		int numOfPlayers = scanner.nextInt();
		for (int i = 0; i < numOfPlayers; i++) {
			System.out.println("Enter player number: " + i);

			int playerNumber = scanner.nextInt();
			Player player = new Player(playerNumber);
			players.add(player);
			player.setCurrentPosition(board.getStartSquare());

			// We start the game
			System.out.println("Lest's Play!\n ");

			String choice = "";
			// A so while loop to check the condition of the player want to quit or continue
			// to play
			do {

				System.out.println("R = Roll the dice, Q = quit from the game");
				int counter = 0;

				if (counter >= numOfPlayers)
					counter = 0;

				Player currPlayer = players.get(counter);

				System.out.println("Player " + currPlayer.getPlayerNumber() + " turns to play!");

				choice = scanner.next();
				if (choice.equalsIgnoreCase("R")) {
					Random randomNumberGenerator = new Random();
					int places = randomNumberGenerator.nextInt(6) + 1;

					board.moveTo(currPlayer, places);
					counter++;
				}
			} while (!choice.equalsIgnoreCase("Q"));

		}
		// Close the scanner
		scanner.close();
	}

	// 'main' creates a 'SnakesAndLadders' object and
	// starts the game
	public static void main(String[] args) {
		MainClass myGame = new MainClass();

		myGame.play();

	}

}
