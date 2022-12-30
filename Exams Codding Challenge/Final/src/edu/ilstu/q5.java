package edu.ilstu;

import java.util.*;

/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Final Exam
 *
 * Question 5
 */

 //This is the class q5 that contains the sumDigits of a data value that is used to insert into binary tree
public class q5 {

    //This is the sumDigit method that is used to calculate the sum of digits of the data input to be inserted into the tree
    public static int sumDigits(int data){
        int digit; //Initialize a digit variable
        int sum = 0; //initialize the sum
        //This is a while loop to loop through the data values to find the sum of its digits
        while(data>0){
            digit = data %10; //find the last digit of the given number
            sum+=digit; //sum the digits
            data = data/10; // remove the last digit from the number
        }
        return sum; //Return the sum
    }

    //This is the class of insert that is used to insert a value into the binary tree
    public static void insert(Node node, int data) {

        //Insert data in the left subtree if sumDigit of data is less or equal to sumDigit of node's data
        if ((sumDigits(data)<=sumDigits(node.data))) {

            if ((node.leftChild != null)) { //if the node at left is not null

                insert(node.leftChild, data); //insert data to the leftChild
            } else {
                System.out.println("\nInserted " + data + " to left of "+ node.data);
                node.leftChild = new Node(data); //create a new node and put the data into it
            }
            //Insert data in the right subtree if sumDigit of data is greater than sumDigit of node's data
        } else if((sumDigits(data)>sumDigits(node.data))) {
            if ((node.rightChild != null)) { //if the right node is not null
                insert(node.rightChild, data); //insert data into the right subtree
            } else {
                System.out.println("\nInserted " + data + " to right of "+ node.data);
                node.rightChild = new Node(data); //create a new node at the right subtree and put the data into it
            }
        }
    }

    //This is the inorderTraversal method
    public static void inorderTraversal(Node node) {
        if (node != null) { //if the node is not null
            inorderTraversal(node.leftChild); //recursively call the inorderTraversal method on the leftChild
            inorderTraversal(node.rightChild); //recursively call the inorderTraversal method on the rightChild
        }
    }

    //This is thee findMax method that is used to find the highest value in the tree
    public static int findMax(Node node) {

        //If the node is null print out a statement showing that the tree is empty
        if (node== null) {
            System.out.println("The tree is empty");
            return 0; //return 0
        }else{
            int leftMax; //initialize leftMax vaue variable
            int rightMax; //initialize rightMax value variable
            int max = node.data; //let max be the node value with the maximum value
            if (node.leftChild != null) { //if the left node is not null
                leftMax = findMax(node.leftChild); //recursively call the findMax method on node.leftChiled and assign it to leftMax
                max = Math.max(max, leftMax); //find the max value
            }
            if (node.rightChild != null) { //if the right node is note null
                rightMax = findMax(node.rightChild); //recursively call the findMax method on node.rightChild and assign it to rightMax
                max = Math.max(max, rightMax); //find the max value
            }
            return max; //just return the max
        }
    }

    //This is the getLevelHelper method that is a helper method to the getLevel method. It is used to get the level of a node
    public static int getLevelHelper(Node node, int data, int level){
        if(node == null){ //check if the node is null just return 0
            return 0;
        }

        //Check if the data at the node is the same as the data, return level
        if(node.data == data){
            return level;
        }

        //let a downLevel variable point to the recursive call of the getHelper method
        int downLevel = getLevelHelper(node.leftChild, data, level+1);

        //Check if the downlevel is not zero
        if(downLevel!=0){
            return downLevel; //return the downLevel
        }
        downLevel = getLevelHelper(node.rightChild, data, level+1); //recursively call the getLevelHelper method
        return downLevel; //Return downLevel
    }

    //This is the getLevel method that is used to get the level of a particular node on the tree
    public static int getLevel(Node node, int data){
        return getLevelHelper(node, data, 1); //return the call of the getLevelHelper method
    }

    //This is the inner class called Node that is used to set up the binary tree
    public static class Node {
        int data; //initialize the data variable
        Node leftChild; //initialize the leftChild variable
        Node rightChild;//initialize the rightChild variable

        //this is a constructor of the Node class
        public Node(int data) {

            this.data = data;
            leftChild = null; //set leftChild to null
            rightChild = null; //set rightChild to null
        }
    }

    //The main method is declared as main
    public static void main(String[] args) {

        //We will declaring the random number generation object
        Random random = new Random();

        //generate random values between 1 and 100
        int next = random.nextInt(100) + 1;

        //Invoking the Node class and putting the random numbers generated into it
        Node root = new Node(next);

        //use a for loop to insert the numbers into the tree
        for (int i = 0; i < 100; i++) {

            //generate random values between 1 and 100
            next = random.nextInt(100) + 1;

            //insert values into the tree starting from the root and moving to the next number
            insert(root, next);
        }
        //Traverse the tree recursively when a node is visited
        inorderTraversal(root);

        //print out the Max and the level as required by calling necessary methods to get the result
        System.out.println("\n\nMax= "+ findMax(root)+ ", level = "+ getLevel(root, findMax(root))); 

        //print out an empty space
        System.out.println("\n");
    }
}//End of class
