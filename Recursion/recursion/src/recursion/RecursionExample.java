/**
 * 
 */
package recursion;

/**
 * @author eagyem2
 * This is an example of recursion 
 */
public class RecursionExample {

    public static long factorial (int num) {
    	if(num<=1) {
    		return 1;
    	}else {
    		return factorial (num-1)*num;
    	}
    }
    
	public static void main(String[] args) {
	   long ans = factorial(9);
	   System.out.println(ans);
	}

}
