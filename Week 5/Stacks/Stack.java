/**
 * 
 */
package ClassTrial;

/**
 * @author itstudent
 *
 */
public class Stack<E> {
	
	public void push(int a) {
		push(a);	
	}
	
	public void pop(Stack<Integer>stack) {
		stack.pop(stack); 
		
	}
	
	public void peek(Stack<Integer>stack) {
		stack.peek(stack);
	}
	
	public boolean isEmpty() {
         return true;
		}

	public void addAll(Stack<Integer> stack) {
		stack.addAll(stack);		
	}	
	
	public static void main(String[] args) {
	    
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();		
		Stack<Integer> stack3 = new Stack<Integer>();
		
		int [] a = {-1, 15, 23, 44, 4, 99};
		
		for(int i = 0; i<a.length; i++) {
			stack1.push(a[i]);
			stack2.push(a[i]);
		}

		while(!stack1.isEmpty()) {
			stack3.addAll(stack1);
		}
		
		while(!stack2.isEmpty()||!stack3.isEmpty()) {

			
		}
		
		
	}
	
	
	}
	
	
