/**
 * 
 */
package cogent.pkg.day3;

import java.lang.Exception;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class NegativeAmount extends IllegalArgumentException {

	/**
	 * @param string
	 */
	public NegativeAmount(String string) {
		super(string);
	}

}
