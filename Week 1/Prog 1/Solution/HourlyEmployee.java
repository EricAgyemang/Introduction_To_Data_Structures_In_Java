package edu.ilstu;
import java.io.PrintWriter;
import java.util.*;
import java.text.NumberFormat;
import javax.swing.text.NumberFormatter;


//This is an employee hourly  details that specifies the details of the employee and hours of work
public class HourlyEmployee {
    private String name;
    private String employeeID;
    private double hourlyRate;
    private double accruedLeaveHours;
    private double annualHoursWorked;
    private double annualEarnings;

public HourlyEmployee(){ }
NumberFormat form = NumberFormat.getCurrencyInstance();
public HourlyEmployee(String name) {
    this.name = name;
}
public HourlyEmployee(String name,String employeeID,double hourlyRate){
    this.name = name;
    this.employeeID=employeeID;
    this.hourlyRate=hourlyRate;
}

public HourlyEmployee(String name,String employeeID,double hourlyRate,double accruedLeaveHours, double annualHoursWorked,double annualEarnings){
    this.name = name;
    this.employeeID = employeeID;
    this.hourlyRate = hourlyRate;
    this.accruedLeaveHours = accruedLeaveHours;
    this.annualHoursWorked = annualHoursWorked;
    this.annualEarnings = annualEarnings;
}

public String getEmployeeID(){
    return employeeID;
}

public String getName(){
    return name;
}

public String toString(){
    return "Name: " + name + "\nID: " + employeeID + "\nPay Rate: " + form.format(hourlyRate) +"\nAccrued Leave: "+ accruedLeaveHours + "\nAnnual Hours Worked: " + annualHoursWorked + "\nAnnual Earnings: "+ form.format(annualEarnings);
}

public String read(Scanner input){
    StringBuffer sb = new StringBuffer();
    while(input.hasNext()){
        sb.append(input.nextLine());
    }
    return sb.toString();
}


public void write(PrintWriter writeFile){
    PrintWriter pw = new PrintWriter(writeFile);
    try
    {
        write(pw);
    }
    finally{
        pw.close();
    }
}

public void handlePay(double weekHoursWorked, double weekLeaveUsed){
    double weekPay;
    double overtimePay;

    // Calculate regular and overtime pay based on hoursworkd
    if (weekHoursWorked + weekLeaveUsed <= 40) {
            overtimePay = 0;
            weekPay = (weekHoursWorked + weekLeaveUsed) * hourlyRate;
            System.out.println(name + " earned " + form.format(weekPay) + " and has "+ weekLeaveUsed + " hours of leave accrued");
    }
    else if(weekHoursWorked > 40 && weekLeaveUsed==0){
        overtimePay = (weekHoursWorked-40)*hourlyRate;
        weekPay = (weekHoursWorked* hourlyRate-overtimePay)  + overtimePay;
        System.out.println(name +" earned " + form.format(weekPay) + " and has "+ weekLeaveUsed + " hours of leave accrued");
    }else {
            weekPay = 40 * hourlyRate;
            overtimePay = 0;
            System.out.println(name + " earned " + form.format(weekPay) + " and has "+ weekLeaveUsed + " hours of leave accrued");
    }
    }
}
