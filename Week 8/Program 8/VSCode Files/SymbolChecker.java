package edu.ilstu;

import java.io.*;
import java.util.*;

public class SymbolChecker {

    Stack<Character>stackCharacter;
    private static Scanner input;
    private int line;
    int column;


    public SymbolChecker(){
        stackCharacter = new Stack<>();
    }

    public static String setUp(Scanner sc){
        boolean validFile = false;
        String fileName = null;
        while(!validFile){
            try{
                System.out.println("Please enter the file name with path you would like to read into this program: ");
                fileName = sc.nextLine();
                Scanner file = new Scanner(new File(fileName));
                validFile = true;
            }catch(FileNotFoundException e){
                System.out.println("Your file does not exist.");
                System.out.println("Please try again. ");
                validFile = false;
            }
        }
        return fileName;
    }

public static boolean runChecker(String str, int line){

    Stack<Character>stack= new Stack<>();
    stack.clear();

    char c;
    for (int i = 0; i < str.length(); i++) {
        c = str.charAt(i);

        // for all opening paranthesis push it on to the stack
        if (c == '(' || c == '{' || c == '[')
            stack.push(c);
        else if (c == ')') {
            // check if stack is empty
            if (stack.isEmpty()) {
                printStatement3(line+1, c);
                return false;
            } else if (stack.top().equals('(')){
                stack.pop();
            }else { // for any other character then ( return false
                printStatement2(line+1, c);
                return false;
            }
        } else if (c == '}') {
            if (stack.isEmpty()) {
                printStatement3(line+1, c);
                return false;
            } else if (stack.top().equals('{')){
                stack.pop();
            }else {
                printStatement2(line+1, c);
                return false;
            }
        } else if (c == ']') {
            if (stack.isEmpty()) {
                printStatement3(line+1, c);
                return false;
            } else if (stack.top().equals('['))
                stack.pop();
            else {
                printStatement2(line+1, c);
                return false;
            }
        }

    }
    // after whole string is completed check for opening paranthesis in the stack
    if (stack.isEmpty()){
        printStatement4();
        return true;
    }else {
        return false;
      //  printStatement1(line, c, match)
    }
    }//end of method

    public static void printStatement1(int line, char symb1, char match){
        System.out.println(symb1 + " found on line " + line + " does not match " + match);

    }

    public static void printStatement2(int line, char symb1){
        System.out.println("End of file reached with unmatched "+ symb1);
    }

    public static void printStatement3(int line, char symb1){
        System.out.println(symb1+ " on line "+ line + " has no matching opening symbol.");
    }

    public static void printStatement4(){
        System.out.println("All symbols correctly balanced");
    }

    public static void main(String[] args)throws FileNotFoundException {
        Scanner myFile = new Scanner(System.in);
        String fileName = setUp(myFile);
        myFile = new Scanner(new File(fileName));
        int line = 0;
        while(myFile.hasNextLine()){
            String curLine = myFile.nextLine();
             runChecker(curLine, line++);
        }
       myFile.close();
    }

}//End of class
