package edu.ilstu;

import java.io.*;
import java.util.*;
/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Assignement 8
 */

 //This is the Stack Class symbol checker class that helps to check the parentheses whether or not they are balanced
public class SymbolChecker {

    //The following instance variables are declared private
    Stack<Character>stackCharacter;
    private Scanner input;
    private Character c;
    private String openSet;
    private String closedSet;

    //A constructor of the class is declared
    public SymbolChecker(){

    }

    //A constructor with two arguements are declared
    public SymbolChecker(String openSet, String closedSet){
        this.openSet = openSet;
        this.closedSet = closedSet;

    }

    //The setUp method is defined as setUp and will help to and open the corresponding file
    public String setUp(Scanner sc){
        boolean validFile = false;
        String fileName = null;
        while(!validFile){ //A while loop to navigate through the user input
            try{
     //print a message to the user and cater for the try and catch block of code to hundle possible file not found exceptions
                System.out.println("Please enter the file name with path you would like to read into this program: "); 
                fileName = sc.nextLine();
                input = new Scanner(new File(fileName));
                validFile = true;
            }catch(FileNotFoundException e){
                System.out.println("Your file does not exist.");
                System.out.println("Please try again. ");
                validFile = false;
            }
        }
        return fileName;
    }


//The is a runChecker method that will manage the checking process (reading through the file and calling other methods)
public void runChecker(String str, int line) {
    Stack<Character>stack= new Stack<>(); //A stack object is decleared
    stack.clear(); //first clear the stack
    boolean flag = false; //Initialize a boolean flag 

    //Use a for loop to navigate through the content of the file
    for(int i = 0; i < str.length(); i++) {
        c = str.charAt(i);
        if(openSet.indexOf(c)!=-1){
            stack.push(c); //Push the symbole into the stack
        }else if(closedSet.indexOf(c)!=-1){
            if(stack.isEmpty()){  //If the stack is empty and the closed symbol is put into it print out the statement showing
                //that the closed symbol has no openning symbol
                printStatement3(line+1, c);
                flag = true;
                break;
        }else if(openSet.indexOf(stack.top())==closedSet.indexOf(c)){
                  // Trying to match a symbol with the pop stack and assert that the popped stack  matches the symbole;
                }else{
                    printStatement1(line+1,  c, stack.pop()); //print out the result if else condition is met
                    flag = true;
                    break;
                }

        }else{
          //Ignore all the alphabets in the text file
        }
        }
        if(!flag){
           if(stack.isEmpty()){ //  If the stack is empty, print the statement that all symbols are balanced
            printStatement4();
        }else
           printStatement2(line+1, c); // Else print out the unmatched symbol as end of file is reached
        }
    }

    //This is the cleanUp method that helps to close the scanner object 
    public void cleanUp(){
        this.input.close();
    }


    //This is a peice of the checking process that prints out the the result if a symbole does not match with another symbol in the text
    public static void printStatement1(int line, char symb, char match){
        System.out.println(symb + " found on line " + line + " does not match " + match);

    }

      //This is a peice of the checking process that prints out the the result if a symbol has an unmatched symbol
    public static void printStatement2(int line, char symb){
        System.out.println("End of file reached with unmatched "+ symb);
    }

      //This is a peice of the checking process that prints out the the result if a symbol has no openning symbol 
    public static void printStatement3(int line, char symb){
        System.out.println(symb + " on line "+ line + " has no matching opening symbol.");
    }

      //This is a peice of the checking process that prints out the the result if all symbols are balanced
    public static void printStatement4(){
        System.out.println("All symbols correctly balanced");
    }

}//End of class
