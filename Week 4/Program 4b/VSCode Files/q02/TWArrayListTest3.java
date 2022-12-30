package edu.q02;

//The is the class of TWArraylist3 that helps us to test the methods in the TWArrayList class
public class TWArrayListTest3 {
    //The main method is defined
    public static void main(String[] args) {

        //We create an array list using the constructor TWArrayList()
        TWArrayList<String> mylist = new TWArrayList<String>();

        //calling the addFirstTwo method two times
        mylist.addFirstTwo("sun1", "sun2");
        mylist.addFirstTwo("sun3", "sun4");

        //print out a statement showing the output
        System.out.println("\nAfter calling the addFirstTwo method two times: ");
        mylist.printList(); //Calling the printList method to display the output

        //print out a statement showing the output
        System.out.println("Now testing our indexOf(E value) method of the array list: ");

        //Calling the indexOf method three times to obtain the index of the arguement provided
        System.out.println("The index of sun1 is: " + mylist.indexOf("sun1"));
        System.out.println("The index of sun4 is: " + mylist.indexOf("sun4"));
        System.out.println("The index of sun5 is: " + mylist.indexOf("sun5"));
    }
}
