package exp01;

public class ListStackTest2 {

	public static void main(String[] args) {
		ListStack<Integer> lsStack = new ListStack<Integer>();
		
		lsStack.push(2);
		lsStack.push(6);
		lsStack.push(8);
		lsStack.push(5);	
		lsStack.push(3);		
		
		System.out.println("The size of the list statck is: " + lsStack.size());
		
		System.out.println("\nThe top item of the list statck is: " + lsStack.peek());
		
		System.out.println("\n--------------------------------------");
		System.out.println("The normal order of the list statck is");
		for (int i = 0; i < lsStack.size(); i++) {
			System.out.printf("%d ", lsStack.getData().get(i));
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
			System.out.printf("%d ", lsStack.pop());
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
