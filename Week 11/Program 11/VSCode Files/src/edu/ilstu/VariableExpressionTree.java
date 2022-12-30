package edu.ilstu;

import java.util.*;

/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 11
 */

 //EXTRA CREDIT PART

 //This is rhe VariableExpressionTree class that manages the user input of variables to be
 //converted into prefix and infix form
public class VariableExpressionTree {

    //This is the myPostfix instance variable
    private String myPostfix;

    //This is the root instance variable of BinTreeNode type
    private BinTreeNode root;

    //This is a constructor that takes a postfix expression
    public VariableExpressionTree(String postfix) {
        if (postfix == null) { //if the input is null, throw an exception
            throw new NullPointerException("The posfix should not be null");
        }
        if (postfix.length() == 0) { //If the length of the input is zero, throw an exception
            throw new IllegalArgumentException("The postfix should not be empty");
        }
        this.myPostfix = postfix;
    }

    //the isOperator method to be used for the manipulation
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/'; //Return the operation of the particular type
    }

    //This is the createExpression method that is used to send an expression to the binary tree
    public void createExpressionTree() {

        //This is the stack object that reference nodes object
        final Stack<BinTreeNode> nodes = new Stack<BinTreeNode>();

        //The for loop to loop through the user input
        for (int i = 0; i < myPostfix.length(); i++) {
        char character = myPostfix.charAt(i);

        //If-else statement to set pop from left and right node
        if (isOperator(character)) {
            BinTreeNode rightNode = nodes.pop();
            BinTreeNode leftNode = nodes.pop();
            nodes.push(new BinTreeNode(character,leftNode, rightNode)); //add to the nodes the characters
        } else {
            //Add to the nodes the characters
            nodes.add(new BinTreeNode(character, null, null));
        }
        }
        root = nodes.pop(); //Set the root to the node.pop
    }

    //This is the getPrefixNotation method that returns the prefix notation of the expression
    public String getPrefixNotation(){
        if (root == null) { //If the root is null, throw an exception
            throw new NoSuchElementException("The root is empty, the tree has not yet been constructed.");
    }
            final StringBuilder prefix = new StringBuilder(); //This is the StringBuilder that reference prefix object
            preOrder(root, prefix); //call preOrder method
        return prefix.toString(); //return prefix in toString form
    }

    //This is the preOrder method that takes node and prefix arguments
    private void preOrder(BinTreeNode node, StringBuilder prefix) {
        if (node != null) { //if node is not null, callthe preOrder method for left and right nodes
        prefix.append(node.symbol);
        preOrder(node.left, prefix);
        preOrder(node.right, prefix);
        }
    }

    //This is the getInfixNotation method that returns the infix toString form
    public String getInfixNotation() {
        if (root == null) { //If the root is null, throw an exception
            throw new NoSuchElementException("The root is empty, the tree has not yet been constructed.");
    }

        final StringBuilder infix = new StringBuilder(); //This is the StringBuilder that reference infix object
        inOrder(root, infix); //call the inOrder method
        return infix.toString(); //Return the infix toString form
    }

    //This is the inOrder method that takes two arguments
    private void inOrder(BinTreeNode node, StringBuilder infix) {
        if (node != null) { //if node is not null, callthe preOrder method for left and right nodes
        inOrder(node.left, infix); //call the inOrder method
        infix.append(node.symbol); //add symbol to the infix form
        inOrder(node.right, infix); //call the inOrder method
        }
    }

    //This is the toString method that returns retVal that has the details indicated in the method body
    public String toString(){
        String retval = "\nPrefix: "+ getPrefixNotation() + "\n\nInfix: "+ getInfixNotation();
        return retval;
    }
}//End of class
