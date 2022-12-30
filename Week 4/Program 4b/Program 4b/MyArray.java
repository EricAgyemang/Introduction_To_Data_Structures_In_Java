/**
 * 
 */
package program4;

import java.util.ArrayList;

/**
 * @author eagye
 *
 */
public class MyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		students.add("Noel");
		students.add("Alex");
		students.add("Mark");
		students.add("Victoria");
		students.add("Sophia");
		students.add("Elijah");
	    students.forEach((s)->System.out.println(s.length()));
}
}