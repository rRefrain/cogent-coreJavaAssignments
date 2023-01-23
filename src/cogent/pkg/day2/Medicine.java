/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Medicine {
	private final String name;
	private final String address;
	
	public Medicine(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void displayLabel() {
		System.out.print(display());
	}
	
	public String display() {
		return "Product Name: " + name + "\nCompany Address: " + address;
	}
}
