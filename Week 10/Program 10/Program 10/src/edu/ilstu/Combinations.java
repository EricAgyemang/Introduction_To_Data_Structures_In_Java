package edu.ilstu;

/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 10
 *
 * Question 2
 */

//This is the combination class and read the input as a string. Print the resulting sequences to the screen
public class Combinations {

    //This is the combination sequence static method that takes three arguments, the suffix of the letter,
    //prefix, and the index

    public static void myCombinationsSequence(String suffix, String prefix, int index){

        //The if statement that checks if the length of the prefix is the index of a letter
        if(prefix.length() == index){
            System.out.print(prefix + ", "); //Print out the prefix yo the console
            return;
        }

        //Check if the suffix is empty and just return
        if(suffix.isEmpty()){
            return;
        }

        //Recursively call the myCombinationsSequence and specify the necessary arguments by including the current character
        myCombinationsSequence(suffix.substring(1), prefix + suffix.charAt(0), index);

        //Recursively call by excluding the current character
        myCombinationsSequence(suffix.substring(1), prefix, index);
    }


    //The main method is declared as main
    public static void main(String[] args) {

        //Declare and initialize the array
        char [] letters ={'A', 'C', 'E', 'G'};

        //We make a string from the character array
        String str = String.copyValueOf(letters);

        //This is a for loop that will print the sequence length by length
        for(int i = 1; i<=letters.length; i++){

            //Check if i is equal to 1 and print out the sequence if that condition is met
            if(i==1){
                System.out.print("\nThe one-element sequences are: ");
                myCombinationsSequence(str, "", i); //call the myCombinationsSequence method

            //Check if i is equal to 2 and print out the sequence if that condition is met
            }else if(i==2){
                System.out.print("The two-element sequences are: ");
                myCombinationsSequence(str, "", i); //call the myCombinationsSequence method

            //Check if i is equal to 3 and print out the sequence if that condition is met
            }else if(i==3){
                System.out.print("The three-element sequences are: ");
                myCombinationsSequence(str, "", i); //call the myCombinationsSequence method

            //Check if i is equal to 4 and print out the sequence if that condition is met
            }else{
                System.out.print("The four-element sequences are: ");
                myCombinationsSequence(str, "", i); //call the myCombinationsSequence method
            }
            System.out.println("\n"); //pint an empty space
        }
    }
}//End of class
