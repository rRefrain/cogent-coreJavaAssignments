/**
 * 
 */
package cogent.pkg.day2;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Question04 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Enter 3 args");
			return;
		} if (!args[2].equals("+") &&
				!args[2].equals("-") &&
				!args[2].equals("*") &&
				!args[2].equals("/")) {
			System.out.println("Enter +,-,* or / for the third arg");
			return;	
		}
		
		int first;
		int second;
		try {
			first = Integer.valueOf(args[0]);
			second = Integer.valueOf(args[1]);
		} catch(NumberFormatException e) {
			System.out.println("Enter Valid Numbers for Arg 1 and Arg 2!");
			return;
		}
		
		if (second == 0 && args[2].equals("/")) {
			System.out.println("Dividing by Zero!");
			return;
		}
	
		System.out.print(first + args[2] + second + "=");
		
		switch(args[2]) {
			case "+":
				System.out.print(first + second);
				break;
			
			case "-":
				System.out.print(first - second);
				break;
			
			case "*":
				System.out.print(first * second);
				break;
				
			default:
				System.out.print(first / second);
		}
	}
}
