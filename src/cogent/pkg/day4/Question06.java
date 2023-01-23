/**
 * 
 */
package cogent.pkg.day4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create a class “CDR” with the following members:
A_Number
B_Number
duration
calculatedCharge
Write a program which will accept the A_Number, B_Number and duration of Call from
user(Duration is in minutes). Rate that call using 1 Rupee per min rate and store the
calculated charge in “calculatedCharge.txt” file. Write this object to “rated_cdr.txt”.
Note : CDR means Call Details Record
 * 
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class Question06 {
	public static void main(String[] args) {
		FileOutputStream outputStream = null;
		
		try {
			String numberA = Parser.readStr("Enter the first number");
			String numberB = Parser.readStr("Enter the Second number");
			double duration = Parser.readDoubleLoop("Enter Call Duration in minutes");
			
			CDR cdr = new CDR(numberA, numberB, duration);
			File f = new File ("./files/rated_cdr.txt");
			
			String str = cdr.info();
		    outputStream = new FileOutputStream(f);
		    byte[] strToBytes = str.getBytes();
		    outputStream.write(strToBytes);
		    System.out.println("Finished!");
		    
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		
		finally {
			try {
				Parser.close();
				outputStream.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.getStackTrace();
			}
			
		}
	}
}
