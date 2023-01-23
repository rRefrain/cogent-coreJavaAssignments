/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class LowBalanceExcpetion extends IllegalArgumentException {
	/**
	 * @param string
	 */
	public LowBalanceExcpetion(String string) {
		super(string);
	}
}
