package exp02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {

	public static void main(String[] args) {
		
		Queue<String> names = new LinkedList<>();
		
		names.offer("Jonathan");
		names.offer("Dustin");
		names.offer("Robin");
		names.offer("Debbie");
		names.offer("Rich");
		
		//print out the queue
		System.out.println("The queue is: " + names.toString());
		
		//stores "Jonathan" in first without changing names
		//E peek(): Returns the entry at the front of the queue without removing it; 
		//returns null if the queue is empty
		String first = names.peek();
		System.out.println("\nGet the entry at the front of the queue using "
				+ "method peek(): " + first);
		
		//E element(): Returns the entry at the front of the queue without removing it. 
		//If the queue is empty, throws a NoSuchElementException
		System.out.println("Get the entry at the front of the queue using method "
				+ "element(): " + names.element());
		
		System.out.println("\nThe queue after peed and "
				+ "element operations: " + names.toString());
		
		//removes "Jonathan" from names and stores a reference to it in temp. 
		//The queue names now contains four elements and is shown in Figure 4.8(b)		
		//E remove(): Removes the entry at the front of the queue and returns it 
		//if the queue is not empty. 
		//If the queue is empty, throws a NoSuchElementException
		System.out.println("\nRemove the front entry " + names.remove() + " from the queue");
		System.out.println("The updated queue: " + names.toString());
		
		//E poll() Removes the entry at the front of the queue and returns it; 
		//returns null if the queue is empty
		System.out.println("\nPoll the front entry " + names.poll() + " from the queue");
		System.out.println("The updated queue: " + names.toString());
		
		//adds "Philip" to the rear of the queue; 
		//the queue names now contains four elements and is shown in Figure 4.8(c).
		//names.offer("Philip");
		names.add("Philip");
		System.out.println("The updated queue after adding \"Philip\" to the rear of "
				+ "the queue; : " + names.toString());

	}
}
