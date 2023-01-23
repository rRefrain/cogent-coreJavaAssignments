/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Ointment extends Medicine {

	/**
	 * @param name
	 * @param address
	 */
	public Ointment(String name, String address) {
		super(name, address);
	}
	
	public void displayLabel() {
		System.out.println(super.display() + "\n" + display());
	}
	
	public String display() {
		return "This is a Syrup.\nFor External Use Only\nDo not apply to irratated skin";
	}

}
