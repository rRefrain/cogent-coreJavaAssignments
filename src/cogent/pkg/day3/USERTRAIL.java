/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 22, 2023
 */
public class USERTRAIL {
	int val1;
	int val2;
	/**
	 * @param val1
	 * @param val2
	 */
	public USERTRAIL(int val1, int val2)
			throws IllegalValue {
		validate(val1);
		validate(val2);
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public void validate(int val) 
			throws IllegalValue{
		if (val < 0) {
			throw new IllegalValue(val + " is illegal. Please do not use negative");
		}
	}
	
	public void display() {
		System.out.println(info());
	}
	
	public String info() {
		return "val1: " + val1 + " val2: " + val2;
	}
}
