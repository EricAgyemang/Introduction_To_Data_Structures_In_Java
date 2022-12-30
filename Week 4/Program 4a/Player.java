package eagyem2.ilstu.edu;

//This is the player class that has the player constructors, getter and setter.
public class Player {

	private Square position;

	private int playerNumber;

	public Player(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	/**
	 * @return the playerName
	 */
	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public Square getCurrentPosition() {
		return position;
	}

	public void moveTo(Square newPosition) {
		newPosition.movePlayer(this);
	}

	public void setCurrentPosition(Square newPosition) {
		position = newPosition;
	}
}
