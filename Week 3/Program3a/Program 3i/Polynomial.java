/**
 * 
 */
package eagyem2.it179;

/**
 * @author eagye
 *
 */
import java.io.*;
import java.util.Scanner;
class Polynomial{
	public static Node addPolynomial(Node p1, Node p2)
	{
		Node a = p1, b = p2,
			newHead = new Node(0, 0),
			c = newHead;

		while (a != null || b != null)
		{
			if (a == null)
			{
				c.next = b;
				break;
			}
			else if (b == null)
			{
				c.next = a;
				break;
			}

			else if (a.pow == b.pow)
			{
				c.next = new Node(a.coeff +
								b.coeff, a.pow);
				a = a.next;
				b = b.next;
			}

			else if (a.pow > b.pow)
			{
				c.next = new Node(a.coeff,
								a.pow);
				a = a.next;
			}

			else if (a.pow < b.pow)
			{
				c.next = new Node(b.coeff,
								b.pow);
				b = b.next;
			}
			c = c.next;
		}
		return newHead.next;
	}
}
