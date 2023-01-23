/**
 * 
 */
package esg.itp.shape;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Square implements Polygon {
	float side;
	
	public Square(Float side) {
		this.side = side;
	}
	
	@Override
	public float calcArea() {
		return side * 2;
	}

	@Override
	public float calcPeri() {
		// TODO Auto-generated method stub
		return side * 4;
	}

	@Override
	public void display() {
		System.out.println("This is a square. It's side is : " + side +
				" long.\nIts Area is: " + calcArea() +
				"\nIts Perimeter is: " + calcPeri());
	}
}
