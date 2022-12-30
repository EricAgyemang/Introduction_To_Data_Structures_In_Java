package edu.ilstu;

//This is the test class that test all classes and methods to determin how well they are functioning in the program
public class Test {
   //This is the main method of the class
   public static void main(String[] args) {

      //Creating the two Employee objects using the information provided in the problem
       Employee emp1 = new Employee("Linda Ward", 26, "Female", 17.8, 22.7); //The first employee object created
       Employee emp2 = new Employee("Linda Ward", 26, "Female", 19.3, 17.8); //The second employee object is created

       System.out.println(); //Empty space is printed

       //printing the employee information as directed in the problem
       System.out.println("The Employee information are:");
       System.out.println("Employee 1: \n" + emp1.toString()); //This prints out the first employee object's information
       System.out.println("Employee 2: \n" + emp2.toString()); //This prints out the second employee object's information
       System.out.println();  //Empty space is printed


       //print out the comparison of both employee objects whether or not they are equal
       System.out.println("emp1.equals(emp2) is: " + emp1.equals(emp2));

       //Print out a statement if true that both employees are same person and false otherwise
       if(emp1.equals(emp2)){
           System.out.println("These two employees are the same person."); //Statement if condition is true
       }else{
           System.out.println("These two employees are different person."); //Statement if condition is false
       }

        //Creating the two Student objects using the information provided in the problem
        Student stud1 = new Student("James Smith", 21, "Male", "Computer Science", 350, 4); //The first student object is created
        Student stud2 = new Student("James Smith", 21, "Male", "Information Technology", 281, 3); //The second student object is created

        System.out.println(); //Empty space is printed

        //printing the student information as directed in the problem
        System.out.println("The Student information are:");
        System.out.println("Studnet 1: \n" + stud1.toString()); //printing out the first student object's information
        System.out.println("Student 2: \n" + stud2.toString()); //printing out the second student object's information
        System.out.println(); //Empty space is printed

        //print out the comparison of both student object whether or not they are equal
        System.out.println("stud1.equals(stud2) is: " + stud1.equals(stud2));
        if(stud1.equals(stud2)){
           System.out.println("These two Students are the same person."); //Statement if condition is true
        }else{
           System.out.println("These two Studnets are different person.");//Statement if condition is false
           System.out.println(); //Empty space is printed
        }

   }
}
