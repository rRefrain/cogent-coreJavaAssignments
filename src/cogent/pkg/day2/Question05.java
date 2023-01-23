/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Question05 {
	public static void main(String[] args) {
		Car car01 = new Car("Nissan", "Altima");
		SportsCar car02 = new SportsCar("Toyota", "Supra");
		
		car01.display();
		car02.display();
		car01.drive(25, 2);
		car02.drive(40, 2);
		car01.display();
		car02.display();
	}
}
