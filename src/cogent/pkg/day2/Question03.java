/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Question03 {
	public static void main(String[] args) {
		Medicine [] productList = new Medicine [10];
		for (int i = 0; i < 10; i++) {
			productList[i] = assign("Test#" + i, "422-222-222 Penn Avenue, Redwood City, CA");
		}
		
		System.out.print("\n\n");
		
		for (Medicine product: productList) {
			product.displayLabel();
			System.out.println();
		}
		
		
	}
	
	private static Medicine assign(String name, String address) {
		int i;
		while (true) { 
			i = (int) (Math.random() * 10);
			if(i < 3) {
				break;
			}
		}
		switch(i) {
			case 0,4:
				System.out.println("Syrup Assigned");
				return new Syrup(name, address);
			case 1,6:
				System.out.println("Table Assigned");
				return new Tablet(name, address);

			default:
				System.out.println("Ointment Assigned");
				return new Ointment(name, address);
		}
	}
}
