/**
 * 
 */
package ClassTrial;


import java.util.*;

/**
 * @author itstudent
 *
 */
public class PalindromeFinder {

	/**
	 * @param args
	 */
	
	private static Deque<Character> fillStack(String inputString){
		
		Deque<Character>charStack = new ArrayDeque<>();
		
		for(int i=0; i< inputString.length(); i++) {
			charStack.push(inputString.charAt(i));
		}
		return charStack;
	}
	
	
	private static String buildReverse(String inputString) {
		Deque<Character>charStack = fillStack(inputString);
		StringBuilder results = new StringBuilder();
		while(!charStack.isEmpty()) {
			results.append(charStack.pop());
		}
		return results.toString();
	}
	
	
	
	public static boolean isPalindrome(String inputString) {
		return inputString.equalsIgnoreCase(buildReverse(inputString));
		
	}

}
