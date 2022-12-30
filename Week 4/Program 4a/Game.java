package eagyem2.ilstu.edu;

import java.util.*;

//This is the Game class
public class Game {
	private Square[] squares;

	static final int START_SQUARE = 1;
	static final int MAX_SQUARES = 100;

	// Array list of players
	List<Player> players = new ArrayList<>();

	// Player position
	Set<Integer> occupiedPositions = new HashSet<>();

	// Setter for player object
	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	// Arrary list of player object
	public List<Player> getPlayers() {
		return players;
	}

	// Add player object to the game
	public void addPlayers(Player player) {
		this.players.add(player);
	}

	// Constructor for the game class and we add ladder and chutes here
	public Game() {
		squares = new Square[START_SQUARE + MAX_SQUARES];
		for (int i = START_SQUARE; i <= MAX_SQUARES; i++) {
			// add the next Square object to the board
			squares[i] = new Square(i);
		}

		// add the ladders
		new ladder(squares[38], squares[1]);
		new ladder(squares[14], squares[4]);
		new ladder(squares[31], squares[9]);
		new ladder(squares[42], squares[21]);
		new ladder(squares[84], squares[28]);
		new ladder(squares[44], squares[36]);
		new ladder(squares[67], squares[51]);
		new ladder(squares[91], squares[71]);
		new ladder(squares[100], squares[80]);
		// add the chutes
		new Chutes(squares[16], squares[6]);
		new Chutes(squares[47], squares[26]);
		new Chutes(squares[49], squares[11]);
		new Chutes(squares[56], squares[53]);
		new Chutes(squares[62], squares[19]);
		new Chutes(squares[64], squares[60]);
		new Chutes(squares[87], squares[24]);
		new Chutes(squares[93], squares[73]);
		new Chutes(squares[95], squares[75]);
		new Chutes(squares[98], squares[78]);
	}

	// the constructor creates the squares and adds the
	public Square getStartSquare() {
		return squares[START_SQUARE];
	}

	// move method for the player
	public void moveTo(Player counter, int places) {
		Square current = counter.getCurrentPosition();
		int nextPosition = current.getPosition() + places;
		if (nextPosition > MAX_SQUARES) {
			System.out.println("That move cannot be made from your position! " + "Roll a different number next time");
		} else if (nextPosition < MAX_SQUARES) {
			counter.moveTo(squares[nextPosition]);
			System.out.println("Player " + counter.getPlayerNumber() + " counter on "
					+ counter.getCurrentPosition().getPosition());
		} else {

			System.out.println("Player " + counter.getPlayerNumber() + " wins the game on "
					+ counter.getCurrentPosition().getPosition());
		}
	}

}