/**
 * 
 */
package ilstu.edu.it179;

/**
 * @author eagyem2 this is the Term class in the polynomial
 * 
 *         The addTerm method is coded in the polynomial class for easy coding
 */
public class Term {

	// Instance variables are declared here
	protected int coefficient;
	protected int exponent;

	/**
	 * Constructor is declared here as Term
	 * 
	 * @param coefficient - Coefficient
	 * @param exponent    - exponent
	 */
	public Term(int coefficient, int exponent) {
		this.coefficient = coefficient;
		this.exponent = exponent;
	}

	/**
	 * @return the accessor method is declared for the instance coefficient
	 */
	public int getCoeff() {
		return coefficient;
	}

	/**
	 * @return the accessor method is declared for the instance exponent
	 */
	public int getExpo() {
		return exponent;
	}

	/**
	 * @Override this is the toString method
	 * that returns a string
	 * 
	 **/
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if (coefficient == 1) {
			if (exponent == 1)
				sb.append("x");
			else
				sb.append("x^" + exponent);
		} else {
			if (exponent == 0)
				sb.append(coefficient);
			else if (exponent == 1)
				sb.append(coefficient + "x");
			else if (coefficient == 0)
				sb.append("");
			else
				sb.append(coefficient + "x^" + exponent);
		}

		return sb.toString();
	}

}