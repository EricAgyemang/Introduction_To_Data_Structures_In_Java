package edu.ilstu;

import java.util.*;

public class Stack<E> {

    private Node<E>topOfStackRef=null;
    private int size;


    public Stack(){
        topOfStackRef=null;
    }


    public int size() {
        return size;
    }

    public Stack(E data){
        topOfStackRef = new Node<>(data);
        size = 1;
    }

    
    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data){
            this.data = data;
            this.next = null;
       }

    private Node(E data, Node<E> next){
        this.data = data;
        this.next = next;
    }
    }//end of static class


    public boolean isEmpty() {
        return topOfStackRef == null;
    }

    public E push(E item){
        topOfStackRef = new Node<E>(item, topOfStackRef);
        return item;
    }

    public E pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }else{
            E result = topOfStackRef.data;
            topOfStackRef = topOfStackRef.next;
            return result;
        }
    }

    public E top(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }else{
            return topOfStackRef.data;
        }
    }


@SuppressWarnings("unchecked")
@Override
public boolean equals(Object obj){

    if(this==obj){
        return true;
    }

    if(obj instanceof Stack){
        Stack<E> other = (Stack<E>)obj;
        int n = size();
        if(n==other.length()){
            Node<E> n1 = topOfStackRef;
            Node<E> n2 = other.topOfStackRef;
            while(n1!=null){
                if(n1.data!=n2.data){
                    return false;
                }
                n1 = n1.next;
                n2 = n2.next;
            }
            return true;
        }
    }
    return false;
}


    public void clear(){
        while(!isEmpty()){
            pop();
        }
    }


}//End of stack class
