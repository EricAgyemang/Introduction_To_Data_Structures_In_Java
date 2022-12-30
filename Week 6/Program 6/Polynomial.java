/**
 * 
 */
package ilstu.edu.it179;

/*
 * 
 * This is the polynomial class that represents the polynomial expression
 */
public class Polynomial<E> {

	// The first node of the polynomial
	private Node termsHead;

	// This is the private inner class called node with two instance variables
	public class Node {
		// two instance variables of the Node class
		private E termData;
		private Node next;

		// We declare a constructor for the Node class here with the parameter
		// "typeParameter" being an object of the type-parameter class
		public Node(E typeParameter) {
			termData = typeParameter;
			next = null;
		}
	} // End of Node class definition

	/**
	 * We declare a default constructor creates a Polynomial with no terms
	 * 
	 */
	public Polynomial() // DO NOT MODIFY THIS CONSTRUCTOR
	{
		termsHead = null;
	}

	/**
	 *
	 * @param param We create a polynomial to be copied
	 */
	public Polynomial(Polynomial<E> param) {
		Node current = param.termsHead;

		// We want to check if param.head is not null
		if (current != null) {
			// We set the head as param.head
			this.termsHead = null;

			while (current != null) {
				// Get the term here
				Term term = (Term) current.termData;

				// Add term to this polynomial
				addTerm(term.getCoeff(), term.getExpo());

				// Move the current to next node
				current = current.next;
			}
		}
	}

	/**
	 * We creat the addterm() method here
	 */
	@SuppressWarnings("unchecked")
	public void addTerm(int coeff, int expo) {
		// We create a new instance of Term class here
		Term newTerm = new Term(coeff, expo);

		// We create new instance of the node class
		Node newNode = new Node((E) newTerm);

		// We check if termsHead is null
		if (this.termsHead == null) {
			this.termsHead = newNode;
		} else {
			Node current = termsHead;

			// Compare with the termsHead
			Term headTerm = (Term) current.termData;
			if (headTerm.getExpo() >= expo) {
				newNode.next = current;
				this.termsHead = newNode;

			} else {
				// Compare with the rest of the elements
				while (current != null) {
					// We check if next is not null
					if (current.next != null) {
						// We check if the next term's exponent is higher than expo
						Term term = (Term) current.next.termData;
						if (term.getExpo() >= expo) {
							newNode.next = current.next;
							current.next = newNode;
							break;
						}
					} else {
						current.next = newNode;
						break;
					}

					// Move the current to next node
					current = current.next;
				}
			}
		}

		// Collect terms with same exponents
		collectTerms();
	}

	/**
	 * here, we want to returns a polynomial as a String in the form of: 7-2x + 4x^3
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();

		if (this.termsHead != null) {
			Node current = this.termsHead;
			sb.append((Term) current.termData);
			current = current.next;

			while (current != null) {
				sb.append(" + " + (Term) current.termData);

				// We move current to the next node
				current = current.next;
			}
		}

		return sb.toString();
	}

	// collect terms of a Polynomial object. The same exponent with a single term as their sum

	private void collectTerms() {
		if (this.termsHead != null) {
			Node current = this.termsHead;

			while (current != null) {
				Term currTerm = (Term) current.termData;

				// Compare with current.next
				if (current.next != null) {
					Node nextNode = current.next;
					Term nextTerm = (Term) nextNode.termData;

					// Compare coefficient of current and the next nodes while the next Node's
					// exponent is the same as current's exponent
					while ((nextNode != null) && (currTerm.getExpo() == nextTerm.getExpo())) {
						// we add the coefficients and assign it to the current's coefficient
						currTerm.coefficient = currTerm.getCoeff() + nextTerm.getCoeff();
						nextNode = nextNode.next;
						if (nextNode != null)
							nextTerm = (Term) nextNode.termData;
					}

					// Set current nextNode as in the above while loop the terms with same
					// coefficients are added together
					// with next Node having the term with different coefficients
					current.next = nextNode;
				}
				// Move current to the next node
				current = current.next;
			}
		}
	}

	/**
	 * We now add Polynomial and another Polynomial
	 *
	 */
	public Polynomial<E> polyAdd(Polynomial<E> param) {

		// Create an instance of polynomial class
		Polynomial<E> p3 = new Polynomial<E>(this);

		// Copy param into p3
		Node node = param.termsHead;

		if (node != null) {
			while (node != null) {
				Term term = (Term) node.termData;
				p3.addTerm(term.getCoeff(), term.getExpo());
				node = node.next;
			}
		}

		return p3;
	}

} // this is the end of Polynomial class