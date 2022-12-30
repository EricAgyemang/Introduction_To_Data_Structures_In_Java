package edu.ilstu;
/*
 * @author: Agyemang Eric
 * Course: IT 179 – Introduction to Data Structures
 * Program: Assignement 11
 */

import java.util.Stack;

import java.util.StringTokenizer;

public class ExpressionTree{
private ExpressionNode root;
private char[] operators = {'+', '-', '*', '/'};

public ExpressionTree(String str)
{
root = strToTree(str);
}

public ExpressionTree(ExpressionNode root)
{
this.root = root;
}

private ExpressionNode strToTree(String s)
{
//Handle nulls? Handle empty expression trees? etc.

Stack<ExpressionNode> st = new Stack<>();
StringTokenizer tk = new StringTokenizer(s);

while(tk.hasMoreTokens())
{
String token = tk.nextToken();

boolean isOperator = false;
for(char operator : operators)
if(token.equals(Character.toString(operator)))
isOperator = true;
ExpressionNode n;
if(isOperator)
n = new ExpressionNode(token.charAt(0));
else
n = new ExpressionNode(Integer.parseInt(token));

if(n.isOperator)
{
ExpressionNode a = st.pop();
ExpressionNode b = st.pop();
n.right = a;
n.left = b;

st.push(n);
}
else
{
st.push(n);
}
}
return st.pop();
}


private int performOperation(int a, int b, char op)
{
if(op == '+')
return a + b;
else if(op == '-')
return a - b;
else if(op == '*')
return a * b;
else if(op == '/')
return a / b;
else
throw new IllegalArgumentException("Illegal operation performed");
}

// this method, when invoked on an expression tree object
// will return the integer value associated with evaluating the expression
// tree. It will need to call a private recursive method that takes in
// the root.
public int eval()
{
if(root == null)
return 0;
else
return eval(root);
}

private int eval(ExpressionNode node)
{
int left;
int right;

// base case
if(!node.isOperator)
return node.value;
else
{
left = eval(node.left);
right = eval(node.right);
return performOperation(left, right, node.operator);
}

}


// this method, when invoked on an expression tree
// object will return a String that contains the corresponding postfix
// expression. It will need to call a private recursive method that
// takes in the root.
public String postfix()
{
return postfix(root);
}

private String postfix(ExpressionNode node)
{
String left = "";
String right = "";

if(!node.isOperator)
return "" + node.value;
else
{
left = postfix(node.left);
right = postfix(node.right);
return left + " " + right + " " + node.operator;
}
}

// this method, when invoked on an expression tree object will return a String
// that contains the corresponding prefix expression. It will need to
// call a private recursive method that takes in the root.
public String prefix()
{
return prefix(root);
}

private String prefix(ExpressionNode node)
{
String left = "";
String right = "";

if(!node.isOperator)
return "" + node.value;
else
{
left = prefix(node.left);
right = prefix(node.right);
return node.operator + " " + left + " " + right;
}
}

// this method, when invoked on an expression tree object will return a String
// that contains the corresponding correct infix expression. Keep in
// mind that parenthesis will be needed (excessive parenthesis will be
// tolerated as long as it is correct). It will need to call a private
// recursive method that takes in the root.
public String infix()
{
return infix(root);
}

private String infix(ExpressionNode node)
{
String left = "";
String right = "";

if(!node.isOperator)
return "" + node.value;
else
{
left = infix(node.left);
right = infix(node.right);
return "(" + left + " " + node.operator + " " + right + ")";
}

}
}