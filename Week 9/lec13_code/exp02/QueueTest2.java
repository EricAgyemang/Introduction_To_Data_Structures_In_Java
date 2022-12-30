package exp02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {
		
        // Create and initialize a Queue using a LinkedList
        Queue<Integer> waitingQueue = new LinkedList<>();

        // Adding new elements to the Queue (The Enqueue operation)
        waitingQueue.add(12);
        waitingQueue.add(5);
        waitingQueue.add(6);
        waitingQueue.add(56);
        waitingQueue.add(2);

        System.out.println("WaitingQueue : " + waitingQueue);

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        Integer number = waitingQueue.remove();
        System.out.println("Removed from WaitingQueue : " + number + 
        		" | New WaitingQueue : " + waitingQueue);

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null 
        // if the Queue is empty.
        number = waitingQueue.poll();
        System.out.println("Removed from WaitingQueue : " + number + 
        		" | New WaitingQueue : " + waitingQueue);

	}

}