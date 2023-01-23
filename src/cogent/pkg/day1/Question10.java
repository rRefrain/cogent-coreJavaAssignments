/**
 * 
 */
package cogent.pkg.day1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * Create a class Term. This class represents a term of a polynomial such as 2x4
where 2 is coefficient and 4 is exponent of the term.

Data members:-
int coefficient
int exponent

Create another class Polynomial. The internal representation of a polynomial is
an array of Terms. The size of this array should be fixed.

Provide a constructor for this class that will set all terms of a polynomial object as
zero (where coefficient is 0 and exponent is 0).

Provide following functions:
setTerm(int, int) – Setting a term of a polynomial object. Each successive call of
this function should set next term of the polynomial object.

It should do the following validations:-
Whether the exponent of the term being set is already used.

Whether the array size limit is exceeded.

Whether the exponent is negative.

In all the cases it should not set the term and display an appropriate message.
sort() – to arrange the terms in ascending order of exponents.
Provide a function to print a polynomial object
 * @author : michaelmiranda
 * @date   : Jan 20, 2023
 */
public class Question10 {
	public static void main(String[] args) {
		Polynomial poly = new Polynomial();
		
		poly.setTerm(4,4);
		//These should fail 
		poly.setTerm(4,4);
		poly.setTerm(4,-4);
		poly.setTerm(20,4);
		
		poly.setTerm(3,3);
		
		poly.setTerm(5,5);
		
		poly.setTerm(2,2);
		
		poly.setTerm(1,1);
		
		poly.setTerm(6,6);
		
		poly.printArr();
	}
}

class Term {
	private int coefficient;
	private int exponent;
	
	public Term() {
		coefficient = 0;
		exponent = 0;
	}
	
	/**
	 * @param coefficient
	 * @param exponent
	 */
	public Term(int coefficient, int exponent) {
		super();
		this.coefficient = coefficient;
		this.exponent = exponent;
	}

	/**
	 * @return the coefficient
	 */
	public int getCoefficient() {
		return coefficient;
	}

	/**
	 * @param coefficient the coefficient to set
	 */
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	/**
	 * @return the exponent
	 */
	public int getExponent() {
		return exponent;
	}

	/**
	 * @param exponent the exponent to set
	 */
	public void setExponent(int exponent) {
		this.exponent = exponent;
	}
	
}

class sortByTerm implements Comparator<Term> {
		@Override
		public int compare(Term o1, Term o2) {
			return o1.getExponent() - o2.getExponent();
		}
		
	}

class Polynomial {
	int total = 5;
	int curr = 0;
	Term [] arr = new Term [total];
	int remaining = total;
	
	
	public void setTerm(int coefficient, int exponent) {
		System.out.println("Attempting to add:\t" + 
				coefficient + "^" + exponent);
		
		if (remaining <= 0 ) {
			System.out.println("Array has been filled\n setTerm Failed!\n");
			return;
		} else if (exponent < 0 ) {
			System.out.println("Exponent " + exponent + " is negative\\n setTerm Failed!\n");
			return;
		} else if (isFound(exponent)) {
			System.out.println("Exponent " + exponent + " is already in use\\n setTerm Failed!\n");
			return;
		}
		remaining--;
		arr[curr++] = new Term(coefficient, exponent);
		System.out.println("Successfully added!\n");
	}
	
	public void printArr() {
		sort();
		for(Term x : arr) {
			System.out.println(x.getCoefficient() + "^" 
					+ x.getExponent());
		}
	}
	
	private void sort() {
		Arrays.sort(arr, new sortByTerm());
	}

	/**
	 * @param exponent
	 * @return
	 */
	private boolean isFound(int exponent) {
		for (int i = 0; i < total; i++) {
			if (arr[i] != null && arr[i].getExponent() == exponent) {
				return true;
			}
		}
		return false;
	}
	
}
