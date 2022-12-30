package eagyem2ilstu.edu;

import java.util.*;

public class Game<E> {
	
	
	
	LinkedList<String>deck= new LinkedList<>();
	
	Stack<String>facedDownCards = new Stack<>();
	
	Stack<String>facedUpCards = new Stack<>();

    Queue<String>player = new LinkedList<>();
    
    public Game(String playerName1) {

    }
    
    public Game() {
    	player.add("Player1");
    	player.add("Player 2");
    	player.add("Player 3");
    	player.add("Player 4");
    	player.add("Player 5");
    }
    
    public void createDeck() {
    	deck.add("1 Heart");
    	deck.add("2 Heart");
    	deck.add("3 Heart");
    	deck.add("4 Heart");
    	deck.add("5 Heart");
    	deck.add("6 Heart");
    	deck.add("7 Heart");
    	deck.add("8 Heart");
    	deck.add("9 Heart");
    	deck.add("10 Heart");
    	
    	deck.add("1 Spade");
    	deck.add("2 Spade");
    	deck.add("3 Spade");
    	deck.add("4 Spade");
    	deck.add("5 Spade");
    	deck.add("6 Spade");
    	deck.add("7 Spade");
    	deck.add("8 Spade");
    	deck.add("9 Spade");
    	deck.add("10 Spade");
    	
    	deck.add("1 Club");
    	deck.add("2 Club");
    	deck.add("3 Club");
    	deck.add("4 Club");
    	deck.add("5 Club");
    	deck.add("6 Club");
    	deck.add("7 Club");
    	deck.add("8 Club");
    	deck.add("9 Club");
    	deck.add("10 Club");
    	
    	deck.add("1 Diamond");
    	deck.add("2 Diamond");
    	deck.add("3 Diamond");
    	deck.add("4 Diamond");
    	deck.add("5 Diamond");
    	deck.add("6 Diamond");
    	deck.add("7 Diamond");
    	deck.add("8 Diamond");
    	deck.add("9 Diamond");
    	deck.add("10 Diamond");
    	
    }
    
    public void shuffle() {
		deck.addAll(facedDownCards);
    }
	

	


}
