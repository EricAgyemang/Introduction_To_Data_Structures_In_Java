package edu.ilstu;

import java.io.*;
import java.util.*;
/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Assignement 8
 */

 //This is the SymboleCheckerDemo class that demonstrate how the program works on a data file
public class SymbolCheckerDemeo {

    //An object of the  SymbolChecker class is declared here with strings of symboles passed as argument
     public static SymbolChecker balanced = new SymbolChecker("([{<",")]}>");

     //The main class is declared as main
    public static void main(String[] args) throws FileNotFoundException{

        Scanner myFile = new Scanner(System.in); //The scanner object is decleared
        String fileName = balanced.setUp(myFile);
        myFile = new Scanner(new File(fileName));
        int line = 0;
        while(myFile.hasNextLine()){
            String curLine = myFile.nextLine();
            balanced.runChecker(curLine, line++);
        }
        myFile.close();
    }
}
