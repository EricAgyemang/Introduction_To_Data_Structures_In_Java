package edu.ilstu;
/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 9
 */
//This is the SystemPrinting class that helps to assigns jobs to print queues based on the number of pages to be printed
public class SystemPrinting {

    //The attributes of the class are decleared and initialized
    static int jobNumber = 0;
    private int jobNum;
    private int pages;
    private int startTimeOfPrintJob;
    private boolean timeToPrint;

    //This is the constructor of the SystemPrinting
    public SystemPrinting(int pages, int startTimeOfPrintJob){
        jobNum = ++jobNumber;
        this.pages = pages;
        this.startTimeOfPrintJob = startTimeOfPrintJob;
    }

    //This is the getter for the jobNum attribute  and it returns the job number to a particular job to be printed
    public int getNumber(){
        return jobNum;
    }

    //This is the getter for the pages attribute and it returns the page numbers the pages to be printed
    public int getPages(){
        return pages;
    }

    //This is the getter for the isTimeToprint attribute and it determines if the time to print(1 minute) is due
    public boolean isTimeToPrint(){
        return timeToPrint;
    }

    //This is the getter for startTimeOfPrintJob attribute that returns the start time to print
    public int getStartTimeOfPrintJob(){
        return startTimeOfPrintJob;
    }

    //This is the equal method
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null)  //If object is null, we check that condition
            return false; //returns false for this condition is false
        if(this.getClass()==obj.getClass()){
            SystemPrinting otherPrint = (SystemPrinting)obj; //cast the object to Systemprinting and return 
            return getNumber() ==otherPrint.getNumber()&&getPages()==otherPrint.getPages()&&isTimeToPrint()==otherPrint.isTimeToPrint();
    }else{ //Return false if all conditons fail
        return false;
    }
}
}//End of class
