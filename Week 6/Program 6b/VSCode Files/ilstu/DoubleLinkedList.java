package edu.ilstu;

/*
 Course:IT 179
 Program: 6
 Author:Eric Agyemang
*/

//QUESTION 2


/*
 * This is a Double-Linked List class that demonstrate the built list shown in in figure 1.
 * It also helps to insert and remove an a node from the list as required.
 * One issue is that, this program does not produce an output since no avenue to print output is covered.

 * The application of duble-linked list using the methods in the API has been added which will print the list
 * to the console when run.
 */
public class DoubleLinkedList<E> {

    //The field attributes are declared as private
    private Node<E> head;
    private Node<E> tail;


    //This is a  constructor that sets the head and tail to null
    public DoubleLinkedList(){
        head = null;
        tail = null;
    }

    //This is a static inner class called Node
    private static class Node<E>{

        //The data item is declared
        private E data;

        //The next node to take a node to the next node is declared
        private Node<E>next = null;

        //The previous node to take a node to the previous node is declared
        private Node<E>prev = null;

        //The constructor of the inner class that takes a data as argument is defined here
        private Node(E data){
            this.data=data;
        }//end of constructor

        //The constructor of the inner class that takes a data, the next, and previous as arguments is defined here
        private Node(E data, Node<E> next, Node<E>prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }//end of constructor

     //This method help us to print all outputs to the console
     public String toString(){
        String resultOutcome = " "; //Initialize a result outcome variable

        Node<E>temp = head; //let temp points to the head

        while(temp!=null){ //use a while loop tp walk through all nodes
            resultOutcome += temp.data + " => "; //set the outcomes as desired
            temp = temp.next; //let temp point at temp.next

            System.out.println(temp);
        }
    return resultOutcome; //We return the result outcome
    }//end of method

    //This is the main method declared as main
    public static void main(String[] args) {

        //We build up the double-linked list as shown in figure 1
        Node<String>tom = new Node<>("Tom"); //Create an object with Tom as data in the node
        Node<String>dick = new Node<>("Dick"); //Create an object with Dick as data in the node
        Node<String>harry = new Node<>("Harry"); //Create an object with Harry as data in the node
        Node<String>sam = new Node<>("Sam"); //Create an object with Sam as data in the node

        //We connect Tom to Dick
        tom.next = dick;

        //Connect Dick to Tom
        dick.prev=tom;

        //Connect Dick to Harry
        dick.next=harry;

        //Connect Harry to Dick
        harry.prev=dick;

        //Connect Harry to Sam
        harry.next=sam;

        //Connect San to Harry
        sam.prev=harry;

        //let Tom be the head
        Node<String>head = tom;

        //let Sam be the tail
        Node<String>tail = sam;


        //Create a node call Bill connected to Tom and let Bill be the head
        Node<String>bill = new Node<>("Bill", tom, null);
        head = bill;

        //Create a node called Sue 
        Node<String>sue = new Node<String>("Sue");

        //let Sue be connected to Sam
        sue.next = sam;

        //let Sue's previous be connected to Sam's previous
        sue.prev=sam.prev;
        sue.prev.next = sue; //let the node before Sue be connected to Sue
        sam.prev = sue;  //let Sam be connected to Sue here


        //Remove Bill
        head = head.next; //move head tp the next node
        head.prev = null; //let head's previous be null
        bill.next = null; //set Bill to null

        //Remove sam
        sam.prev.next = sam.next; 
        sam.prev=null;


    }


}
