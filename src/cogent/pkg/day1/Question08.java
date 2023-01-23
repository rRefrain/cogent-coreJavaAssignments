/**
 * 
 */
package cogent.pkg.day1;

/**
 * 
 * Write a program that accepts two numbers in the range from 1 to 40 from the
Command Line. It then compares these numbers against a single dimension array
of five integer elements ranging in value from 1 to 40. The program displays the
message BINGO if the two inputted values are found in the array element. 

 * @author : michaelmiranda
 * @date   : Jan 20, 2023
 */
public class Question08 {
	public static void main(String[] args) {	
		if (args.length <= 1 ) {
			System.out.println("Needs two args");
			return;
		}
		
		int first;
		int second;
		boolean foundFirst = false;
		boolean foundSecond = false;
		int [] bingo = new int [5];
		bingo[0] = 12;
		bingo[1] = 15;
		bingo[2] = 34;
		bingo[3] = 2;
		bingo[4] = 29;
		try {
			first = Integer.parseInt(args[0]);
			second = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("Needs two valid numbers");
			return;
		}
		
		if (first > 40 || first < 1 || second > 40 || second < 1) {
			System.out.println("Needs two numbers between 1 and 40");
			return;
		}
		for (int i : bingo) {
			if (first == i) {
				foundFirst = true;
			}
			if (second == i) {
				foundSecond = true;
			}
		}
		
		System.out.println("Your first number was: " + first);
		System.out.println("Your second number was: " + second);
		if(foundFirst && foundSecond) {
			System.out.println("Bingo!");
		} else {
			System.out.println("Not Found!");
		}
		System.out.println("The array was:");
		
		for (int i : bingo) {
			System.out.print(i + " ");
		}
	}
}
