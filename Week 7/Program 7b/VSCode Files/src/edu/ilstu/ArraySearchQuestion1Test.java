package edu.ilstu;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * JUnit test of ArraySearch.Search of a target
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Assignement 7
 */

 //QUESTION 1 TESTS:

 //This is the class of ArraySearch for question 1 used for the JUnit test hardness
public class ArraySearchQuestion1Test {

    // Arrays to search for most of the tests
    private final int [] myArray1 = {5, 12, 15, 4, 8, 12, 7}; //Array with 7 elements
    private int [] myArray2 = {10};  //Array with only one element
    private int [] myArray3 = new int[0]; //Array with empty element


    //The test indicating that the target element is the first element in the array.
    @Test
    public void firstElementTest() {
        assertEquals("5 is not at position 0", 0, ArraySearch.search(myArray1, 5, 0, 6));
    }

    //The test indicating that the target element is the last element in the array.
    @Test
    public void lastElementTest(){
        assertEquals("7 is not at position 6", 6, ArraySearch.search(myArray1, 7, 0, 6));
    }

    //The test indicating that the target is somewhere in the middle.
    @Test
    public void inMiddleTest(){
        assertEquals("4 is not found at position 3", 3, ArraySearch.search(myArray1, 4, 0, 6));
    }


    //The test indicating that the target element is not in the array
    @Test
    public void notInArrayTest(){
        assertEquals("-5 is not in the array", -1, ArraySearch.search(myArray1, -5, 0, 6));
    }

    //The test indicating that there is more than one occurrence of the target element and we find the first occurrence of the target.
    @Test
    public void multipleOccurencesTest(){
        assertEquals("12 is not found at position 1", 1, ArraySearch.search(myArray1, 12, 0,6));
    }


    //The tests indicating that the array has only one element and it is not the target.
    @Test
    public void oneElementArrayTestAbsent(){
         assertEquals("-10 is not found in the array", -1, ArraySearch.search(myArray2, -10, 0, 0));
    }

    //The tests indicating that the array has only one element and it is the target.
    @Test
    public void oneElementArrayTestItemPresent(){
        assertEquals("10 is not found at position 0", 0, ArraySearch.search(myArray2, 10, 0,0));
    }

    //Test indicating that the array has no element.
    @Test
    public void emptyArrayTest(){
        assertEquals("10 is not in the array", -1, ArraySearch.search(myArray3, 10, 0, 0));
    }

    //We tell JUnit that a test is expected to throw an exception
    // we added the parameter expected = exception-class to the @Test attribute
    @Test(expected=NullPointerException.class)
    public void NullPointerException1(){
        assertEquals(0, ArraySearch.search(null, 5, 0,0));
    }
}
