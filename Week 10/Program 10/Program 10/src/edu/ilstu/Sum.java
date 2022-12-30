package edu.ilstu;

import java.util.*;
/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 10
 *
 * Question 1
 */

//Thisis the Sum class that reads a list of numbers and a desired sum, then determine the subset of numbers in the list
//that yield that sum if such a subset exists
public class Sum {
    //Initializing the attributes of the class
    private static ArrayList<Integer>numbers; //The ArrayList of numbers is initialized
    private static int size = 0; //The size of the ArrayList is initialized
    private static int sumOfNums; //The sum is initialized
    private static boolean found; //A boolean attribute called found is initialized
    private static Scanner input; //This is the scanner attribute
    private static ArrayList<ArrayList<Integer>>setOfSubsets = new ArrayList<ArrayList<Integer>>(); //This is the subset of the ArrayList

    /**
     * The getSize method is defind
     * @return int return the size
     */
    public static int getSize() {
        return size; //Return the size
    }

    //The getNumbers method  is defind
    public static void getNumbers(){

        //We declare and initialize repeatNum as a boolean.
		boolean repeatNum = true;
        numbers = new ArrayList<>(); //ArrayList object is declared
        input = new Scanner(System.in); //This is the scanner object invoked

        //A while loop that drives the program. It gives the user a permission to enter values into the array
        while(repeatNum){

            //Print a statement to direct the user for the program
            System.out.println("Enter an integer value into the list." + "\n" + "Please enter -999 when you want to stop entering the values: ");

            //Accept an input from the user
            int myNum = input.nextInt();

            //A condition to terminate the user input
            if(myNum == -999){
                repeatNum = false; //set repeatNum to false
                break; //break the program if if condition is true
            }else{ //else condition to add the user entry to the ArrayList
                try{ //Try block of code to catch an InputMismatchException
                    numbers.add(myNum); //Add myNum to the numbers
                    repeatNum = true;
                }catch(InputMismatchException ex){
                    System.out.println("Please enter a valid integer"); //print out a statement to the user if input is invalid
                    myNum = input.nextInt(); //Accept an input from the user
                }
            }
        }
    }

    //This is the getSumOfNums method that is used to accept user input of a sum into the program
    public static void getSumOfNums(){
        input = new Scanner(System.in); //Call the scanner object
        while(true){ //A while loop to accept user input until the user quits the program
            try {
            System.out.println("Enter desired Sum"); //print out a statement to the user
            sumOfNums = input.nextInt(); // Accept an input from the user
            break; //break if done
            }catch(InputMismatchException ex){ //Catch block of code that print out an invalid statement if true
                System.out.println("Invalid user input. Please enter an integer!");
                sumOfNums = input.nextInt(); //Accept user input
            }
        }
    }

    //This is findSubsetOfNumbers method that has a set and index arguments
    public static void findSubsetOfNumbers(ArrayList<Integer>set, int index){
        if(sumOfNums==sumOfSubset(set)){
            addSubsetOfNumbers(set); //call the addSubsetOfNumbers on set
            found = true; //Set found to be true if this condition holds
            return; //Simply return
        }else if(set.isEmpty()||index == set.size()){ //An else if statement to check if set is empty or index is equal to size of set
            return; //Simply return
        }else{
            //This is ArrayList object that reference newSet of Integer objects to store the list
            ArrayList<Integer>newSet  = new ArrayList<>(set);
            newSet.remove(index); //Remove the at index from newSet

            //Recursively call findSubsetOfNumbers method with subset of element of index included
            findSubsetOfNumbers(set, index+1);

            //Recursively call findSubsetOfNumbers method with subset of element of index not included
            findSubsetOfNumbers(newSet, index);
        }
    }

    //This is sum of subset method that accepts subSet as ArrayList argument and it returns the sum
    public static int sumOfSubset(ArrayList<Integer>subSet){
        int sum = 0; //Initialize the sum
       for(int i:subSet){
        sum +=i; //Increase the sum by i
       }
        return sum; //Return the sum
    }

    //This is the add subset of numbers that accepts newSubset as an ArrayList argument
    public static void addSubsetOfNumbers(ArrayList<Integer>newSubset){

        //A for loop to check the condition of the new subset if is equal to the old subset
        for(ArrayList<Integer>subSet:setOfSubsets){
            if(newSubset.equals(subSet)){
                return; //Just simply return if newSubset is equal to subSet
            }
        }
        setOfSubsets.add(newSubset); //We will add the newSubset to the setOfSubsets
    }

    //This is the print method that accepts the subSetOfNumers as argument
    public static void print(ArrayList<ArrayList<Integer>>subSetOfNumers){

        //Print out the statement to the user showing the entered list in the program
        System.out.println("\nThe list entered is: ");
        int i=0; //Initialize a varavle i

        //A for loop to print out the numbers
        for(; i < size-1; i++){
            System.out.print(numbers + " , "); //Print the list to the console
        }
        System.out.println(numbers);
        System.out.println();

        //Print out to the console a message to the user showing the subset that yields the entered sum
        System.out.println("The subset of numbers in the list that yield the sum " + sumOfNums + " is: ");

        //A for loop for prunting out the set of list
        for(ArrayList<Integer> mySetOfNums:subSetOfNumers){
            System.out.println(mySetOfNums);
            System.out.println();
        }
    }

    //This is the main method declared as main
    public static void main(String[] args) {
        getNumbers();  //Calling the getNumbers method
        getSumOfNums(); //Calling the getSumOfNums method
        findSubsetOfNumbers(numbers, 0); //calling the findSubsetOfNumbers with argument numbers and 0.

        //If-else condion condition
        if(found){
           print(setOfSubsets); //calling the print statement

        //The else condition to print the sum not found
        }else{
            System.out.println("Sum not found");
        }
    }
}//End of class
