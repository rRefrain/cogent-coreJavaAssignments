/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class SportsCar extends Car {
	private final String airBalloonType;

	/**
	 * @param speed
	 * @param noOfGear
	 * @param make
	 * @param model
	 */
	public SportsCar(String make, String model) {
		this(make,  model, "DefaultAirBalloon");
	}
	
	public SportsCar(String make, String model, String airBalloonType) {
		super(make, model);
		this.airBalloonType = airBalloonType;
	}
	
	public void display() {
		System.out.println(super.displayText() + "\n" + this.displayText());
	}
	
	public String displayText() {
		return "This is a SuperCar. It's airBallon is a: " + airBalloonType;
	}

}
