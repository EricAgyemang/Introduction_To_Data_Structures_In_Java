package exp01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample02 {

	public static void main(String[] args) {
		 // Creating empty LinkedList 
        Queue<Integer> queue = new LinkedList<Integer>(); 
  
        // Adding items to the queue 
        // using add() 
        queue.add(10); 
        queue.add(20); 
        queue.add(15); 
        queue.add(25); 
        queue.add(9); 
        queue.add(5); 
  
        // Printing the top element of 
        // the LinkedList 
        System.out.println(queue); 
  
        // Printing the top element and removing it 
        // from the LinkedList container 
        System.out.println(queue.poll()); 
  
        // Printing the top element again 
        System.out.println(queue.peek()); 
        
        System.out.println("\n------------------------------");
        //access via Iterator
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()){
          Integer element = iterator.next();
          
          if (iterator.hasNext()) {
        	  System.out.printf("%d <= ", element);
          }
          else {
           	  System.out.printf("%d", element); 
          }
        }
	}
}
