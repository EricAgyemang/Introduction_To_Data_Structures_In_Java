/**
 * 
 */
package eagyem2.it179;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author itstudent
 *
 */
public class ReadingDataIntoAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);
    
    double [] cellBills = new double [6];
    
    double totalBills = 0.0;
    
    for (int i = 0; i < cellBills.length; i++) {

    	System.out.println("Enter bill amount for month " + (i+1) + "\t");
    	
    	cellBills[i] = scan.nextDouble();
    	
    	totalBills += cellBills[i]; 
    }
    scan.close();
NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
System.out.println("\nTotal for the bills: " + priceFormat.format(totalBills));
	}

}
