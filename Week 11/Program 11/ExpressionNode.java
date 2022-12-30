package edu.ilstu;

public class ExpressionNode{
public int value;
public char operator;
public boolean isOperator;
public ExpressionNode left;
public ExpressionNode right;

public ExpressionNode(int theElement)
{
value = theElement;
isOperator = false;
}

public ExpressionNode(char theElement)
{
operator = theElement;
isOperator = true;
}

// Only operators have two subtrees/leaves
public ExpressionNode(char theElement, ExpressionNode lt, ExpressionNode rt)
{
operator = theElement;
isOperator = true;
left = lt;
right = rt;
}
}


