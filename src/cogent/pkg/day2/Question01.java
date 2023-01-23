/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 20, 2023
 */
public class Question01 {
	public static void main(String[] args) {
		Instrument [] arr = new Instrument[10]; 
		arr[0] = new Flute();
		arr[1] = new Piano();
		arr[2] = new Guitar();
		arr[3] = new Piano();
		arr[4] = new Flute();
		arr[5] = new Guitar();
		arr[6] = new Guitar();
		arr[7] = new Flute();
		arr[8] = new Flute();
		arr[9] = new Piano();
		
		for (int i = 0; i < 10; i++) {
			arr[i].play();
			System.out.println("Instance of Flute:\t" + (arr[i] instanceof Flute));
			System.out.println("Instance of Piano:\t" + (arr[i] instanceof Piano));
			System.out.println("Instance of Guitar:\t" + (arr[i] instanceof Guitar));
			System.out.println("Instance of Insturment:\t" + (arr[i] instanceof Instrument));
			System.out.println();
			
		}
	}
}
