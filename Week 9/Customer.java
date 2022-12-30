
package edu.ilstu;
public class Customer
{
    static int currentID = 0;
    private int custID;
    private int age;
    private int arrivalTime;

    public Customer(int custAge, int arrTime)
    {
        custID = ++currentID;
        age = custAge;
        arrivalTime = arrTime;
    }

    public int getID()
    {
        return custID;
    }

    public int getAge()
    {
        return age;
    }

    public int getArrivalTime()
    {
        return arrivalTime;

    }

    public String toString()
    {
        return "CustID = " + custID + ", Arrival Time = " + arrivalTime + ", Age = " + age;
    }

}
