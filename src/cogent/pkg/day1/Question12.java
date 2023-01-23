/**
 * 
 */
package cogent.pkg.day1;

/**
 * @author : michaelmiranda
 * @date   : Jan 20, 2023
 */
public class Question12 {
	public static void main(String[] args) {
		Complex first = new Complex(20.00f, 30.00f);
		Complex second = new Complex(5.00f, 6.00f);
		System.out.print("First is:\t");
		first.display();
		System.out.print("\nSecond is:\t");
		second.display();
		System.out.print("\nSum:\t");
		first.add(second).display();
		System.out.print("\nSub:\t");
		first.subtract(second).display();
	}
}

class Complex {
	float real;
	float imaginary;
	
	public Complex() {
		real  = 10.00f;
		imaginary = 10.00f;
	}
	
	public Complex(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	/**
	 * @return the real
	 */
	public float getReal() {
		return real;
	}

	/**
	 * @param real the real to set
	 */
	public void setReal(float real) {
		this.real = real;
	}

	/**
	 * @return the imaginary
	 */
	public float getImaginary() {
		return imaginary;
	}

	/**
	 * @param imaginary the imaginary to set
	 */
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}

	
	public Complex add(Complex other) {
		return new Complex(this.getReal() + other.getReal(), 
				this.getImaginary() + other.getImaginary());
	}
	
	public Complex subtract(Complex other) {
		return new Complex(this.getReal() - other.getReal(), 
				this.getImaginary() - other.getImaginary());
	}
	
	public void display() {
		System.out.println(this.real + "+" + this.imaginary + "i\t");
	}
	
}
