/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 22, 2023
 */
public class Question05 {
	public static void main(String[] args) {
		USERTRAIL user;
		
		try {
			//IllegalValue from negatives
			user = new USERTRAIL(-1, -1);
			user.display();
		} catch (IllegalValue e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//Works Fine
			user = new USERTRAIL(10, 20);
			user.display();
		} catch (IllegalValue e) {
			System.out.println(e.getMessage());
		}
	}
}
