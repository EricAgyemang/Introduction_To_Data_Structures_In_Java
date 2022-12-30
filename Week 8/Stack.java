package edu.ilstu;

import java.util.*;

public class Stack<E> {

    private Node<E>topOfStackRef=null;
    private int size = 0 ;


    public Stack(){
        topOfStackRef=null;
        size = 0;
    }

    public Stack(E data){
        topOfStackRef = new Node<>(data);
        size = 1;
    }

    public int size() {
        return this.size;

    }



    private static class Node<E> {
        private E data;
        private Node<E> next;

        public E getData() {
            return data;
        }

        public Node<E> getNext(){
            return this.next;
        }

        public Node<E> setNext(Node<E> next){
            return this.next=next;
        }

        private Node(E data){
            this.data = data;
            this.next = null;
       }

    private Node(E data, Node<E>next){
        this.data = data;
        this.next = next;
    }
    }//end of static class



    public void push(E item) {

        if (this.isEmpty())
        {
            topOfStackRef = new Node<>(item);
            size++;
        }
        else if (topOfStackRef.getNext() == null)
                {
                    Node<E> newNode = new Node<>(item);
                    newNode.setNext(topOfStackRef);
                    topOfStackRef= newNode;
                    size++;
                }
        else
        {
            Node<E> newNode = new Node<E>(item);
            newNode.setNext(topOfStackRef);
            topOfStackRef = newNode;
           size++;
        }


    }

    public E pop() {
        if (this.isEmpty()){
            throw new NoSuchElementException ();
        }
        Node<E> node = topOfStackRef;
        topOfStackRef = topOfStackRef.getNext();
        size--;
        node.setNext(null);
        return node.getData();
    }



    public E top() {
       if (this.isEmpty())
       {
            throw new NoSuchElementException();
       }
        Node<E> node = topOfStackRef;

        return node.getData();

    }


    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
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
        if(n==other.size()){
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
