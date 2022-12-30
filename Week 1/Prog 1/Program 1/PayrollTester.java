/**
 * Program to test the Payroll class
 * @author Mary Elaine Califf
 */
public class PayrollTester 
{
    public static void main(String[] args) {
        Payroll companyPayroll = new Payroll();

        // read the empData1.txt file
        companyPayroll.readFile("empData1.txt");

        // write that to the file empDataOut.txt -- make sure the two are the same
        companyPayroll.writeFile("empDataOut.txt");

        // let's add a new employee
        HourlyEmployee emp1 = new HourlyEmployee("Margaret Brennan", "A1000", 15);
        companyPayroll.addEmployee(emp1);

        // write that to the file empDataOut2.txt -- make sure Margaret's data is correct
        companyPayroll.writeFile("empDataOut2.txt");

        // let's add an employee with all data
        HourlyEmployee emp2 = new HourlyEmployee("John Doe", "B0001", 20, 10, 50, 1000);
        companyPayroll.addEmployee(emp2);

        // write that to the file empDataOut3.txt -- make sure Margaret's data is correct
        companyPayroll.writeFile("empDataOut3.txt");

        System.out.println("Displaying data for empID B6820");
        companyPayroll.displayEmployee("B6820");

        System.out.println("\nDisplaying data for empID A1000");
        companyPayroll.displayEmployee("A1000");

        System.out.println("\n Displaying data for non-existent empID D9999");
        companyPayroll.displayEmployee("D9999");

        System.out.println("\nDisplaying data for all employees");
        companyPayroll.displayAllEmployees();

        System.out.println("Running payroll from paydata1.txt");
        companyPayroll.runPayroll("paydata1.txt");
        System.out.println("\nDisplaying data for all employees");

        System.out.println("Running payroll from paydata2.txt");
        companyPayroll.runPayroll("paydata2.txt");
        System.out.println("\nDisplaying data for all employees");

        System.out.println("Running payroll from paydata3.txt");
        companyPayroll.runPayroll("paydata3.txt");
        System.out.println("\nDisplaying data for all employees");

        // printing the final version to empDataOut4.txt
        companyPayroll.writeFile("empDataOut4.txt");

    }
}
