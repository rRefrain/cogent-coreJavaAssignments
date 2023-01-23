/**
 * 
 */
package cogent.pkg.day1;

/**
 * 
 * Write a program that takes a String through Command Line argument and display
the length of the string. Also display the string into uppercase and check whether
it is a palindrome or not. (Refer Java API Documentation)

 * @author : michaelmiranda
 * @date   : Jan 20, 2023
 */
public class Question06 {
	public static void main(String[] args) {
		if (args.length == 0 ) {
			System.out.println("Empty");
			return;
		}
		System.out.println("args[0]: " + args[0] + 
				"\targs[0].length(): "+ args[0].length() +
				"\targs[0].toUpperCase: " + args[0].toUpperCase()
				);
		
		System.out.println(isPalindrome(args[0]));
		
	}
	
	private static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
