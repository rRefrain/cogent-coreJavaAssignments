/**
 * 
 */
package cogent.pkg.day1;

/**
 * @author : michaelmiranda
 * @date   : Jan 19, 2023
 * 
 *  Design different class TestRectangle class in separate source file, which will
 * contain main function. From this main function, create 5 Rectangle objects by
 * taking all necessary information from the user.
 */
public class TestRectangle {
	public static void main(String[] args) {
		System.out.println("Question #2");
		Rectangle[] rectangles = new Rectangle[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Creating Rectangle #" + (i + 1));
			rectangles[i] = new Rectangle();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\nCurrent Rectangle #" + (i + 1) + 
					"\nLength: \t" 	+ rectangles[i].getLength() +
					"\nBreadth:\t" 	+ rectangles[i].getBreadth() +
					"\nArea:   \t"  + rectangles[i].getArea());
			
		}
	}
}
