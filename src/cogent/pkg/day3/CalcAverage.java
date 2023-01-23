/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class CalcAverage {	
	public double avgFirstN(int n) throws IllegalArgumentException  {
		if (n < 1) {
			throw new IllegalArgumentException("Exception! n must positive or 0");
		}
		
		int x = 0;
		
		for (int i = 0; i < n; i++) {
			x += i;
		}
		return x/n;
	}
}
