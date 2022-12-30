package edu.ilstu;

import java.util.*;

//This is the ExpressionTreeDemo class that accepts user input of integer elements with operators
//to evaluate the expression into prefix, infix, and result of the expression
public class ExpressionTreeDemo {

    //This is the main method declared as main
    public static void main(String[] args) {

        //initialize the userInput variable
        String userInput = "";

        //Initialize the root variable to null
        BinTreeNode root = null;

        //This is the scanner object that reference an input object
        Scanner input = new Scanner(System.in);

        //These are the print statements to the user
        System.out.println("\nEnter INTEGER expression in postfix notation.");
        System.out.println("Please LEAVE SPACE between elements: \n");

        //Take input from the user
        userInput = input.nextLine();

        //Invoke the ExpressionTress class with userInput as its parameter
        ExpressionTree myTree = new ExpressionTree(userInput);

        //Set the root to the expressionToTree method
        root = myTree.expressionToTree(userInput);

        //If-else condtion that drives the program
        if(root==null){
            System.out.println("\n Expression is not in postfix notation!");
        }else{
             System.out.println("\n"+ myTree.toString()+"\n");
        }
     input.close(); //close the scanner object
    }
}//End of class
