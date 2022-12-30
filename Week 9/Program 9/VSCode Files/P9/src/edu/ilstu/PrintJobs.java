package edu.ilstu;

import java.util.*;
/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 9
 */

//This is the PrintJobs class that has the details of the print job directives as to how the printing should be done
public class PrintJobs {

    //The attributes of the class are decleared and initialized
    public static final int TOTAL_NUMBER_OF_JOBS = 30;
    public static final int MAXIMUM_PAGES = 50;
    private static int numOfJobsPrintedAlready;
    private static int startTimeOfPrintJob;
    private static PrintJobs PrintDocument;
    private static int nextJob;

    //These are the three queues to be used. With these we insert the new job in the proper queue
    static private Queue<SystemPrinting> queue1 = new LinkedList<>();
    static private Queue<SystemPrinting> queue2 = new LinkedList<>();
    static private Queue<SystemPrinting> queue3 = new LinkedList<>();

    //This is the random number generation object
    static Random rand  = new Random();

    //We invloke the printer class to be used for printing a job
    static Printer print = new Printer("Laser Jet");

    //this is the generateNewJob method that has the overall logic of the program
    public static void generateNewJob(){
        int pages;
        nextJob = 0;
        startTimeOfPrintJob=0;
        //This is the while loop as directed by the problem
        while(nextJob<=TOTAL_NUMBER_OF_JOBS){
            if(startTimeOfPrintJob % 60 == 0){ // the if condition to Wait 1 minute
                if(numOfJobsPrintedAlready<=TOTAL_NUMBER_OF_JOBS){ // the condition to the number of print jobs already generated <= 30
                    pages = rand.nextInt(MAXIMUM_PAGES) +1; //generate randoms numbers between 1 to 50

                    //Invoke the SystemPrinting class to be used to call other methods
                    SystemPrinting myPrinter = new SystemPrinting(pages, ++startTimeOfPrintJob);

                    //When a new job is generated, print out the message to the user as directed in the question
                    System.out.print("\nNew print job " + myPrinter.getNumber() + " with " +  myPrinter.getPages() + " pages\n");

                   //This are the conditions to insert the new job in the proper queue
                   if(pages<=10){
                       queue1.offer(myPrinter); //Insert in the queue 1

                       //Print out the message when this condition is met
                       System.out.println("\nPrint job " + myPrinter.getNumber() + " inserted in Queue 1\n");
                   }else if(pages>=11 && pages<=20){
                        queue2.offer(myPrinter); //Insert in the queue 2

                        //print out the statement if this condition is met
                        System.out.println("\nPrint job " + myPrinter.getNumber() + " inserted in Queue 2\n");
                   }else{
                        queue3.offer(myPrinter); //Insert in the queue 3

                        //print out the statement if this condition is met
                        System.out.println("\nPrint job " + myPrinter.getNumber() + " inserted in Queue 3\n");
                   }
                   numOfJobsPrintedAlready++; //We need to increase the number of jobs already printed for the program to work ok
                }
                //We need to increase the start time of print jobs so that the program can move on to print the remaining jobs
                startTimeOfPrintJob++;
                nextJob++; //Increase the next job variable
            }

        //These condition checks if the printer is the printer is idle, determine the next job to be submitted to the printer
        if(queue1.isEmpty()==false){ // If queue 1 is empty is false, submit the print document to the printer
            print.addPrintJob(PrintDocument); //Submit the selected job to the printer
            SystemPrinting myPrinter = queue1.poll(); //remove it from its queue

            //Print out the statement to the user showing that the job is sent to the printer
            System.out.println("Print job "+ myPrinter.getNumber() + " is being submitted to the printer\n");

            if(queue1.isEmpty()==true){//Else print out a statement showing that the print job is done
                System.out.println("Print job "+ myPrinter.getNumber() +" is done\n");
            }
        }
        if(queue2.isEmpty()==false){ // If queue 2 is empty is false, submit the print document to the printer
            print.addPrintJob(PrintDocument); //Submit the selected job to the printer
            SystemPrinting myPrinter = queue2.poll(); //remove it from its queue

            //Print out the statement to the user showing that the job is sent to the printer
            System.out.println("Print job "+ myPrinter.getNumber() + " is being submitted to the printer\n");
            if(queue2.isEmpty()==true){ //Else print out a statement showing that the print job is done
                System.out.println("Print job "+ myPrinter.getNumber() +" is done\n");
            }
        }
        if(queue3.isEmpty()==false){ // If queue 3 is empty is false, submit the print document to the printer
            print.addPrintJob(PrintDocument); //Submit the selected job to the printer
            SystemPrinting myPrinter = queue3.poll(); //remove it from its queue

            //Print out the statement to the user showing that the job is sent to the printer
            System.out.println("Print job "+ myPrinter.getNumber() + " is being submitted to the printer\n");
            if(queue3.isEmpty()==true){ //Else print out a statement showing that the print job is done
                System.out.println("Print job "+ myPrinter.getNumber() +" is done\n");
            }
        }
        //Break if all the queues' isEmpty() are true
        if(queue1.isEmpty() == true && queue2.isEmpty() == true &&queue3.isEmpty() == true){
            break;
        }
      }//End of while loop
    }
}//End of Class
