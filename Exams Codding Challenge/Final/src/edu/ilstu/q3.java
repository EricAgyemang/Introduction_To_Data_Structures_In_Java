package edu.ilstu;
/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Final Exam
 *
 * Question 3
 */
public class q3 {

    public static void repeatPrint(String s, int characters, int index) {

        // We have the base case as
        if (characters == s.length() && index == s.length()) {
            return;
        }

        // if the characters to print is equals the length of the string, we will increase the index by 1
        if (characters == s.length()) {
            index += 1;
        }

        //If the index is zero, we will print the difference in length of string and characters spaces
        if (index == 0) {

            for (int j = 0; j < s.length() - characters; j++) {
                System.out.print(" "); //printed spaces
            }

            //A for loop that loop through characters and print the character at jth position
            for (int j = 0; j < characters + 1; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();//print an empty space
            repeatPrint(s, characters + 1, index); // Recursively call the repeatPrint method

        } else {//Else condion if previous condition fails.

            //A for loop to loop through the characters to be printed based on the legth of the string
            for (int j = index - 1; j < s.length(); j++) {
                System.out.print(s.charAt(j)); //Print character at jth position
            }
            System.out.println(); //print an empty space
            repeatPrint(s, characters, index); // Recursively call the repeatPrint method
        }
    }

    //The main method is declared as main
    public static void main(String[] args) {

        System.out.println("\n"); //print an empty space
        repeatPrint("CHICAGO", 0, 0); // Recursively call the repeatPrint method
        System.out.println("\n"); //print an empty space
    }

}//End of class
