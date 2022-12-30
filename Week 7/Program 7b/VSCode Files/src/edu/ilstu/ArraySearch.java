package edu.ilstu;
/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Assignement 7
 */
 /*
 * This is ArraySearch classthat contains the methods required for the programming assignment
 */
public class ArraySearch {

//QUESTION 1:

    //This is the search method that has four parameters and returns the index of the first occurrence of
    // the target in the array. If the target is not found, the method returns -1.
    public static int search(int [] myArray, int target, int start, int end){

        //first check for NullpointerException on the input array
        if(myArray==null){
            throw new NullPointerException("Array is null");
        }

        //if the start value is greater than the end value input, we will throuw an IlligalArgumentException
        if(end < start){
            throw new IllegalArgumentException("Start can not be greater than end!");
        }
        try{ //Elese use the try and catch block of code to hundle all exceptions
            for(int i = start; i<=end; i++){ //A loop through the array
                if(myArray[i]==target){  //If the target is in the array at index i, return the index of i
                    return i;
                }
            }
        }catch(Exception e){ //the catch block of code is found here
            System.out.println("Index Out of Bounds.\n Please check the entered index!.");
            e.printStackTrace();
        }
        return -1; //We return -1 if the target is not in the array
    } //End of class



//QUESTION 2:

    //This is the lastOccurrenceSearch method that helps to finds the last occurrence of a target
    // element in an array if the target is found. The method returns -1 if the target is not found
    public static int lastOccurrenceSearch(int [] myArray, int target, int start, int end){

        //first check for NullpointerException on the input array
        if(myArray==null){
            throw new NullPointerException("Array is null");
        }

        //if the start value is greater than the end value input, we will throuw an IlligalArgumentException
        if(end < start){
            throw new IllegalArgumentException("Start index can not be greater than end index!");
        }
        try{ //Elese use the try and catch block of code to hundle all exceptions
            for(int i = end; i>=start; i--){ //A loop through the array
                if(myArray[i]==target){ //If the target is in the array at index i, return the index i
                    return i;
                }
            }
        }catch(Exception e){ //the catch block of code is found here
            System.out.println("Index Out of Bounds. \n Please check the entered index!");
            e.printStackTrace();
        }
        return -1; //We return -1 if the target is not in the array
    }  //End of class



//QUESTION 3:

    //This is the findLargest method that takes an array as input and returns the first occurence of the largest element
    //of the array. This will be used for the JUnit test harness.
    public static int findLargest(int [] x){

        //first check for NullpointerException on the input array
        if(x==null){
            throw new NullPointerException("Array is null");
        }

        //initialize required variables for the loop body
        int i=0;
        int max = x[0];
        int index = 0;
        //We use a while loop to return the index of the maximum element in the array
        while(i<x.length){
            if(max < x[i]){ //if maximum value is the supremum of the array then the maximum is the
                max = x[i]; //supremum value
                index = i;
                }
                i++; //Increase i
            }
        return index; //We will return the index of the max
    }//End of class


    //This is the method overloading of the findLargest method that returns the index of the target element
    //if the target is found in the array. This will also be used for the JUnit test harness.
    public static int findLargest(int[] x, int target){
        //first check for NullpointerException on the input array
        if(x==null){
            throw new NullPointerException("Array is null");
        }
        //initialize required variables for the loop body
        int i = 0;
        //We use a while loop to return the index of the maximum element in the array
        while(i<x.length){
            if(x[i]==target){ 
                return i; //If the target is in the array at index i, return the index of i
            }
            i++;  //increase i
        }
        return -1; //We will return the index of the max
    }
}//End of class

