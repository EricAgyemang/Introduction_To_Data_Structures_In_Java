package QueueExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse
{

	// reverse a stack using a queue
	public static void reverseStack(Stack<Character> stack)
	{

		Queue<Character> queue = new LinkedList<Character>();

		// pop stack
		while (!stack.isEmpty())
		{
			queue.add(stack.pop());
		}

		// push elements back on
		while (!queue.isEmpty())
		{
			stack.push(queue.remove());
		}
	}

	static void printStack(Stack<Character> stk)
	{
		Stack<Character> tmpStk = new Stack();
		System.out.println("The content of the stack is:");
		System.out.println("----------------------");
		while (!stk.isEmpty())
		{
			Character c = stk.pop();
			System.out.println(c);
			tmpStk.push(c);
		}
		System.out.println("----------------------");
		while (!tmpStk.isEmpty())
			stk.push(tmpStk.pop());

	}

	public static void main(String[] args)
	{
		Stack stk = new Stack();
		stk.push('N');
		stk.push('O');
		stk.push('R');
		stk.push('M');
		stk.push('A');
		stk.push('L');
		printStack(stk);
		reverseStack(stk);
		printStack(stk);

	}

}
