/**
 * 
 */
package cogent.pkg.day1;

/**
 * 2.
 * 
 * Define a class Rectangle with its length and breadth.
 * 
 * Provide appropriate constructor(s), which gives facilty of constructing rectangle
 * object with default values of length pf breadth as 0 or passing value of length and
 * breadth externally to constructor.
 * 
 * Provide appropriate accessor & mutator methods to Rectangle class.
 * Provide methods to calculate area & to display all information of Rectangle.
 * 
 * Design different class TestRectangle class in separate source file, which will
 * contain main function. From this main function, create 5 Rectangle objects by
 * taking all necessary information from the user.
 * 
 * 4. 
 * Modify the program which is created in assignment 2 as follows
 * The class has attributes length and width, each of which defaults to 1. It should
 * have member functions that calculate the perimeter and area of the rectangle. It
 * should have set and get functions for both length and width. The set functions
 * should verify that length and width are each floating-point numbers larger than
 * 0.0 and less than 20.0
 * 
 * @author : michaelmiranda
 * @date   : Jan 19, 2023
 */
public class Rectangle {
	private double length  = 1.00;
	private double breadth = 1.00;
	
	/** Default constructor */
	public Rectangle() {
		this.length  = validateLengthBreadth("Enter Length");
		this.breadth = validateLengthBreadth("Enter Breadth");
	}
	
	/**
	 * Constructor
	 * 
	 * @param length
	 * @param breadth
	 */
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	/**
	 * Getter for Length
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * Setter for Length
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	/**
	 * Getter for Breadth
	 * @return the breadth
	 */
	public double getBreadth() {
		return breadth;
	}
	/**
	 * Setter for Breadth
	 * @param breadth the breadth to set
	 */
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double getArea() {
		return length * breadth;
	}
	
	public double getPerimeter() {
		return length + length + breadth + breadth;
	}
	
	private double validateLengthBreadth(String prompt) {
		double temp = -1.00;
		while (true) {
			temp = Parser.readDouble(prompt);
			if (temp > 0.00 && temp < 20.00) {
				return temp;
			}
			
			System.out.println("Enter dimensions more than 0.00 and less than 20.00");
		}
	}
}
