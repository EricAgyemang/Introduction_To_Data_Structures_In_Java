package edu.ilstu;
/*
 Course:IT 179
 Program: 6
 Author:Eric Agyemang
*/

//QUESTION 2

//This is the Double-Linked List Implementation class that demonstrate the connection of a double-linked list
public class DoubleLinkedListImplementation<E> {

    //The fields attributes are declared here as private
    private Node<E> head; //This is the declaration of the head
    private Node<E> tail; //This is the declaration of the tail

    //This is a constructor that sets the head and tail to null
    public DoubleLinkedListImplementation(){
        head = null;
        tail = null;
    }//end of method

    //This is an inner static class called Node 
    private static class Node<E>{

        //The data item attribute is declared
        private E data;

        //The reference to the next node is declared and innitialized to null
        private Node<E>next = null;

        //The reference to the previous node is declared and innitialized to null
        private Node<E>prev = null;

        //The constructor of the inner class that takes a data as argument is defined here
        private Node(E data){
            this.data=data;
        }//end of constructor

        //The constructor of the inner class that takes a data item, the next, and previous as arguments is defined here
        private Node(E data, Node<E> next, Node<E>prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }//end of constructor

    //The addLast method is defined to build the double-linked list by adding a node to the last node
    public void addLast(E data){
        Node<E>node = new Node<>(data); //create a new node with a data item in that node
        if(head==null){ //If the head is null, connect the new node as head and let that node also be the tail
            head = node;
            tail = node;
        }else{
            tail.next = node; //If not, let the new node be connected to the tail
            node.prev=tail; //Set the new node's previous to connect to the tailed node that existed before the new node
            tail = node; //Let the new node be the tail
        }
    }//end of method

    //Create a method addBefore which will add a node before a specified node
    public void addBefore(E data, E obj){
        Node<E>node = new Node<>(data); //create a new node with a data item in the node
        Node<E>prevNode=null; //Initialize a previous node item by setting it to null
        Node<E>temp=head; //create a temporally node pointer pointing to the head

        //while loop sertifying the condition that temp is not null
        while(temp!=null){
            if(temp.data.equals(obj)){ //test if the tata in temp is the same as the object then break
                break;
            }
            prevNode= temp; //else set previous node to point to temp
            temp=temp.next; //let temp point to temp's next node
        }
        //Else if temp is null just return
        if(temp==null){
            return;
        }
        //if previous node is null just let node's next point to the head
        if(prevNode==null){
            node.next=head;
            head.prev=node;
            head = node; //let head point to the node
           return;
        }
        //Else let node's next point tp the previous nodes' next
        node.next = prevNode.next;
        node.prev=prevNode; //let node point to previous node
        prevNode.next=node; //let previous node point to node
        temp.prev=node; //let temp point to node
    }//end of method

    //Create a remove method that accepts a data item
    public void remove(E data){
        Node<E>prevNode = null; //let previous node be null
        Node<E>temp = head; //let the head be null

        //Use a while loop to check the condition that temp is not null and temp's data is not equal to the data
        while(temp!= null &&!temp.data.equals(data)){
            prevNode=temp; //let previous node point to temp
            temp=temp.next; //let temp point to next node
        }

        //if temp is null, just return
        if(temp==null){
            return;
        }

        //if previous node is null set the head to be next node after the head
        if(prevNode == null){
            head = head.next;

            //if head is null, set the tail to be null else set head's previous node to be null
            if(head==null){
                tail=null;
            }else{
                head.prev=null;
            }
            return;
        }

        //if temp is the tail, set tail to be the previous node and set tail's next to null
        if(temp==tail){
            tail=tail.prev;
            tail.next=null;
        }else{
            //else we will set the node after preious node to point to temp.next and also set temp.next to
            //point to previous node
            prevNode.next=temp.next;
            temp.next.prev=prevNode;
        }
    }//End of method

    //This is the print linked list method that help us to print to the console the list
    public void printLinkedList(){
        //Print out a message to the user showing the list from head to tail
        System.out.println("the double-linked list from head to tail is: "); 
        for(Node<E>node=head; node!=null; node=node.next){ //use a for loop to walk through all nodes 
            System.out.print(node.data + " <=> "); //print out the data at each node
        }
    }//end of method

}
