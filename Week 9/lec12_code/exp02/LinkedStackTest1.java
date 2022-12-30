package exp02;

public class LinkedStackTest1 {

	public static void main(String[] args) {
		LinkedStack<Character> lnStack = new LinkedStack<Character>();
		
		lnStack.push('a');		
		lnStack.push('v');		
		lnStack.push('a');		
		lnStack.push('J');			
		
		System.out.println("Test peek method in "
				+ "LinkedStack class:");
		int i = 0;
		while (!lnStack.isEmpty()) {
			if (i == 3)
				break;			
			System.out.println(lnStack.peek());
			i++;
		}	
		
		System.out.println("\nTest pop method in "
				+ "LinkedStack class:");
		i = 0;
		while (!lnStack.isEmpty()) {
			if (i == 4)
				break;			
			System.out.println(lnStack.pop());
			i++;
		}	
		
		System.out.println("\nTest push method in "
				+ "LinkedStack class:");
		lnStack.push('e');	
		lnStack.push('W');
		
		char ch1 = lnStack.pop();
		char ch2 = lnStack.peek();
		
		System.out.print(ch1);
		System.out.print(ch2);
	}
}
