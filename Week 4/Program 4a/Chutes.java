package eagyem2.ilstu.edu;

//This is a class of chutes to move down or up using the ladder
public class Chutes {
	private Square tail;

	public Chutes(Square head, Square tail) {
		setTail(tail);
		head.addSnake(this);
	}

	private void setTail(Square tail) {
		this.tail = tail;
	}

	private Square getTail() {
		return tail;
	}

	// The move methods
	public void movePlayerPiece(Player counter) {
		System.out.println("Down the snake to " + getTail().getPosition());
		counter.setCurrentPosition(getTail());
	}

}
