/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Tablet extends Medicine {

	/**
	 * @param name
	 * @param address
	 */
	public Tablet(String name, String address) {
		super(name, address);
	}
	
	public void displayLabel() {
		System.out.println(super.display() + "\n" + display());
	}
	
	public String display() {
		return "This is a Tablet.\nKeep away from children under age of 5.\nKeep in a cool dry place";
	}
}
