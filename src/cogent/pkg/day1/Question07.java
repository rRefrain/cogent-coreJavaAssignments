/**
 * 
 */
package cogent.pkg.day1;

/**
 * 
 * Write a program that accepts two numbers from the Command Line and prints
them out. Then use a for loop to print the next 13 numbers in the sequence where
each number is the sum of the previous two. 

 * @author : michaelmiranda
 * @date   : Jan 20, 2023
 */
public class Question07 {
	public static void main(String[] args) {
		if (args.length <= 1 ) {
			System.out.println("Needs two args");
			return;
		}
		
		int first;
		int second;
		int curr;
		int counter = 0;
		try {
			first = Integer.parseInt(args[0]);
			second = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("Needs two valid numbers");
			return;
		}
		
		System.out.println(first);
		System.out.println(second);
		while (counter++ < 13) 
		{
			curr = first + second;
			System.out.println(curr);
			first = second;
			second = curr;
			
		}
		
		
		
		
	}
}
