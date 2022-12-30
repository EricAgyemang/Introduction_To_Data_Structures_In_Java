package edu.ilstu;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

//This is the payroll class that manages an employee payroll details
public class Payroll {
    private static final int MAX_NUMBER_OF_EMPLOYEES = 100;

    HourlyEmployee[] hourlyEmp = new HourlyEmployee[MAX_NUMBER_OF_EMPLOYEES];
    int numCurrentEmployee = 0;
    public Payroll(){
    }

    public List<String> readFile(String fileName){
        List<String>lines = Collections.emptyList();
        try{
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println(lines);
        }
        return lines;

    }

    public void writeFile(String fileName) throws IOException{
       BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
       writer.append(fileName);
       System.out.println("Successfully written to a file");
       writer.close();
    }


public void addEmployee(HourlyEmployee hourlyEmployee){
    for(int i=0; i<numCurrentEmployee; i++){
        hourlyEmp[numCurrentEmployee]  = new HourlyEmployee();
        numCurrentEmployee ++;
    }
}

public void  displayEmployee(String employeeID){

      HourlyEmployee t = findEmployee(employeeID);
System.out.println(t);
        }


public void displayAllEmployees(){
        for(int i=0; i<numCurrentEmployee;i++){
          System.out.println(hourlyEmp[i].toString());
       }
    }

public void runPayroll(String fileName) throws IOException{

    FileOutputStream fos = null;
    try{
        fos = new FileOutputStream(fileName);
        PrintWriter outP = new PrintWriter(fos);
        outP.write(fileName);
        for(int i=0;i<numCurrentEmployee;i++){
            hourlyEmp[i].handlePay(0, 0);
    }
    outP.close();
    }catch(FileNotFoundException e){
        e.printStackTrace();
        System.out.print("the file is not found");
    }
}

private HourlyEmployee findEmployee(String employeeID){
    boolean found = true;
    int i = 0;
    while (!found && i<hourlyEmp.length){
        if(hourlyEmp[i].getEmployeeID().equals(employeeID)){
            found = true;
        }else{
            i++;
        }
    if(found){
        hourlyEmp[i].toString();
    }
}
return hourlyEmp[i];
}
}
