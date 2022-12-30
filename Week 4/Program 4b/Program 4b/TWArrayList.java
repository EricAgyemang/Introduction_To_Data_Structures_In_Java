package edu.q02;

import java.util.Arrays;

//This is the class of TWArrayList that is of the generic type E
public class TWArrayList<E> {
//Data fields
//The default initial capacity is declared
public static final int INITIAL_CAPACITY = 10;

//The underlying data array is declared
private E[] theData;

//The current size of the array is declared and inistialized
private int size = 0;

//The current capacity is declared and initialized
private int capacity = 0;

//This is the reallocation method that makes the array list capacity doubles when called
private void reallocate(){
    capacity *= 2;  //The capacity is doubled
    theData = Arrays.copyOf(theData, capacity); //copy array list content to the new array list
}

//This is the TWArrayList constructor that takes no arguement
@SuppressWarnings("unchecked")
public TWArrayList(){
    capacity = INITIAL_CAPACITY; //set te capacity to the initial capacity
    theData = (E[]) new Object[capacity]; //create an new object and cast it to the array of type E
}

//This is the TWArrayList constructor that takes an integer arguement that is the initial capacity
@SuppressWarnings("unchecked")
public TWArrayList(int num){
    if(num<0){
        throw new IllegalArgumentException("num can not be negative"); //Check for exception that could be thrown if num is negative
    }
    capacity = num; //set num to be the capacity
    theData = (E[]) new Object[capacity];  //create an new object and cast it to the array of type E
}

//thisis the get method that retrieves the data at a specified index
public E get(int index){
    if(index < 0 || index >= size){
        throw new ArrayIndexOutOfBoundsException(index); //Check for array index out of bounds exception
    }
    return theData[index]; //Retrieve the data at the index given
}

//This is the get size method that helps to retrieve the size of the array list 
public int getSize(){
    return size;
}

//This is the get capacity method that returns the capacity of the array list
public int getCapacity(){
    return capacity;
}

//This is the addFirst method that add an entry to the first position of the array list
public void addFirst(E anEntry){

    if(size>=capacity){
        reallocate(); //Reallocate method is called if the size of the array list is greater
                     //or equal to the capacity of the array list
    }
    for(int i = size; i >= 1; i--){ //The for loop to shift the data to make room for new entry
        theData[i] = theData[i-1];
    }
    theData[0] = anEntry; //make the first entry occupy the first position of the array list
    size++;  //Increase the size
}

//This is the add first two method that adds the entry to the first and second position 
public void addFirstTwo(E anEntry1, E anEntry2){
    //calling the add frist method  twice
    addFirst(anEntry2);
    addFirst(anEntry1);
}

//This is the remove First method that removes the first element of the array list
public E removeFirst(){
    if(size<=0){  //Checking if the size is zero or less
        return null;
    }else{
    E returnValue = theData[0]; //Get the data at index zero
    //Shift the data to cover-up the space after removing the element from the array list 
    for(int i = 1;i < size; i++){
        theData[i-1] = theData[i];
    }
    size--;  //Reduce the size
    return returnValue; //Return the value of the data at index 0
    }
}

//This is the indexOf method that returns the index of a specified value of the array
public int indexOf(E value){
    for(int i=0; i<size;i++){ 
        if(theData[i].equals(value)){
            return i;
        }
    }
    return -1; //Returns -1 if the specified value is not in the array
    }

    //This is the printList method that helps to print the output of the arraylist when it is called.
    public void printList(){
        if(size<=0){ //This condition checks for a size less than or equal to zero
            System.out.println("the size of the array list is: "+ getSize()); //We get the size of he array list
            System.out.println("the capacity is: "+ getCapacity());  //We get the capacity of the array list
            System.out.println("the array list is empty and it is: \n" + "[ " + " ]"); //The condition when the array list is empty
            System.out.println(); //print an empy space

        }else{ //This condition checks for a size grather than zero
            System.out.println("the size of the array list is: "+ getSize());  //We get the size of he array list
            System.out.println("the capacity is: "+ getCapacity()); //We get the capacity of the array list
            System.out.println("The array list is: "); //The array list is printed

            //This loop helps to get the index of the elements in the array list
            int i=0;
            System.out.print("[");
            for(; i<size-1;i++){
                 System.out.print(this.get(i) + " , ");
            }
            System.out.println(this.get(i)+"]");
            System.out.println();
    }
    }
}
