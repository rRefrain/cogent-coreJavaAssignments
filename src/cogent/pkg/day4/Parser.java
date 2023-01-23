/**
 * 
 */
package cogent.pkg.day4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * class to that reads user input from a static Scanner
 * 
 * @author : michaelmiranda
 * @date   : Jan 18, 2023
 */
public class Parser {
	
	/** Scanner intended to stay open until main program terminates */
	private static Scanner reader;
	
	/** Initialization block to create the scanner */
	static {
		reader = new Scanner(System.in);
	}
	
	/**
	 * Static Method to print a given prompt then read a String
	 * 
	 * @throws EmptyFieldException if input is empty
	 * @param prompt the String to print before taking user input
	 * @see java.util.Scanner#next()
	 * @return user input String value
	 */
	public static String readString(String prompt) 
	throws EmptyFieldException {
		System.out.println(prompt);
		String newStr = reader.next();
		if (prompt.isEmpty()) {
			throw new EmptyFieldException("Exception! Empty Field");
		}
		return newStr;
	}
	
	/**
	 * Static Method to print a given prompt then read a String
	 * 
	 * @param prompt the String to print before taking user input
	 * @see java.util.Scanner#next()
	 * @return user input String value
	 */
	public static String readStr(String prompt)  {
		System.out.println(prompt);
		return reader.next();
	}
	
	/**
	 * Static Method to print a given prompt and attempts to read an int
	 * 
	 * @throws InputMismatchException if there is no valid number
	 * 
	 * @see java.util.Scanner#nextInt()
	 * @param prompt the String to print before taking user input
	 * @return user input int value
	 */
	public static int readInt(String prompt)
	throws InputMismatchException {
			System.out.println(prompt);
			return reader.nextInt();
	}
	
	/**
	 * Static Method to print a given prompt and attempts to read an int
	 * If no integer is found, reader will be informed to "Enter a valid number!",
	 * The prompt will print itself again and attempts to read an int again
	 * 
	 * @see java.util.Scanner#hasNextInt()
	 * @see java.util.Scanner#nextInt()
	 * @param prompt the String to print before taking user input
	 * @return user input int value
	 */
	public static int readIntLoop(String prompt) {
		while (true) {
			System.out.println(prompt);
			
			if(reader.hasNextInt()) {
				return reader.nextInt();
			} 
			
			reader.next();
			System.out.println("Enter a valid number!");
			
			}
	}
	
	/**
	 * Static Method to print a given prompt and attempts to read an double
	 * If no integer is found, reader will be informed to "Enter a valid number!",
	 * The prompt will print itself again and attempts to read an double again
	 * 
	 * @see java.util.Scanner#hasNextDouble()
	 * @see java.util.Scanner#nextDouble()
	 * @param prompt the String to print before taking user input
	 * @return user input double value
	 */
	public static double readDoubleLoop(String prompt) {
		while (true) {
			System.out.println(prompt);
			
			if (reader.hasNextDouble()) {
				return reader.nextDouble();
			} 
			
			reader.next();
			System.out.println("Enter a valid double!");
			
			}
	}
		
	/**
	 * method to close static reader
	 * @see Scanner#close();
	 */
	public static void close() {
		reader.close();
	}
}
