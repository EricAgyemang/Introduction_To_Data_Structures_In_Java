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
public class ReadingDataIntoAnArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);
    
    double [] cellBills = new double [6];
  
	int maxIndex = 0;
	int minIndex=0;
    for (int i = 0; i < cellBills.length; i++) {
        System.out.println("Enter a bill for the month of "+ (i+1)+ "\n");
    	cellBills[i] = scan.nextDouble();
    
   
    for(int j = 1; j< cellBills.length; j++) {
       if(cellBills[i]> cellBills[maxIndex])
    		        maxIndex=j;
    }
    
    for(int u=1; u<cellBills.length; u++) {
    	if(cellBills[u]<cellBills[minIndex])
    		  minIndex=u;
    	
    }
	}
 scan.close();
 NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
 System.out.println("\nThe minimum bills is: " + priceFormat.format(cellBills[minIndex]) + ", was found at index " + (minIndex+1));
 System.out.println("\nThe highest bills is: " + priceFormat.format(cellBills[maxIndex]) + ", was found at index " + (maxIndex+1));

	}	
}
