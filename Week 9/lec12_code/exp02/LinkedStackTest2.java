package exp02;

public class LinkedStackTest2 {

	public static void main(String[] args) {
		LinkedStack<Integer> lnStack = new LinkedStack<Integer>();
		
		lnStack.push(2);		
		lnStack.push(3);		
		lnStack.push(5);		
		lnStack.push(8);	
		lnStack.push(1);			
		
		System.out.println("Test peek method in LinkedStack class:");
		int i = 0;
		while (!lnStack.isEmpty()) {
			if (i == 3)
				break;			
			System.out.println(lnStack.peek());
			i++;
		}	
		
		System.out.println("\nTest pop method in LinkedStack class:");
		i = 0;
		while (!lnStack.isEmpty()) {
			if (i == 3)
				break;			
			System.out.println(lnStack.pop());
			i++;
		}	
		
		System.out.println("\nTest push method in LinkedStack class:");
		lnStack.push(9);	
		lnStack.push(6);		
	
		System.out.print(lnStack.pop());
		System.out.print(lnStack.peek());
	}
}

