/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Car {
	private int speed = 0;
	private int noOfGear = 1;
	private final String make;
	private final String model;
	
	/**
	 * @param speed
	 * @param noOfGear
	 * @param make
	 * @param model
	 */
	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	
	public void drive(int speed, int noOfGear) {
		this.speed = speed;
		this.noOfGear = noOfGear;
	}
	
	public void display() {
		System.out.println(displayText());
	}
	
	public String displayText() {
		return "Make: " + make + "\tModel: " + model + 
				"\nStarting Speed: " + speed + "\tnoOfGear: " + noOfGear;
	}
	
}
