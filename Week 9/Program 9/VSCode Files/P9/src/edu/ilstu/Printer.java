package edu.ilstu;
import java.util.*;
/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 9
 */

//This is the Printer class that has the details of the printer for printing a job in this program
public class Printer {

    //The attribute of the printer are declared
    private int printJobNumber;
    private Queue<PrintJobs> printerQueue;
    private String printerType;

    //This is the default constructor of the printer class
    public Printer(){
        this.printJobNumber = 0;
        this.printerQueue = new LinkedList<PrintJobs>();
        this.printerType = "";
    }

    //This is the constructor with a printer type argument
    public Printer(String printerType){
        this.printJobNumber = 0;

        //Deleare a printQueue that is inherited by a
        //linkedList of print jobs object
        this.printerQueue = new LinkedList<PrintJobs>();
        this.printerType = printerType;
    }

    //This is the getPrinterQueue method that returns a queue of Print jobs
    public Queue<PrintJobs> getPrinterQueue(){
        return printerQueue;
    }

    //This is the getPrinterType method that returns the printer type in this program
    public String getPrinterType(){
        return printerType;
    }

    //This is the addPrintJob method that returns new print job of the printJobs object
    public PrintJobs addPrintJob(PrintJobs newPrintJob){
        //call the add method on the argument and add it to the printQueue 
        printerQueue.add(newPrintJob);
        printJobNumber++; //Increase the printJobNumber 
        return newPrintJob;
    }

    //This is the equals method
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()){
            return false;
        }
        Printer printer = (Printer) obj;
        return printJobNumber == printer.printJobNumber && this.printerType.equals(printer.getPrinterType()) && this.printerQueue.equals(printer.getPrinterQueue());
    }
}
