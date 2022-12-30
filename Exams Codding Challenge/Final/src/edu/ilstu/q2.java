package edu.ilstu;

import java.util.*;

/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Final Exam
 *
 * Question 2
 */

 //This is the class q2 that populates a stack S and use it to create two other stacks S5 and S7
public class q2 {

    //The main method is declared as main
    public static void main(String[] args) {

    //We will declaring the random number generation object
    Random rand = new Random();

    //Declare the three stacks as required
    Stack<Integer> S= new Stack<>(); //Stack S declared
    Stack<Integer> S5= new Stack<>(); //Stack S5 declared
    Stack<Integer> S7= new Stack<>(); //Stack S7 declared

    //We will declare a temporary stack of integers to store the vales whose remainder of division by 10 is 3
    Stack<Integer>tempStack = new Stack<>();

    //We create an array of size 30
    int[]nums = new int[30];

  //This is a loop to loop through the array to assign values for array nums
    for(int i= 0; i < nums.length; i++){
        int num  = rand.nextInt(100)+1; //generate random values between 1 and 100
        if(num%10==3||num%10==5||num%10==7){ //Condition for divisibility and putting values into the right stack
            nums[i]=num; //Assign values to nums if condition is true
            S.push(num); //Push values into stack S
    }
    }

    System.out.println(); //print empty space
    System.out.println("The content of original stack S is: "); //Print a statement onto the console for the user
    System.out.print(S +" "); //print the original Stack S
    System.out.println("\n"); //print empty space

    //A while loop to pop elements from S and push to other stacks if the given condition is true
    while(!S.isEmpty()){
        int temp = S.pop(); //temporarily assign popped values into temp
        if(temp%10==5){
            S5.push(temp); //push into S5 if remainder is 5
        }else if(temp%10==7){
            S7.push(temp); //push into S7 if remainder is 7
        }else {
           tempStack.push(temp); //push into tempStack if remainder is 3
        }
    }

    //We want to pop from tempStack and push into S
    while(!tempStack.isEmpty()){
        int tempStk = tempStack.pop();
        S.push(tempStk);
    }

    System.out.println();  //print empty space
    System.out.println("The content of the stack S after two other stacks is: "); //Print a statement onto the console for the user
    System.out.print(S +" "); //print the Stack S after S5 and S7 are created
    System.out.println("\n");  //print empty space

    System.out.println("The content of the stack S5  is: "); //Print a statement onto the console for the user
    System.out.print(S5 +" "); //print the Stack S5
    System.out.println("\n");  //print empty space

    System.out.println();  //print empty space
    System.out.println("The content of the stack S7  is: "); //Print a statement onto the console for the user
    System.out.print(S7 +" "); //print the Stack S7

    System.out.println("\n");  //print empty space

    }
}//End of class

