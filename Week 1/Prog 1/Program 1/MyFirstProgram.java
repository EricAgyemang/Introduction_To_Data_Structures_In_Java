

import java.util.Scanner;

/**
 * @author
 * eagyem2
 *
 */
public class MyFirstProgram {
	/**
	 * @param args
	

    String patternString = "$0,000.00";
    DecimalFormat myFormat = new DecimalFormat(patternString);
    DecimalFormat  percFormat = new DecimalFormat("0.0%"); 
    DecimalFormat rptFormat = new DecimalFormat("#,##0.000");
    
    String money = myFormat.format(44.71734);
    System.out.println(money);
    
    System.out.println(percFormat.format(0.075));
    System.out.println(rptFormat.format(93.7158213));
     */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number (-1 to stop): ");
	    
	    int num = input.nextInt();
	    
	   int sum = 0;
	   while(num != -1) {
		   sum += num;
		   
		   System.out.println("Enter a number (-1 to stop): ");
		   num = input.nextInt();
	   }
       System.out.println("The sum is "+ sum);
       input.close();
       }
}
	
	
	
	
	
	
	          

