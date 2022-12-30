package edu.ilstu;
import java.util.*;
/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Final Exam
 *
 * Question 1
 */

 //This is the class of q1 that uses an integer array a to generate a 2D array based on certain conditions
public class q1 {

    //The main method is declared as main
    public static void main(String[] args) {

    //We will declaring the random number generation object
    Random random = new Random();

    //We create an array of size 40
    int[] a = new int[40];

    //Print an empty space
    System.out.println();
    System.out.println("The original array a is: "); //Print a statement onto the console for the user

    int u=0; //initialize a variable u
    System.out.print("______________________________________________________________________________________________________________________\n");
    System.out.print("|");

        //This is a loop to loop through the array to assign values for array a
        for(; u < a.length; u++){
         a[u]  = random.nextInt(100)+1; //generate random values between 1 and 100
         System.out.print(a[u]+"|"); //Print out the array
        }
        System.out.print("\n"); //Print an empty space
    System.out.print("______________________________________________________________________________________________________________________\n");
        //The rows and column numbers are innitialized
        int nbRows = 25; //Initialize number of rows
        int nbCols = 25; //Initialize number of columns

    //The array m object is declared here
    int[][] m = new int[nbRows][nbCols];
    int row = 0; //initialize row to be zero
    int colmn = 0; //initialize column to be zero

    m[0][0] = a[0]; //Initially assign the first elements of m to zeros of array a's zeros element

    boolean directionToTheRight = true; //declare a boolean variable set to true

    //A for loop to loop through the array  to set the direction of insertion
    for(int j = 1; j < a.length; j++){
        if(a[j-1]>a[j]){
            directionToTheRight = !directionToTheRight; //If direction of insertion to the right is false
        }
        if(directionToTheRight) //If direction of insertion to the right is true
            colmn++; //increase column by 1
        else
            row++; //else increase row by 1
     m[row][colmn]=a[j]; //fill m with elements of array a
    }
    System.out.print("\n"); //Print empty space
    System.out.println("The obtained 2D array m is: \n"); //Print a statement onto the console for the user

    //A for loop to loop through the rows of the array
    for(int i = 0; i < nbRows; i++){
        System.out.print("\n"); //Print an empty space
         //A for loop to loop thow the columns of the array print the required array
        for(int j = 0; j < nbCols; j++){
            System.out.print("\t"+ m[i][j]+" "); //print the array with values
        }
        System.out.println(); //print empty space
    }
    }
}//End of class
