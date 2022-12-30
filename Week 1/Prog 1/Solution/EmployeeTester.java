package edu.ilstu;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

/**
 * Program to test the HourlyEmployee class Note: this is not a well-designed
 * program. We will look at better ways to handle this kind of testing later in
 * the semester
 * @author Mary Elaine Califf and Eric Agyemang
 */
public class EmployeeTester
{
    public static void main(String[] args) throws IOException
    {
        // create an employee using all arguments
        HourlyEmployee emp1 = new HourlyEmployee("John Doe", "B0001", 20, 10, 50, 1000);
        // print the id
        System.out.println("ID (should be B0001): " + emp1.getEmployeeID());
        // print the toString
        System.out.println(emp1.toString());

        // create a new employee -- no history
        HourlyEmployee emp2 = new HourlyEmployee("Margaret Brennan", "A1000", 15);
        // print the id
        System.out.println("ID (should be A1000): "+ emp2.getEmployeeID());
        // print the toString
        System.out.println(emp2.toString());

        // read in the first three employees in empData1.txt
        Scanner infile = null;
        try
        {
           infile = new Scanner(new File("empData1.txt"));
           while(infile.hasNext()){
               String input = infile.nextLine();
               System.out.println(input);
           }
        }
        catch (IOException e)
        {
            System.err.println("empData1.txt file not found " + e.getLocalizedMessage());
            System.exit(1);
        }
        // we can go on using the Scanner with confidence here because the program will
        // have exited if there was a problem
        HourlyEmployee emp3 = new HourlyEmployee("Mary Smith", "A5102",18.25,10.0,80.0,1460.00);
        emp3.read(infile);
        System.out.println(emp3.toString());

        // read the next into emp4 and print it
        HourlyEmployee emp4 = new HourlyEmployee("John Jones", "B6820",16.50,2.5,20.0,330.0);
        emp4.read(infile);
        System.out.println(emp4.toString());


        // read the next into emp5 and print it
        HourlyEmployee emp5 = new HourlyEmployee("Robert Does","A1001", 17.50, 20.0 ,80.0, 1360.00);
        emp5.read(infile);
        System.out.println(emp5.toString());

        // close the input file
        infile.close();

        // now let's write all 5 employees to testOutput.txt and confirm that it has the
        // same contents as the sample mec_testOutput.txt file
        // we'll just do everything here inside the try
        try
        {
            // create PrintWriter
            FileWriter fileOut = new FileWriter("testOutput.txt");
            PrintWriter pw = new PrintWriter(fileOut);

            // write each of the 5 employees
            pw.println("John Doe");
            pw.print("B0001"+" ");
            pw.print(20.0 +" ");
            pw.print(10.0 +" ");
            pw.print(50.0 +" ");
            pw.print(1000.0 +" ");

            pw.println("\nMargaret Brennan");
            pw.print("A1000"+" ");
            pw.print(15.0+" ");
            pw.print(0.0+" ");
            pw.print(0.0+" ");
            pw.print(0.0+" ");

            pw.println("\nMary Smith");
            pw.print("A5102"+" ");
            pw.print(18.25+" ");
            pw.print(10.0+" ");
            pw.print(80.0+" ");
            pw.print(1460.0+" ");

            pw.println("\nJohn Jones");
            pw.print("B6820"+" ");
            pw.print(16.5+" ");
            pw.print(2.5+" ");
            pw.print(20.0+" ");
            pw.print(330.0+" ");

            pw.println("\nRobert Doe");
            pw.print("A1001");
            pw.print(17.5+" ");
            pw.print(20.0+" ");
            pw.print(80.0+" ");
            pw.print(1360.0+" ");
            // and close the file
             pw.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println(("Error writing to testOutput.txt " + e.getLocalizedMessage()));
            // we won't bother to exit here
        }

        // now we need to test the handle pay method
        // first a simple case -- emp1 works 40 hours, using no leave
        emp1.handlePay(40, 0);
        // be sure to print the toString to make sure the object was updated correctly
        System.out.println(emp1.toString());

        // then a case overtime using no leave, emp2 works 45 hours, using no leave
        emp2.handlePay(45, 0);
        System.out.println(emp2.toString());
        // Now let's do a case where the leave is more than the employee has available
        //  emp3 works 24 hours, using 16 hours leave
        emp3.handlePay(24, 16);
        System.out.println(emp3.toString());

        // Now we need a case where the leave is limited because it pushed the total over 40 hours
        //  emp4 works 39 hours, using 2 hours leave
        emp4.handlePay(39, 2);
        System.out.println(emp4.toString());

        // And finally we need a case where the leave is limited for both reasons
        // emp5 works 25 hours, using 25 hours leave
        emp5.handlePay(25, 25);
        System.out.println(emp5.toString());

        // Finally, let's make sure we can read in what we wrote -- we'll just do the first two
        // this time we'll do everything in the try
        Scanner infile2 = null;
        try
        {
            // open the file
            infile2 = new Scanner(new File("testOutput.txt"));
             // read into emp1 and emp2
            while(infile2.hasNext()){
                String input2 = infile2.nextLine();
                System.out.println(input2);
        }
            }
        catch (FileNotFoundException e)
        {
            System.err.println("testOutput.txt file not found " + e.getLocalizedMessage());
            System.exit(1);
        }
         // print the toString for each of emp1 and emp2
         emp1.read(infile2);
         System.out.println(emp1.toString());

         emp2.read(infile2);
         System.out.println(emp2.toString());


    }
}

