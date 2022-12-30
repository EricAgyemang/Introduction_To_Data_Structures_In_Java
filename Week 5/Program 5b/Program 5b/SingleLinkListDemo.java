package edu.ilstu;

import java.util.ArrayList;

//This is a class of single link list demo that is used for testing the methods of the single link
//list class.
public class SingleLinkListDemo {

    //This is the main method definded
    public static void main(String[] args) {

        //We declare an arraylist instance alled myArrayList that is used to add the list of big cities
        //in the USA.
        ArrayList<String>myArrayList = new ArrayList<>();

        myArrayList.add("New York");  //Add New York to the arraylist
        myArrayList.add("Los Angeles");  //Add Los Angeles to the arraylist
        myArrayList.add("Chicago");  //Add Chicago to the arraylist
        myArrayList.add("Houston");  //Add Houston to the arraylist
        myArrayList.add("Phoenix");  //Add Phoenix to the arraylist
        myArrayList.add("San Antonio");  //Add San Antonio to the arraylist

        //We create an object of the SingleLinkList class to be used to invoke the methods of the class
        SingleLinkList<String>myList = new SingleLinkList<>();

        //calling the addBulk method and useing it to add in bulk the contents of the arraylist to the singleLinkList
        myList.addBulk(myArrayList);

        //Printing out the output of the single link list with data item and connection to the next node
        System.out.println("\nThe single link list with each connected node to the next node and the data item in each node is given by: " );
        System.out.println(myList.toString() + "\n");
        //We want to call the arraylist object and add more nodes with data item to the single link list
        myArrayList = new ArrayList<>();

        //call the add method and apply it to myArrayList to add more data item to the arraylist
        myArrayList.add("Philadelphia");// Add Philadelphia to the arraylist
        myArrayList.add("San Diego");  //Add add San Diego to the arraylist
        myArrayList.add("Dallas");    //Add Dallas to the arraylist
        myArrayList.add("San Jose");  //Add New York to the arraylist


        System.out.println("Adding more nodes with data item in each node to the SingleLinkList. ");

        //calling the addBulk method and useing it to add in bulk the contents of the arraylist to the singleLinkList
        myList.addBulk(myArrayList);

        //print out the output after the link list is updated with new nodes added
        System.out.println("The new single link list when more nodes are added is: ");
        System.out.println(myList.toString()+ "\n");

        //Calling the reversedList method on myList to reverse the singleLinkList
        myList.reversedList();
        System.out.println("The revered SingleLinkList is: ");
        System.out.println(myList.toString()+"\n");

    }//end of method
}//end of class
