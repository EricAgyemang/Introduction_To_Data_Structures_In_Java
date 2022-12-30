package edu.ilstu;

import java.text.DecimalFormat;

//This is the class of student that extends the person class and implements its abstract classes
public class Student extends Person {

    //Declaring the attributes fot the class
    private String major;
    private double totalGrade;
    private int numberOfCourses;

    //The Student constructor is defined
    public Student(String name, int age, String gender, String major, double totalGrade, int numberOfCourses){
        super(name, age, gender);
        this.major=major;
        this.totalGrade=totalGrade;
        this.numberOfCourses=numberOfCourses;
    }

    //The get average grade method is defined
    public double getAverageGrade(){
        return(totalGrade/numberOfCourses);
    }

    //This is the to string method that displays the students information.
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); //We use the decimal format to format the output
        return "Name: "+ getName() + ", Age: "+ getAge() + ", Gender: " + getGender() + " , Major: "+ major + " , Total Grade: " + df.format(totalGrade) + " , Number of Cources: " + numberOfCourses+ " , Average Grade: "+ df.format(getAverageGrade());
    }

//This is the equals method that tests the equality of objects of the class
    @Override
    public boolean equals(Object obj){
        if(obj == this)  //This checks for equality of the object and its self
            return true; //return true if condition is fulfiled
        if(obj == null)  //If object is null, we check that condition
            return false; //returns false for this condition
        if(this.getClass()==obj.getClass()){
        Student stud = (Student) obj; //casting the obj to Student object
        return getName().equals(stud.getName()) && getAge()== stud.getAge() && major.equals(stud.major);
        }
        else{  //If all conditions fail return false
            return false;
        }
    }
}
