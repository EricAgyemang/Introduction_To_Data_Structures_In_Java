package edu.ilstu;

import java.util.NoSuchElementException;
import org.junit.Test;
import static org.junit.Assert.*;
/*
 * @author: Agyemang Eric
 * Course: IT 179– Introduction to Data Structures
 * Program: Assignement 8
 */

 //This is the Stacktest class that tests all methods in the stack class
public class StackTest {

    //This is the stack constructor test to know if the constructors are working fine
    @Test
    public void stackConstructorTest(){
        Stack<Character> myStack1 = new Stack<>();
        assertEquals("The stack should be empty", 0, myStack1.size());
        assertTrue(myStack1.isEmpty());

        Stack<Character> myStack2 = new Stack<>('(');
        assertEquals("The stack should have 1 element",1, myStack2.size());
        assertFalse(myStack2.isEmpty());

    }
    //This is the testNewLinkedStack test that is used to test the behavior of the LinkedStacked having the nodes
    @Test
    public void testNewLinkedStack(){
        Stack<Character> myStack = new Stack<>();
            assertTrue(myStack.isEmpty());
            assertEquals(0, myStack.size());


            myStack.push('{');
            assertFalse(myStack.isEmpty());
            assertEquals(1, myStack.size());

            myStack.clear();
            assertTrue(myStack.isEmpty());
        }

    //This is the pushTest that test how the push method is working fine
    @Test
    public void pushTest() {
        Stack<Character> myStack = new Stack<>();
            assertTrue(myStack.size() == 0);
            assertTrue(myStack.isEmpty());

            Character symb = '[';
            myStack.push(symb);
            assertTrue(myStack.size() == 1);

            try{
                assertTrue(symb.equals(myStack.top()));
            } catch (Exception ex) {
                fail("Exception is not expected");
           }
        }

    //This is the popTest that test how thr pop method is functioning. Series of pop activities are done here to 
    //verify thoroughly how the push method works
    @Test
    public void popTest() throws Exception{
        Stack<Character> myStack = new Stack<>();
            assertTrue(myStack.size()==0);

            Character item1 = '{';
            myStack.push(item1);
            Character item2 = ')';
            myStack.push(item2);
            assertEquals(myStack.size(), 2);

            try{
                char another = myStack.pop();
                assertEquals(myStack.size(), 1);
                assertTrue(item2.equals(another));

                myStack.pop();
                assertTrue(myStack.isEmpty());
            } catch (Exception e) {
                assertFalse(true);
            }
    }

    //This is the popException test that tests how the pop method hundles exception
    @Test(expected=NoSuchElementException.class)
    public void popExceptionTest(){
        Stack<Character> myStack = new Stack<>();
            myStack.pop();
    }

    //This is the top method test that checks to make sure that the top method is working fine
    @Test
    public void topTest(){
        Stack<Character> myStack = new Stack<>();
            myStack.push('(');
            myStack.top();
            assertEquals(myStack.size(), 1);
            Character item1 = '(';
            assertEquals(item1, myStack.top());
    }

    //This is the topException test that tests how the top method hundles exception
    @Test(expected=NoSuchElementException.class)
    public void topExceptionTest(){
        Stack<Character> myStack = new Stack<>();
            myStack.top();

    }

    //this is the isEmptyTest that tests how the isEmpty method is doing
    @Test
    public void isEmptyTest() {
        Stack<Character> myStack = new Stack<>();
            assertTrue(myStack.isEmpty());
            Character symb= '{';
            myStack.push(symb);
            assertFalse(myStack.isEmpty());
}

    //This is the size test that checks the size of the stack to make sure it is working fine
    @Test
    public void sizeTest(){
        Stack<Character> myStack = new Stack<>();
            assertTrue(myStack.size()==0);
            myStack.push('(');
            myStack.push(')');
            myStack.push('{');
            assertEquals(3, myStack.size());
            myStack.push('[');
            assertEquals(4, myStack.size());
            assertFalse(myStack.size()==3);
    }

    //This is the equalsMethod test that tests the equals method of the stack
    @Test
    public void equalsMethodTest(){

        Stack<Character> myStack = new Stack<>();
            Character item1 = ']';
            myStack.push(item1);
            Character item2 = '}';
            myStack.push(item2);
            char another = myStack.pop();
            assertTrue(item2.equals(another));
            assertFalse(item1.equals(another));
    }

    //This is the clearStacktest that tests othe clear stack method to pop all elements from the stack
    @Test
    public void clearStackTest(){
        Stack<Character> myStack = new Stack<>();
        assertTrue(myStack.isEmpty());
        myStack.push(')');
        myStack.push('(');
        myStack.push('{');
        assertTrue(myStack.size()==3);
        assertEquals(true, myStack.size()==3);
        myStack.clear();
        assertTrue(myStack.isEmpty());
        assertFalse(myStack.size()==3);
        assertEquals(true, myStack.size()==0);

    }

    }

