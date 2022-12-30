import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Program to test the HourlyEmployee class Note: this is not a well-designed
 * program. We will look at better ways to handle this kind of testing later in
 * the semester
 * 
 * @author Mary Elaine Califf and <your name here>
 */
public class EmployeeTester
{
    public static void main(String[] args)
    {
        // create an employee using all arguments
        HourlyEmployee emp1 = new HourlyEmployee("John Doe", "B0001", 20, 10, 50, 1000);
        // print the id
        System.out.println("ID (should be B0001): " + emp1.getEmployeeID());
        // print the toString
        System.out.println(emp1);

        // create a new employee -- no history
        HourlyEmployee emp2 = new HourlyEmployee("Margaret Brennan", "A1000", 15);
        // print the id
       
        // print the toString
        

        // read in the first three employees in empData1.txt
        Scanner infile = null;
        try
        {
            
        }
        catch (/* provide the argument here */)
        {
            System.err.println("empData1.txt file not found " + e.getLocalizedMessage());
            System.exit(1);
        }
        // we can go on using the Scanner with confidence here because the program will
        // have exited if there was a problem
        HourlyEmployee emp3 = new HourlyEmployee();
        emp3.read(infile);
        System.out.println(emp3);

        // read the next into emp4 and print it
        
        // read the next into emp5 and print it


        // close the input file


        // now let's write all 5 employees to testOutput.txt and confirm that it has the
        // same contents as the sample mec_testOutput.txt file
        // we'll just do everything here inside the try
        try
        {
            // create PrintWriter

            // write each of the 5 employees


            // and close the file

        }
        catch (/* provide the argument here */)
        {
            System.err.println(("Error writing to testOutput.txt " + e.getLocalizedMessage()));
            // we won't bother to exit here
        }

        // now we need to test the handle pay method
        // first a simple case -- emp1 works 40 hours, using no leave
        emp1.handlePay(40, 0);
        // be sure to print the toString to make sure the object was updated correctly
        System.out.println(emp1);

        // then a case overtime using no leave, emp2 works 45 hours, using no leave


        // Now let's do a case where the leave is more than the employee has available
        //  emp3 works 24 hours, using 16 hours leave


        // Now we need a case where the leave is limited because it pushed the total over 40 hours
        //  emp4 works 39 hours, using 2 hours leave


        // And finally we need a case where the leave is limited for both reasons
        // emp5 works 25 hours, using 25 hours leave


        // Finally, let's make sure we can read in what we wrote -- we'll just do the first two
        // this time we'll do everything in the try
        try
        {
            // open the file

            // read into emp1 and emp2

            // close the file

            // print the toString for each of emp1 and emp2

        }
        catch (/* provide the arguments here */)
        {
            System.err.println("testOutput.txt file not found " + e.getLocalizedMessage());
            System.exit(1);
        }
 

    }
}
