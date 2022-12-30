package edu.ilstu;
/*
 Course:IT 179
 Program: 6
 Author:Eric Agyemang
*/

//QUESTION 2


//This is the DoubleLinkedListDemo class that is used to test the methods opned in this program
public class DoubleLinkedListDemo{

    //This is the main method declared as main
    public static void main(String[] args) {

        //The object of the Doube-linked list class is declared as myLis of strings
        DoubleLinkedListImplementation<String> myList = new DoubleLinkedListImplementation<>();

       // a. builds the list shown in Figure 1.
       //Print out a statement for the user
        System.out.println("\na) Printing the double-linked List shown in Figure 1, ");

        myList.addLast("Tom"); //Add the node containing "Tom" as the head
        myList.addLast("Dick"); //Adding the second node containing the data item "Dick"
        myList.addLast("Harry"); //Adding the third node containing the data item "Harry"
        myList.addLast("Sam");   //Adding the fourth node containing the data item "Sam"
        myList.printLinkedList(); //print to the console the list

        //b. Insert "Bill" before "Tom"
        //Print out a statement to for the user
        System.out.println("\n\nb) Inserting Bill before Tom, ");
        myList.addBefore("Bill", "Tom"); //call the addBefore method to add Bill before Tom
        myList.printLinkedList(); //Print out the list after adding Bill before Tom

        //c. Insert "Sue" before "Sam"
        //Print out a statement to for the user
        System.out.println("\n\nc) Inserting Sue before Sam, ");
        myList.addBefore("Sue", "Sam"); //Adding Sue before Sam
        myList.printLinkedList(); //print out the List

        //d. Remove "Bill"
        //Print out a statement to for the user
        System.out.println("\n\nd) Removing Bill from the list,");
        myList.remove("Bill"); //Removing Bill from the list
        myList.printLinkedList(); //Print out the list 

        //e.Remove "Sam"
        //Print out a statement to for the user
        System.out.println("\n\ne) Removing Sam from the list,");
        myList.remove("Sam"); //call remove method to remove Sam from the list
        myList.printLinkedList(); //Print out the list after removing Sam

        System.out.println("\n"); //Print an empty space

}
}
