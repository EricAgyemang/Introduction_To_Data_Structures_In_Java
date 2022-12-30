package eagyem2ilstu.edu;

import java.util.*;

public class Player {

	private String playerName;
	private String heart;
	private String spade;
	private String club;
	private String diamond;
	
	LinkedList<String>cardHoldsByPlayer = new LinkedList<String>();
	
/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}


	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName, String heart,String spade, String club, String diamond) {
		this.playerName = playerName;
		this.heart=heart;
		this.spade=spade;
		this.club=club;
		this.diamond=diamond;
		
	}

    public void whichToDraw() {
    	
    }

}
