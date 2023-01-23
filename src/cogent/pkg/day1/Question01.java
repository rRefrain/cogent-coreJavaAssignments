/**
 * 
 */
package cogent.pkg.day1;

/**
 * 
 * Write a program to list all even numbers less than or equal to the number n. Take
the value of n as input from user.
 *
 * @author : michaelmiranda
 * @date   : Jan 19, 2023
 */
public class Question01 {
	public static void main(String[] args) {
		System.out.println("Question #1");
		int n = Parser.readInt("Input a number");
		for (int i = 0; i < n; i += 2) {
			System.out.println(i);
		} 
		
		Parser.close();
	}
}
