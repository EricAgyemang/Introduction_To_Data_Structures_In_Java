package edu.ilstu;
/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 11
 */

//This is the BinTreeNode class that is used to create a binary tree to be used to request
//and read an arithmetic expression in postfix notation and create a binary expression from that expression
public class BinTreeNode {

    //The instance variables which are declared public are as follows
    public boolean isOperator; //This is the isOperator instance variable
    public char symbol;   //This is the symbol instance variable
    public int value;    //This is the value instance variable
    public BinTreeNode left; //This is the left instance variable of the tree
    public BinTreeNode right; //This is the right instance variable of the tree

    //This is a default constructor of the class
    public BinTreeNode(){

    }

    //This is a constructor of the class that takes an integer item as argument
    public BinTreeNode(int item){
        value = item; //Set value to item
        isOperator = false; // let isOpetator be false
        left = null;  //left is null
        right = null; //Right is null
    }

    //This is a constructor that takes a char item as argument
    public BinTreeNode(char item){
        symbol = item; //Set symbol to item
        isOperator = true; //let isOperator be true
    }

    //This is the constructor that takes a char item, left and right node as argument
    public BinTreeNode(char item, BinTreeNode leftChild, BinTreeNode rightChild){
        symbol = item; //set symbol to item
        isOperator = true; //let isOperator to true
        left = leftChild; //let left be equal to leftChild
        right = rightChild; //let right be equal to rightChild
    }

    //This is the get value method that returns value
    public int getValue(){
        return value; //return value
    }
}//End of class
