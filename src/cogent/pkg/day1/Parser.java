/**
 * 
 */
package cogent.pkg.day1;

import java.time.DateTimeException;
import java.time.LocalDate;
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
	
	/** Static Initialization block to create the scanner */
	static {
		reader = new Scanner(System.in);
	}
	
	/**
	 * Static Method to print a given prompt then read a String
	 * 
	 * @param prompt the String to print before taking user input
	 * @see java.util.Scanner#next()
	 * @return user input String value
	 */
	public static String readString(String prompt) {
		System.out.println(prompt);
		return reader.next();
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
	public static int readInt(String prompt) {
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
	public static double readDouble(String prompt) {
		while (true) {
			System.out.println(prompt);
			
			if(reader.hasNextDouble()) {
				return reader.nextDouble();
			} 
			
			reader.next();
			System.out.println("Enter a valid double!");
			
			}
	}
	
	/**
	 * Static method to print a given prompt and attempts to read three ints for 
	 * Year, Month and DayOfMonth 
	 * If the day is out of range, reader will be informed to "Enter a valid Date!"
	 * The prompt will print itself again and attempts to read a Date again
	 * 
	 * 
	 * @see readInt(String)
	 * @see java.time.LocalDate#of(int, int, int)
	 * @see java.time.DateTimeException
	 * 
	 * @param prompt the String to print before taking user input
	 * @return object of LocalDate
	 */
	public static LocalDate readDate(String prompt) {
		while(true) {
			System.out.println(prompt);
			try {
				return(LocalDate.of(readInt("Enter the Year"),
									readInt("Enter the Month"),
									readInt("Enter the DayOfMonth")
						));
						
			} catch (DateTimeException e) {
				System.out.println("Enter a valid Date!");
			}
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
