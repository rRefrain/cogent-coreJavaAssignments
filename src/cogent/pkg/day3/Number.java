/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Number {
	private int firstNumber;
	private int secondNumber;
	private double result = 0;
	String lastOperation = "None";
	
	public Number(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public void add() {
		result = firstNumber + secondNumber;
		lastOperation = "addition";
	}
	
	public void sub() {
		result = firstNumber - secondNumber;
		lastOperation = "subtraction";
	}
	
	public void subSecond() {
		result = secondNumber - firstNumber;
		lastOperation = "subtraction";
	}
	
	public void mul() {
		result = firstNumber * secondNumber;
		lastOperation = "multiplication";
	}
	
	public void div() throws ArithmeticException {
		if (secondNumber == 0) {
			throw new ArithmeticException("Exception! Diving by Zero!");
		}
		result = firstNumber / secondNumber;
		lastOperation = "division";
	}
	
	public void divSecond() throws ArithmeticException {
		if (firstNumber == 0) {
			throw new ArithmeticException("Exception Diving by Zero!");
		}
		result = secondNumber / firstNumber;
		lastOperation = "division";
	}
	
	public void display() {
		System.out.println("FirstNumber is: " + firstNumber + 
				" SecondNumber is: " + secondNumber + 
				" Last Operation is: " + lastOperation +
				" Result is :" + result);
	}
}
