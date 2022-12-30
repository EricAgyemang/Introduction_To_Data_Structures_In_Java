package edu.ilstu;

public class TreeDemo {

public static void main(String[] args){
ExpressionTree t = new ExpressionTree("10 6 * 4 3 + -");

System.out.println("Postfix: " + t.postfix());
System.out.println("Prefix: " + t.prefix());
System.out.println("Infix: " + t.infix());
System.out.println("Result: "+t.eval());
}
}