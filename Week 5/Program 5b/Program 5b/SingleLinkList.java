package edu.ilstu;

import java.util.ArrayList;

/*
This is a Single linked list class of the generic type with parameter of E. This classshas an inner static
method called Noded, and it has the addBulk method and the reveredList method
*/
public class SingleLinkList<E> {
    //the private attributes are declared
        private Node<E> head;
        private int size;

    //This is a constructor of the class and it sets the head to null and size to zero
    //This constructor will be used to invoke the class in the demo class to test the methods defined here
    public SingleLinkList(){
        head = null;
         size = 0;
    }

    //This is the inner class that is static and has a generic type with the parameter of E
    private static class Node<E>{

        //The private method of the data and next are declared
        private E data;
        private Node<E> next;

        //The constructor of the inner class that takes a data as argument is defined here
        private Node(E data){
            this.data=data;
            this.next=null;
        }//end of constructor

        //The constructor of the inner class that takes a data and the next as arguments is defined here
        private Node(E data, Node<E> next){
            this.data=data;
            this.next=next;
        }
    }//end of constructor

    //This is the addBulk method that accepts an arraylist as a parameter and append the current singlelist
    //with all the elements that are in the arraylist
        public void addBulk(ArrayList<E>myArrayList){

            Node<E>temp; //a temporary reference is declared
            if(head == null){  //this is an if condition to test when the head is null
                temp = null;   //set the temporary reference to null if this condion is met
            }else{
                temp = head; //If condition fails, let the temparary reference point to the head
                while(temp.next!=null){

                   //We set the temporary reference to the next node after temp while condition is meet
                    temp = temp.next;
                }
            }
            //This is a for loop to get the data item if i is less than the size of the arraylist
            for(int i= 0; i< myArrayList.size(); i++){
                E dataItem = myArrayList.get(i); //get the data item at i
                if(head==null){
                    head = new Node<>(dataItem); //let the head point to the new node with the data item
                    temp = head; //let temp points to the head
                }else{

                    //if head is not null, let temp.next point at the new node with the data item at i
                    temp.next = new Node<>(myArrayList.get(i));
                    temp = temp.next; //now let temp point it next node after temp
                }
                size++; //we need to increase the size of the arraylist
            }
        } //end of method

        //This is the revered list method that returns a revered version of the current single list when
        //The method is called
        public void reversedList(){
            Node<E>currNode = head; //Let the current node points at the head
            Node<E>prevNode = null; //let the previous node point at null

            while(currNode!=null){    //We use the while loop to walk through all nodesto reverse the order of the nodes
                Node<E>temp = currNode.next;   //let temp points at the node after current node
                currNode.next = prevNode;   //let the node after current node point at the previous node
                prevNode = currNode;    //Now let the previous node point at current node
                currNode = temp;      //let current node point at temp.
            }
            head = prevNode;      //Now let the head point at the previous node
        }//end of method



        //this method help us to print all outputs to the console
        public String toString(){
            String resultOutcome = " "; //Initialize a result outcome variable

            Node<E>temp = head; //let temp points to the head

            while(temp!=null){ //use a while loop tp walk through all nodes
                resultOutcome += temp.data + " => "; //set the outcomes as desired
                temp = temp.next; //let temp point at temp.next
            }
        return resultOutcome; //We return the result outcome
        }//end of method
}//end of class
