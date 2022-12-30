package edu.ilstu;

import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Assignement 8
 */
//This is the Symbol checker test method that is used to test the the methods that handle pieces of the checking process.
public class SymboleCheckTest {

    //This is the test for the constructor of the class to determine if the char object are balanced
    @Test
    public void constructorTest(){
        Stack<Character> myStack1 = new Stack<>();
        SymbolChecker balanced = new SymbolChecker("([{<",")]}>");
        balanced.printStatement4();
    }

    //This is the test for the runChecker method that determines if characters at their indexs are balanced
    @Test
    public void runCheckerTest(){
        SymbolChecker balanced = new SymbolChecker("([{<",")]}>");
      balanced.runChecker("({}", 8);
      balanced.printStatement4();

    }

    //This is the test for the printStatement1 that prints out the detailed output of mismatch of two charactors 
    @Test
    public void printStatement1Test(){
        SymbolChecker balanced = new SymbolChecker("([{<",")]}>");
        balanced.runChecker("{}", 1);
        balanced.printStatement1(1,'{','}' );
    }

    //This test shows the test for printStatement2 that details the unmatched character inthe list
    @Test
    public void printStatement2Test(){
        SymbolChecker balanced = new SymbolChecker("([{<",")]}>");
        balanced.runChecker("{", 1);
        balanced.printStatement2(1,'{');
    }

    //The printStatement3 test shows the details of how a character has no openning character
    @Test
    public void printStatement3Test(){
        SymbolChecker balanced = new SymbolChecker("([{<",")]}>");
        balanced.runChecker("{", 1);
        balanced.printStatement3(1,')');
    }

    //This test show the printStatement of all balanced characters in the file
    @Test
    public void printStatement4Test(){
        SymbolChecker balanced = new SymbolChecker("([{<",")]}>");
        balanced.runChecker("{}", 1);
        balanced.printStatement4();
    }

    //This is the test of setUp that takes an input from a user input of file to be read into the program
    @Test
    public void setUpTest() throws IOException{
        SymbolChecker balanced = new SymbolChecker("([{<",")]}>");
        int line =0;
        try {
            File myObj = new File("case1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              balanced.runChecker(data, line++);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        }
}

