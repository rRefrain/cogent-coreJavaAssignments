/**
 * 
 */
package esg.itp.shape;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Rectangle implements Polygon {
	
	private float length = 0;
	private float breadth = 0;
	
	/**
	 * @param length
	 * @param breadth
	 */
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float calcArea() {
		return length * breadth;

	}

	@Override
	public float calcPeri() {
		return length + length + breadth + breadth;
	}

	@Override
	public void display() {
		System.out.println("This is a Rectangle.\n" + 
				"It's Length is : " + length +
				" long.\nIt's Breadth is : " + breadth +
				" long.\nIts Area is: " + calcArea() +
				"\nIts Perimeter is: " + calcPeri());
	}
}
