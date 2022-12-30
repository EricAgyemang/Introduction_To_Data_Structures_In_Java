package edu.q02;

//The is the class of TWArraylist2 that helps us to test the methods in the TWArrayList class
public class TWArrayListTest2 {
    //The main method is defined
    public static void main(String[] args) {

        //We create an array list using the constructor TWArrayList()
        TWArrayList<String> mylist = new TWArrayList<String>();

        //We call the addFirst method two times.
        mylist.addFirst("sun1");
        mylist.addFirst("sun2");

        //print a statement showing the output
        System.out.println("\nAfter calling the addFirst method two times: ");
        mylist.printList();  //call the printList method to display the output

        //Calling the removeFirst method three times
        mylist.removeFirst();
        mylist.removeFirst();
        mylist.removeFirst();

        //print a statement showing the output
        System.out.println("After calling the removeFirst method three times: ");
        mylist.printList();  //call the printList method to display the output

    }
}
