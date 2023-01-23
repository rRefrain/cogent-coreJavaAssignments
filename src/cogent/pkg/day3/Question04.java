/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 22, 2023
 */
public class Question04 {
	public static void main(String[] args) {
		Emp emp01;
		
		try {
			//Invalid Designation
			emp01 = new Emp(1, "Rin", "Teacher", 1000.00);
		} catch (InvalidDesignation e ) {
			System.out.println(e.getMessage());
		} catch (LowSalException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//LowSalException 
			emp01 = new Emp(1, "Rin", "Clerk", 400.00);
		} catch (InvalidDesignation e ) {
			System.out.println(e.getMessage());
		} catch (LowSalException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//Works fine
			emp01 = new Emp(1, "Rin", "Officer", 1000.00);
			emp01.printDET();
		} catch (InvalidDesignation e ) {
			System.out.println(e.getMessage());
		} catch (LowSalException e) {
			System.out.println(e.getMessage());
		}
	}
}
