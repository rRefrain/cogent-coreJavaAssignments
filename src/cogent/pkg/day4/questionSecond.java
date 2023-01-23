/**
 * 
 */
package cogent.pkg.day4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**	
 * Q - Write a program to print the total no of words into the cogent.txt file
 * cogent.txt file has the data as "The quick brown fox jumps over the lazy little dog"
 * @author : michaelmiranda
 * @date   : Jan 19, 2023
 */
public class questionSecond {
	public static void main(String [] args) {
	BufferedReader reader = null;
	String input;
	int words = 0;
	
	try {
		System.out.println("Top");
		
		reader = new BufferedReader(new InputStreamReader
				(new FileInputStream("./files/cogent.txt")));
		input  = reader.readLine();
		
		StringTokenizer tokens = new StringTokenizer(input, " ");
		words = tokens.countTokens();
		//words = input.trim().split(" ").length;
		
		System.out.println("\nInput is:" + input + 
				"\nIt is " + words + " words long\n");
		
		
	} catch (Exception e) {
		e.getStackTrace();
	} finally {
		try {
			if(reader != null) {
				reader.close();
			}
			System.out.println("Finished!");
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
	}
}
