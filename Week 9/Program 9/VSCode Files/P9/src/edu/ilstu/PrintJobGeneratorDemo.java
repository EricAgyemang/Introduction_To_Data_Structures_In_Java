package edu.ilstu;
/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 9
 */
//This is the class of PrintJobGeneratorDemo, to help print out the required output
public class PrintJobGeneratorDemo {

    //This is the main method declared as main
    public static void main(String[] args) {

        //We initialize the new print variable to print the output
        int nextPrint = 0;

        //A while loop to walk through the jobs with TOTAL_NUMBER_OF_JOBS to be printed
        while(nextPrint < PrintJobs.TOTAL_NUMBER_OF_JOBS){

            //Call the generateNewJob() method here
            PrintJobs.generateNewJob();
            nextPrint++; //Increase the newPrint object
        }
    }
}//End of class
