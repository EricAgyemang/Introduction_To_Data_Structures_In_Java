/**
 * 
 */
package ilstu.edu.it179;

import java.util.Scanner;

/**
 * @author eagyem2
 * 
 *         This the polynomial tester class
 */

public class PolynomialTester {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	/*
	 * The main method is declared as main
	 **/
	public static void main(String[] args) {
		// Create instances of polynomial and call them with input parameters entered
		Polynomial p1 = new Polynomial();
		p1.addTerm(4, 3);
		p1.addTerm(2, 1);
		p1.addTerm(-7, 0);

		Polynomial p2 = new Polynomial();
		p2.addTerm(-10, 4);
		p2.addTerm(2, 3);
		p2.addTerm(-2, 1);
		p2.addTerm(3, 0);
		Polynomial p11 = p1.polyAdd(p2);

		// print out the output
		System.out.println("\nPlease enter your first polynomial: " + p1 + "\nPlease enter your second polynomial: "
				+ p2 + "\nThe sum is:" + p11);

		// User the scanner object to take input from a user
		Scanner input = new Scanner(System.in);

		// Tell the user to make a choice to decide what the program should do?
		System.out.println("Would you like to add two more polynomials?");
		String choice = input.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			Polynomial p3 = new Polynomial();
			// Add coefficients and exponents to the tems
			p3.addTerm(-6, 3);
			p3.addTerm(5, 2);
			p3.addTerm(4, 0);
			// Add coefficients and exponents to the tems
			Polynomial p4 = new Polynomial();
			p4.addTerm(2, 3);
			p4.addTerm(-7, 2);
			p4.addTerm(3, 1);
			p4.addTerm(-4, 0);

			Polynomial p12 = p3.polyAdd(p4);
			System.out.println("\nPlease enter your first polynomial: " + p3 + "\nPlease enter your second polynomial: "
					+ p4 + "\nThe sum is:" + p12);

		} else if (choice.equalsIgnoreCase("n")) {
			System.out.println("Thank you for using the Polynomial Addition Program.");
		} else {
			System.out.println("Invalid input. Choose y to input a polynomial and n to quit: ");
		}

		// Tell the user to make a choice to decide what the program should do?
		System.out.println("Would you like to add two more polynomials?");
		String choice2 = input.nextLine();

		if (choice2.equalsIgnoreCase("y")) {
			// Add coefficients and exponents to the tems
			Polynomial p5 = new Polynomial();
			p5.addTerm(-1, 3);
			p5.addTerm(5, 2);
			p5.addTerm(6, 0);
			// Add coefficients and exponents to the tems
			Polynomial p6 = new Polynomial();
			p6.addTerm(2, 3);
			p6.addTerm(-7, 2);
			p6.addTerm(3, 1);
			p6.addTerm(-4, 0);

			Polynomial p13 = p5.polyAdd(p6);
			System.out.println("\nPlease enter your first polynomial: " + p5 + "\nPlease enter your second polynomial: "
					+ p6 + "\nThe sum is:" + p13);

		} else if (choice2.equalsIgnoreCase("n")) {
			System.out.println("Thank you for using the Polynomial Addition Program.");
		} else {
			System.out.println("Invalid input. Choose y to input a polynomial and n to quit: ");
		}

		// Tell the user to make a choice to decide what the program should do?
		System.out.println("Would you like to add two more polynomials?");
		String choice3 = input.nextLine();

		if (choice3.equalsIgnoreCase("y")) {

			Polynomial p7 = new Polynomial();
			// Add coefficients and exponents to the tems
			p7.addTerm(-6, 3);
			p7.addTerm(2, 1);
			p7.addTerm(8, 0);
			// Add coefficients and exponents to the tems
			Polynomial p8 = new Polynomial();
			p8.addTerm(3, 3);
			p8.addTerm(-5, 2);
			p8.addTerm(6, 1);
			p8.addTerm(-5, 0);

			Polynomial p14 = p7.polyAdd(p8);
			System.out.println("\nPlease enter your first polynomial: " + p7 + "\nPlease enter your second polynomial: "
					+ p8 + "\nThe sum is:" + p14);

		} else if (choice3.equalsIgnoreCase("n")) {
			System.out.println("Thank you for using the Polynomial Addition Program.");
		} else {
			System.out.println("Invalid input. Choose y to input a polynomial and n to quit: ");
		}
		input.close();
	}

}
