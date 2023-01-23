/**
 * 
 */
package cogent.pkg.day3;

import esg.itp.shape.Rectangle;
import esg.itp.shape.Square;
import esg.itp.shape.Polygon;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Question02 {
	public static void main(String[] args) {
		Polygon shape01 = new Square(20.00f);
		Polygon shape02 = new Rectangle(10.00f, 20.00f);
		
		shape01.display();
		shape02.display();
	}
}
