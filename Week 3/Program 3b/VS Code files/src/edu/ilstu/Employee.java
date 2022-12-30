package edu.ilstu;

import java.text.DecimalFormat;
//This is the employee class that extends the person class and implements all its abstract methods
public class Employee extends Person {

    //Declaring the variable of the class
    private double hour;
    private double rate;
    private double payment;

    //The employee class constructor is defind
    public Employee(String name, int age, String gender, double hour, double rate){
        super(name, age, gender);
        this.hour=hour;
        this.rate=rate;
    }

    //The get hour method is defind
    public double getHour(){
        return hour;

    }

    //The get rate method is defined
    public double getRate(){
        return rate;
    }

    //The get payment method is defined
    public double getPayment(){
        payment = rate*hour;
        return payment;
    }

    //The to string method from the person class is defined and implemented in the Employee class
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); //We format the output using the decimal format method
        return "Name: "+ getName() + ", Age: "+ getAge() + ", Gender: " + getGender()+ " , Hour: "+ df.format(hour) + " , Rate: "+ df.format(rate) + " , Payment: "+ df.format(getPayment());
        }

    //The equals method from the person class is defined and implemented here in the employee class
    @Override
    public boolean equals(Object obj){
        if(obj == this)     //This checks for equality of the object and its self
            return true;   //return true if condition is fulfiled
        if(obj == null)    //If object is null, we check that condition
            return false;   //returns false for this condition
        if(this.getClass()==obj.getClass()){
            Employee emp = (Employee)obj; //casting the obj to employee object
            return getName().equals(emp.getName()) && getAge() == emp.getAge() && getPayment() == emp.getPayment();
        }  //If all conditions fail return false
        else{
            return false;
        }
    }
}
