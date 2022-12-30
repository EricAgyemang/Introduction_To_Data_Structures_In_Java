package ericagyem;

	import java.util.*;

	public class Game {
		   
		Queue<Integer> deck = new PriorityQueue<Integer>();
		  
		   public int shuffleCards(){
		       int num;
		       while(true)
		       {
		           num = 0 + (int)(Math.random() * ((9 - 0) + 1));
		           if(deck.contains(num))
		           {
		               deck.remove(num);
		               break;
		           }
		       }
		       return num;
		   }
		  
		   public void resetDeck()
		   {
		       for(int i = 0; i < 10; i++)
		       {
		           deck.add(i);
		       }
		   }
		}