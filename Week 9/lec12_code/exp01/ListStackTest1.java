package exp01;

public class ListStackTest1 {

	public static void main(String[] args) {
		ListStack<Character> lsStack = new ListStack<Character>();
		
		lsStack.push('a');
		lsStack.push('v');
		lsStack.push('a');
		lsStack.push('J');	
		
		System.out.println("The size of the list statck is: " + lsStack.size());
		
		System.out.println("\nThe top item of the list statck is: " + lsStack.peek());
		
		System.out.println("\nThe normal order of the list statck is");
		for (int i = 0; i < lsStack.size(); i++) {
			System.out.printf("%c ", lsStack.getData().get(i));
		}	
		
		System.out.println("\n--------------------------------------");
		if (lsStack.isEmpty()) {
			System.out.println("The stack is empty!");			
		}
		else {
			System.out.println("The stack is not empty!");
		}
		
		System.out.println("\n--------------------------------------");
		System.out.println("The reverse order of the list statck is");
		while (!lsStack.isEmpty()) {
			System.out.printf("%c ", lsStack.pop());
		}
		
		System.out.println("\n--------------------------------------");
		if (lsStack.isEmpty()) {
			System.out.println("The stack is empty!");			
		}
		else {
			System.out.println("The stack is not empty!");
		}
	}
}

