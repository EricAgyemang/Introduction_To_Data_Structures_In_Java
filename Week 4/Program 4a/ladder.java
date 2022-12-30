package eagyem2.ilstu.edu;

//Thsis is a class of ladder to determin when the player moves down or up the ladder
public class ladder {
	private Square head;

	// Constructor for the ladder
	public ladder(Square top, Square foot) {
		setTop(top);
		foot.addLadder(this);

	}

//Set the top of the ladder for the player to move down when the top point is reached
	private void setTop(Square top) {
		this.head = top;
	}

	private Square getTop() {
		return head;
	}

	// The move method is declared here
	public void movePlayerPiece(Player counter) {
		System.out.println("Up the ladder to " + getTop().getPosition());
		counter.setCurrentPosition(getTop());
	}
}
