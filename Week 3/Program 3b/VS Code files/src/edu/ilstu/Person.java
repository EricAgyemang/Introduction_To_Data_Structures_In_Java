package edu.ilstu;

//This is an abstract super class of Person that has the person attributes and 
//methods including abstract methods
public abstract class Person {

    //We declare the attributes of the class
    private String name;
    private int age;
    private String gender;

    //The person constructor is defined as Person
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //The get name method is defind
    public String getName(){
        return name;
    }

    //The get Age method is defined
    public int getAge(){
        return age;
    }

    //The get gender method is defined
    public String getGender(){
        return gender;
    }

    //This is the abstract method for the toString method
    public abstract String toString();

    //This is the abstract method for the equals method
    public abstract boolean equals(Object obj);
}
