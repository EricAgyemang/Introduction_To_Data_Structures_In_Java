package edu.ilstu;

import java.util.*;
/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 11
 */

//This is the ExpressionTree class that holds the the binary tree.
public class ExpressionTree{

    //This is the the private instance variable called root
    private BinTreeNode root;

    //We declare and initialize the operators used in the program
    private static char [] symbols = {'+','-','*','/'};

    //This is the default constructor
    public ExpressionTree(){

    }

    //Thisis the constructor that takes a postFixExpression as argument
    public ExpressionTree(String postFixExpression){
        if(postFixExpression == null){ //Check if the input is null
            throw new NullPointerException("Postfix should not be null"); //Throw an exception
    }
        if(postFixExpression.length()==0){ //Check if the input's length is zero
            throw new IllegalArgumentException("Postfix should not be empty"); //Throw an exception
        }
        //set the root to the expressionToTree with the input as parameter
        root = expressionToTree(postFixExpression);

    }

    //This is a constructor that takes a root of BinTreeNode as argument
    public ExpressionTree(BinTreeNode root){
        this.root = root;
    }

    //This is the expressionToTree method that sends the user input to the binary tree
    public BinTreeNode expressionToTree(String expression){

        //This is the stack object that reference myStack object
        Stack<BinTreeNode>myStack = new Stack<>();

        //This is the StringTokenizer object that reference stringToken object
        StringTokenizer stringToken = new StringTokenizer(expression);

        //This is the while loop that is used to contraol the user input submited to either left or right of the tree
        while(stringToken.hasMoreTokens()){
            String token = stringToken.nextToken();
        boolean isOperator = false; //Set isOperator to false

        //This is a for loop to loop through the symbol
        for(char operator: symbols)
            if(token.equals(Character.toString(operator))) //check if the token is equal to the operator

                isOperator = true; //set isOperator to true

                BinTreeNode node; //Initialize the node

                //An if-else condition to set the nodes of the tree with the token
                if(isOperator)
                    node = new BinTreeNode(token.charAt(0));
                else
                    node = new BinTreeNode(Integer.parseInt(token));

                //An if-else condition to pop from the stack and insert into the right and left of the tree
                if(node.isOperator){
                    BinTreeNode rightNode = myStack.pop(); //insert to the right node
                    BinTreeNode leftNode = myStack.pop(); //insert to the left node
                    node.right = rightNode;
                    node.left = leftNode;

                    myStack.push(node); //Push node to the stack
                }else{
                    myStack.push(node); //Push node to the stack
                }
            }
            return myStack.pop(); //Return the element pop from the stack
        }

    //This is the operation method that takes three arguments and helps manipulate operations in the program
    private int operation(int x, int y, char operator){

        int result= 0; //Initializing the results

        switch(operator){ //Swith statements that controls the operation with cases

            //This is the case where operation is +
            case '+':
            result = x+y;
            break;

            //This is the case where operation is -
            case '-':
            result = x-y;
            break;

            //This is the case where operation is *
            case '*':
            result = x*y;
            break;

            //This is the case where operation is /
            case '/':
            result = x/y;
            break;

            //This is the case where operation is not valid
        default:
            throw new IllegalArgumentException("Illegal operation performed"); //throw an exception at default
    }
    return result; //return the results
    }

    //This is the evaluateExpression method that recursively calls the evaluateExpression method with the root as input
    public int evaluateExpression(){
        if(root==null){
            return 0;
    }else{
        return evaluateExpression(root); //The recursive call
        }
    }

    //This is the evaluateExpression method that evaluates the user input at particular nodes in the tree
    private int evaluateExpression(BinTreeNode node){
        int left;
        int right;

    if(!node.isOperator)
        return node.value; //Return the value at the node
    else{
        left = evaluateExpression(node.left); //Evaluate the expression on the left node
        right = evaluateExpression(node.right); //Evaluate the expression on the right node
        return operation(left, right, node.symbol); // We call of the operation method
        }
    }

    //This is the getPostfixNotation method that recursively calls the getPostfixNotation method
    public String getPostfixNotation(){
        return getPostfixNotation(root);
    }

    //This is the getPostfixNotation method that evaluates the user input at particular nodes in the tree and 
    //present it in a postfix form
    public String getPostfixNotation(BinTreeNode node){
        String left=""; //Initialize the left node
        String right=""; //Initialize the right node

    if(!node.isOperator)
        return "" + node.value; //Return the value at the node
    else{
        left= getPostfixNotation(node.left); //postfix at the left node
        right = getPostfixNotation(node.right); //postfix at the right node
        return left + " "+ right+ " " + node.symbol; //Return the value at the right and left node with all necessary symbols
       }
    }

    //This is the getPrefixNotation method that returns the recursive call of the method
    public String getPrefixNotation(){
        return getPrefixNotation(root);
    }

    //This is the getPrefixNotation method that manipulate the user input and convert it to the prefix notation form
    public String getPrefixNotation(BinTreeNode node){
        String left=""; //Initialize the left node
        String right=""; //Initialize the right node
    if(!node.isOperator){
        return "" + node.value; //Return the value at the node
    }else{
        left = getPrefixNotation(node.left); //prefix at the left node
        right = getPrefixNotation(node.right); //prefix at the right node
        return node.symbol + " "+ left+ " " + right; //Return the value at the right and left node with all necessary symbols
        }
    }

    //This is the getInfixNotation method that returns the recursive call of the method
    public String getInfixNotation(){
        return getInfixNotation(root); //Tje recursive call
    }

    //This is the getInfixNotation method that manipulate the user input and convert it to the infix notation form
    public String getInfixNotation(BinTreeNode node){
        String left=""; //Initialize the left node
        String right=""; //Initialize the right node

    if(!node.isOperator){
        return "" + node.value; //Return the value at the node
    }else{
        left = getInfixNotation(node.left); //infix at the left node
        right = getInfixNotation(node.right); //infix at the left node
        return "("+ left + "  "+ node.symbol + " "+ right+ ")"; //Return the value at the right and left node with all necessary symbols
        }
    }

    //This is the getValue method that returns the evaluateExpression method
    public int getValue(){
        return evaluateExpression();
    }

    //This is the toString method that returns the details of retVal
    public String toString(){
        String retval ="Postfix: "+ getPostfixNotation() +"\n\nPrefix: "+ getPrefixNotation() + "\n\nInfix: "+ getInfixNotation()+ "\n\nResult: "+ getValue();
        return retval;
    }
}//End of class
