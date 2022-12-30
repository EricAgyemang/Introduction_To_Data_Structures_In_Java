/**
 * 
 */
package ClassTrial;

/**
 * @author itstudent
 *
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeFinderTester {

	/**
	 * @param args
	 */
	//public static void main(String[] args) {

	    public PalindromeFinderTester() {
	    	
	    }
	    

	    @Test	
		public void singleCharacterIsAlwaysAPalindrome() {
			assertTrue(PalindromeFinder.isPalindrome("x"));
		}
		
	    @Test
		public void singleWordPalindrome() {
			assertTrue(PalindromeFinder.isPalindrome("kayak"));
		}
	    }
	


