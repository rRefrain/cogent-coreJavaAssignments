/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 20, 2023
 */
public class Question02 {
	public static void main(String[] args) {
		Compartment [] train = new Compartment [10];
		for (int i = 0; i < 10; i++) {
			train[i] = assign();
		}
		
		System.out.print("\n\n");
		
		for (Compartment car: train) {
			car.notice();
		}
	}
	
	private static Compartment assign() {
		int i;
		while (true) { 
			i = (int) (Math.random() * 10);
			if(i > 2) {
				break;
			}
		}
		switch(i) {
			case 3,4:
				System.out.println("First Class Assigned");
				return new FirstClass();
			case 5,6:
				System.out.println("Ladies Assigned");
				return new Ladies();
			case 7,8:
				System.out.println("General Assigned");
				return new General();
			default:
				System.out.println("Luggage Assigned");
				return new Luggage();
		}
	}
}
