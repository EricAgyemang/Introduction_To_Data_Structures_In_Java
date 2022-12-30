import java.util.Scanner;
import java.util.Stack;

public class StackExample
{
    public static void main(String[] args)
    {
        // creating an instance of Stack class
        Stack<Integer> origStk = new Stack<>();
        Stack<Integer> oddStk = new Stack<>();
        Stack<Integer> evenStk = new Stack<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int userInput = in.nextInt();
        in.nextLine();
        while (userInput != -1)
        {
            origStk.push(userInput);
            System.out.print("Enter a value: ");
            userInput = in.nextInt();
            in.nextLine();
        }
        System.out.println("The original stack is: " + origStk);

        while (!origStk.isEmpty())
        {
            int temp = origStk.pop();
            if (temp % 2 == 0)
                evenStk.push(temp);
            else
                oddStk.push(temp);
        }

        while (!evenStk.isEmpty())
        {
            int temp = evenStk.pop();
            origStk.push(temp);
        }

        while (!oddStk.isEmpty())
        {
            int temp = oddStk.pop();
            origStk.push(temp);
        }

        System.out.println("The original stack is: " + origStk);
        System.out.println("The even stack is: " + evenStk);
        System.out.println("The odd stack is " + oddStk);
    }
}
