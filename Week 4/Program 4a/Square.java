package eagyem2.ilstu.edu;

//This is a class of Square
public class Square {

//Declearing the square reference variables
	private Chutes prev = null;
	private ladder next = null;

	private Square square;
	private int position;
	private int destination;

	// declaring constructors, accessors and mutators
	public Square(int position) {
		setPosition(position);
	}

	public Square(Square type) {
		this.square = type;
	}

	public Square(Square type, int dest) {
		this.square = type;
		this.destination = dest;
	}

	public int getPosition() {
		return position;
	}

	public int getDestination() {
		return destination;

	}

	public void setType(Square type) {
		this.square = type;
	}

	private void setPosition(int position) {
		this.position = position;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	// we may want to add a snake head
	void addSnake(Chutes s) {
		prev = s;
	}

	// or add the foot of a ladder
	public void addLadder(ladder l) {
		next = l;
	}

	// methods to find out if the square has a snake or a ladder
	private boolean hasSnake() {
		return null != prev;
	}

	private boolean hasLadder() {
		return null != next;
	}

	public void movePlayer(Player counter) {
		counter.setCurrentPosition(this);
		if (hasSnake()) {
			prev.movePlayerPiece(counter);
		}
		if (hasLadder()) {
			next.movePlayerPiece(counter);
		}
	}

	public Square getType() {
		return square;
	}
}
