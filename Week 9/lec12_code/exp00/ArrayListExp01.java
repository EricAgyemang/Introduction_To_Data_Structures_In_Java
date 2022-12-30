package exp00;
//import java.io.*;
import java.util.*;

public class ArrayListExp01 {

	public static void main(String[] args) {
		// Size of the ArrayList
		int n = 9;

		// Declaring the ArrayList with initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);

		// Appending new elements at the end of the list
		arrli.add(2);
		arrli.add(4);
		arrli.add(5);
		arrli.add(6);
		arrli.add(11);	
		
		// Printing elements
		System.out.println(arrli);

		// Remove element at index 3
		arrli.remove(3);

		// Displaying the ArrayList after deletion
		System.out.println(arrli);

		// Printing elements one by one
		System.out.print("Navigation of the array list: ");
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}

}
