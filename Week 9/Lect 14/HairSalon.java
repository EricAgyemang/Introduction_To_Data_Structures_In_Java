package edu.ilstu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class HairSalon
{
    static private final int nbEvents = 50;
    static private final int maxAge = 100;
    static int currTime = 0;
    static int nbOldCustomerToServe = 2;

    static private Queue<Customer> queueOld = new LinkedList<Customer>();
    static private Queue<Customer> queueYoung = new LinkedList<Customer>();

    static Random rand = new Random();

    void printQueue(Queue<Customer> q)
    {

        for (Customer cust : q)
        {
            System.out.println("Customer #" + cust.getID() + ", Arrival Time = " + cust.getArrivalTime() + ", Age = "
                    + cust.getAge());
        }

    }

    private static void generateNewCustomer()
    {
        int age;
        // Generate random integers in range 0 to maxAge;
        System.out.print("New Customer: ");
        age = rand.nextInt(maxAge);
        Customer cust = new Customer(age, ++currTime);
        if (age > 50)
            queueOld.add(cust);
        else
            queueYoung.add(cust);

        System.out.println(cust);

    }

    private static void serveWaitingCustomer()
    {
        Customer cust;
        currTime++;
        if (queueOld.isEmpty() || (nbOldCustomerToServe == 0))
        {
            cust = queueYoung.poll();
            System.out.println("Now serving customer " + cust);
            nbOldCustomerToServe = 2;
        }
        else
        {
            nbOldCustomerToServe--;
            cust = queueOld.poll();
            System.out.println("Now serving customer " + cust);
        }
    }

    public static void main(String[] args)
    {
        int nextEvent;
        for (int i = 0; i < nbEvents; i++)
        {
            nextEvent = rand.nextInt(2);
            if (nextEvent == 0)
                generateNewCustomer();
            else
                serveWaitingCustomer();

        }

    }

}
