package edu.ilstu;

import java.util.*;

/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Final Exam
 *
 * Question 4
 */

//This is the class of q4 that contains the modified version of minMaxSelectionSort and the swap method
//That are used to sort elements in descending order
public class q4 {

     //We create an array of size 10
    static int[] table = new int[10];

    //This is the swapElement method that helps to swap elements of the array when called
    public static void swapElements(int[] tab, int i, int j){

        int tmp = tab[i]; //create a temporary object tmp and let the ith element of tab point to tmp

        tab[i] = tab[j]; //let ith element of tab be equal to the jth element ot tab

        tab[j] = tmp; //let the jth element point to tmp
    }

    //This is the minMaxRecursiveSelectionSort method that determines the minimum and maximum of the arrays when called
    public static void minMaxRecursiveSelectionSort(int [] tab, int i, int j){
        int min = i; //let the minimum be i
        int max = j; //let the maximum be j

        //If i is greater than j, just return
        if(i>j){
            return;
        }

        //This is a for loop that is used to loop through the array to get the max
        for(int k = i+1; k<= j; k++){
            if(tab[k]>tab[max]){ //If the kth element of tab is greater than the max element let max be k
                max = k;
            }

            //If the kth element of tab is less than the min element let min be k
            if(tab[k]<tab[min]){
                min = k;
            }
        }

        //recuresively call swapElements method twice
        swapElements(tab, i, min); //recursively call swapElement method for the minimum
        swapElements(tab, j, max);  //recursively call swapElement method for the maximum
        minMaxRecursiveSelectionSort(tab, i+1, j-1); // Recursively call minMaxRecursiveSelectionSort method

    }
    //This is the reverseSort method that is used to refered the array from ascending to descending order
    public static void reverseSort(int [] tab, int i, int j){

        minMaxRecursiveSelectionSort(tab, i+1, j-1); //call the minMaxRecursiveSelectionSort method

        //A while loop tp loop through the array and calling the swapElements method to reverese the array into descending order
        while(i<j/2){
            swapElements(tab, i, j-i-1); //Calling the swapElements method
            i++; //Increase i by 1
        }
    }

    //The main method is declared as main
    public static void main(String[] args) {

         //We will declaring the random number generation object
        Random rand = new Random();

        System.out.println(); //Print an empty space

        System.out.println("The array we are currently working on is: "); //Print a statement onto the console for the user

        //This is a loop to loop through the array to assign values for array  table
        for(int i = 0; i<table.length; i++){

            table[i] = rand.nextInt(10); //generate random values between 0 and 10

            System.out.print(table[i]+", "); //print the required array
        }

        System.out.println("\n\nThe array in ascending order after the errors are fixed is: ");//Print a statement onto the console for the user

        minMaxRecursiveSelectionSort(table, 0, table.length-1); //Calling the minMaxRecursiveSelectionSort method

        //This is a for loop to loop through the array to print the array table
        for(int i = 0; i<table.length; i++){
            System.out.print(table[i]+", ");
        }

        System.out.println("\n"); //print an empty space

        System.out.println("\nThe array in descending order after the call of reverseSort method is: "); //Print a statement onto the console for the user

        //Calling the reverseSort method to reverse the content of the array to descending order
        reverseSort(table, 0, table.length);

        //Loop through the array to print the resulting array after calling the reverseSort method
        for(int i=0; i<table.length; i++){
           System.out.print(table[i] + ", ");
        }
        System.out.println("\n"); //print an empty space
    }
}//End of class
