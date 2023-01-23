/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class InsufficientFunds extends IllegalArgumentException {
	/**
	 * @param string
	 */
	public InsufficientFunds(String string) {
		super(string);
	}
}
