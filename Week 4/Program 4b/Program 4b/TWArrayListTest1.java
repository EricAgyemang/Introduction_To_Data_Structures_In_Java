package edu.q02;

//The is the class of TWArraylist1 that helps us to test the methods in the TWArrayList class
public class TWArrayListTest1 {
    //The main method is defined
    public static void main(String[] args) {

        //We create an array list using the constructor TWArrayList(int num)
        TWArrayList<String> mylist = new TWArrayList<String>(1);

        //We call the addFirst method three times and the addFirstTwo method ones.
        mylist.addFirst("sun1");
        mylist.addFirst("sun2");
        mylist.addFirst("sun3");
        mylist.addFirstTwo("sun4", "sun5");

        //print a statement showing the output
        System.out.println("\nAfter calling the addFirst and addFirstTwo methods: ");
        mylist.printList(); //call the printList method to display the output

        //call the removeFirst method
        mylist.removeFirst();

         //print a statement showing the output
        System.out.println("After calling the removeFirst method: ");
        mylist.printList();  //call the printList method to display the output
    }

}
