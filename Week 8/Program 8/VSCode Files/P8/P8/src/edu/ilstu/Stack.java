package edu.ilstu;

import java.util.*;
/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Assignement 8
 */
//This is the class of stack that uses a singly linked list representation of char
public class Stack<E> {

    //The top of node reference is declared
    private Node<E>topOfStackRef=null;

    //The size of the list is declared
    private int size = 0 ;


    //A construction of the stack class is defined
    public Stack(){
        topOfStackRef=null;
        size = 0;
    }

     //A construction of the stack class is defined to take a data item and connect it to the top of the stack
    public Stack(E data){
        topOfStackRef = new Node<>(data);
        size = 1;
    }

    //The size method is defined
    public int size() {
        return this.size;

    }


    //This is the inner class of Node that has the details of the nodes of the LinkedStack
    private static class Node<E> {
        private E data; //The data item is defined
        private Node<E> next; //the reference to the next stack is defined

        //This getData method is defined
        public E getData() {
            return data;
        }

        //The getNext method is defind
        public Node<E> getNext(){
            return this.next;
        }

        //The setNext method is defined
        public Node<E> setNext(Node<E> next){
            return this.next=next;
        }

        //This is a constructor of the inner class that has a data item and set the next to null
        private Node(E data){
            this.data = data;
            this.next = null;
        }

       //This is also the constructor that sets a node to the next node
        private Node(E data, Node<E>next){
        this.data = data;
        this.next = next;
        }
    }//end of static class


       //This is the push method used to push items onto the top of the stack
        public void push(E item) {
        //Check for empty stack condition and connect the new node as the top of the stack
        if (this.isEmpty()){
            topOfStackRef = new Node<>(item);
            size++; //Increase the size of the stack
        }//Else if the next node is null create a new node with data item and set the node to that new node
        else if (topOfStackRef.getNext() == null){
                    Node<E> newNode = new Node<>(item);
                    newNode.setNext(topOfStackRef);
                    topOfStackRef= newNode;
                    size++; //Increase the size
        }else{
            Node<E> newNode = new Node<>(item);
            newNode.setNext(topOfStackRef);
            topOfStackRef = newNode;
            size++;
        }
        }

        //This is the pop method that helps to remove an object from the stack
        public E pop() {
            if (this.isEmpty()){ //First check for no such element exception
                throw new NoSuchElementException ();
            }
            Node<E> node = topOfStackRef;//Create a node reference to the top of stack
            topOfStackRef = topOfStackRef.getNext(); //let the top of stack point to the next
            size--; //reduce the size
            node.setNext(null); //set the current node to null to remove it from the stack
            return node.getData();//return the data item
        }

        //This is the top method that helps to display the content of the top of the stack
        public E top() {
            if (this.isEmpty()){ //First check for no such element exception
            throw new NoSuchElementException();
            }
            //Create a node pointer to the top of the stack
            Node<E> node = topOfStackRef;
            return node.getData(); //return the data item at the top
        }


        public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
        }

        //This is the equals method that helps to check if two objects are equal
       @SuppressWarnings("unchecked")
       @Override
       public boolean equals(Object obj){

        //first check object and its self. Return true is true
            if(this==obj){
                return true;
            }
            //if object is an instance of the stack, create a stack object called other and case the obj to the stack
           if(obj instanceof Stack){
                Stack<E> other = (Stack<E>)obj;
                int n = size(); //Let n be the size of stack
                if(n==other.size()){
                    Node<E> n1 = topOfStackRef; ///let n1 be a node reference to the top of the stack
                    Node<E> n2 = other.topOfStackRef; //let n2 be a node reference to the othe top of the stack
                    while(n1!=null){ //whie n1 is null and its data is not same as n2's data, return false
                       if(n1.data!=n2.data){
                            return false;
                        }
                    n1 = n1.next; //next n1 to the next of n1
                    n2 = n2.next; //Set n2 to the next of n2
                    }
                return true; //return true
                }
            }
        return false; //Return false if false
        }

        //This is the clear method that helps to pop all items from the stack
        public void clear(){
            while(!isEmpty()){
            pop();
            }
        }
}//End of stack class
