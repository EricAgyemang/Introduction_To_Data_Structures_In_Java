package edu.ilstu;
/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: 12-Sorting
 */

//This is the class of SelectionSortDemo2 that takes random numbers to test the methods in SelectionSort class
public class SelectionSortDemo2 {

    //We create an array of size 7
   static int[] table = {1,3,15,8,5, 2, 11};

     //The main method is declared as main
    public static void main(String[] args) {

        //print an empty space
        System.out.println();

        //Print a statement onto the console for the user
        System.out.println("The array we are currently working on is: ");

         //This is a loop to loop through the array to assign values for array  table
        for(int i = 0; i<table.length; i++){

            //print the required array
            System.out.print(table[i]+", ");
        }
        //Print a statement onto the console for the user
        System.out.println("\n\nThe array in ascending order after the call of minMaxRecursiveSelectionSort method is: ");

        //Calling the minMaxRecursiveSelectionSort method
        SelectionSort.minMaxRecursiveSelectionSort(table, 0, table.length-1);

        //This is a for loop to loop through the array to print the array table
        for(int i = 0; i<table.length; i++){
            System.out.print(table[i]+", "); //print the array
        }
        System.out.println("\n");   //print an empty space

        //Print a statement onto the console for the user
        System.out.println("\nThe array in descending order after the call of reverseSort method is: ");

        //Calling the reverseSort method to reverse the content of the array to descending order
        SelectionSort.reverseSort(table, 0, table.length);

         //Loop through the array to print the resulting array after calling the reverseSort method
        for(int i=0; i<table.length; i++){
           System.out.print(table[i] + ", "); //print the array after calling the reverseSort mthod
       }
       System.out.println("\n"); //print an empty space
    }
}//End of class
