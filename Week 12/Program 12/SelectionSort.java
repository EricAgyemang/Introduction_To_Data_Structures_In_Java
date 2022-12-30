package edu.ilstu;
/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: 12-Sorting
 */

//This is the class of SelectionSort that contains the modified version of minMaxSelectionSort and the swap method
//That are used to sort elements in descending order
public class SelectionSort {

    //This is the swapElement method that helps to swap elements of the array when called
    public static void swapElements(int[] tab, int i, int j){

    //create a temporary object tmp and let the ith element of tab point to tmp
    int tmp = tab[i];

    //let ith element of tab be equal to the jth element ot tab
    tab[i] = tab[j];

    //let the jth element point to tmp
    tab[j] = tmp;
}

    //This is the minMaxRecursiveSelectionSort method that determines the minimum and maximum of the arrays when called
    public static void minMaxRecursiveSelectionSort(int [] tab, int i, int j){
    int min = i;  //let the minimum be i
    int max = j;  //let the maximum be j

    //If i is greater than j, just return
    if(i>j){
        return;
    }
    //This is a for loop that is used to loop through the array to get the max
    for(int k = i+1; k<= j; k++){
        if(tab[k]>tab[max]){
            max = k;
        }
        //If the kth element of tab is less than the min element let min be k
        if(tab[k]<tab[min]){
            min = k;
        }
    }

    //recuresively call swapElements method twice
    swapElements(tab, i, min); //recursively call swapElement method for the minimum
    swapElements(tab, j, max);  //recursively call swapElement method for the maximum
    minMaxRecursiveSelectionSort(tab, i+1, j-1); // Recursively call minMaxRecursiveSelectionSort method
}

    //This is the reverseSort method that is used to refered the array from ascending to descending order
    public static void reverseSort(int [] tab, int i, int j){

        //call the minMaxRecursiveSelectionSort method
        minMaxRecursiveSelectionSort(tab, i+1, j-1);

        //A while loop tp loop through the array and calling the swapElements method to reverese the array into descending order
        while(i<j/2){
            swapElements(tab, i, j-i-1); //Calling the swapElements method
            i++; //Increase i by 1
        }
    }
}//End of class
