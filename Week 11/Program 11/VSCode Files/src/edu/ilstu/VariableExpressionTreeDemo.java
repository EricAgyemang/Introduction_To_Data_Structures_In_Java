package edu.ilstu;

import java.util.*;

/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 11
 */


 //EXTRA CREDIT PART

//This is the VariableExpressionTreeDemo class that accepts the user input of variable expression and convert
//the expression into prefix and infix form
public class VariableExpressionTreeDemo {

    //This is the invoked BinTreeNode class that reference myNode object
   static BinTreeNode myNode = new BinTreeNode();


   //This is the main method that is declared as main
    public static void main(String[] args) {

        //We initialized the userInput variable
        String userInput = "";

        //This is the scanner object that reference the input object
        Scanner input = new Scanner(System.in);

        //These are the print out statements to the user that directs the user to the program
        System.out.println("\nEnter VARIABLE expression in postfix notation.");
        System.out.println("Please DO NOT LEAVE SPACE between elements: \n");

        //Accepts the input from the user
        userInput = input.nextLine();

        //Invoking the VariableExpressionTree class that reference myTree object
        VariableExpressionTree myTree = new VariableExpressionTree(userInput);

        //call the createExpressionTree methods
        myTree.createExpressionTree();

        //print our the result as required
        System.out.println(myTree.toString()+"\n");
        input.close(); //clase the scanner object
    }
}//End of class
