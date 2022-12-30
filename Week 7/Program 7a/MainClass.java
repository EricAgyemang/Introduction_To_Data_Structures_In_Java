package ericagyem;

import java.util.*;

public class MainClass {

	   public static void main(String[] args) {
	       final int limit = 100;
	       Scanner sc = new Scanner(System.in);
	       String choice;
	      
	       Player player1 = new Player("Eric");
	       Player player2 = new Player("Manu");
	 
	       Game deck = new Game();
	      
	       System.out.println("This is the War Simulator.");
	       while(true)
	       {
	           deck.resetDeck();
	           player1.cards.clear();
	           player2.cards.clear();
	     
	           for(int i = 0; i < 5; i++)
	           {
	               player1.cards.offer(deck.shuffleCards());
	               player2.cards.offer(deck.shuffleCards());
	               
	           }
	                      
	           System.out.println("Dealing cards");
	           int count = 0;
	           int card1, card2;
	           while(count < limit)
	           {
	               card1 = player1.cards.poll();
	               card2 = player2.cards.poll();
	             
	               
	               System.out.println("Eric dropped " + card1);
	               System.out.println("Manu dropped " + card2);
	             
	               if(card1 > card2)
	               {
	                   System.out.println("Eric won and took " + card2);
	                   player1.cards.offer(card1);
	                   player1.cards.offer(card2);
	            
	               }
	               else if(card2 > card1) 
	               {
	                   System.out.println("Manu won and took " + card1);
	                   player2.cards.add(card1);
	                   player2.cards.add(card2);
	               
	               }
	               System.out.println("Eric has " + player1.cards.size() + " cards");
	               System.out.println("Manu has " + player2.cards.size() + " cards");
	              
	          
	               if(player1.cards.size() == 0)
	               {
	                   System.out.println("Manu wins!");
	                   break;
	               }
	               if(player2.cards.size() == 0)
	               {
	                   System.out.println("Eric wins!");
	                   break;
	               }
	               count++;
	           }
	      
	           if(count == limit)
	           {
	               System.out.println("Turn limit has expired");
	               if(player1.cards.size() > (player2.cards.size()))
	               {
	                   System.out.println("Eric wins");
	               }
	               else if(player2.cards.size() > (player1.cards.size()))
	               {
	                   System.out.println("Manu wins");
	               }
	               
	               else
	               {
	                   System.out.println("Draw");
	               }
	           }
	      
	           System.out.println("Run the simulation again? Yes or no?");
	           choice = sc.next();
	           if(!choice.equalsIgnoreCase("yes"))
	           {
	               System.out.println("Good Bye!");
	               break;
	           }
	           else
	           {
	               System.out.println("I'm going to assume that was a yes");
	           }
	       }
	       sc.close();
	   }

	}