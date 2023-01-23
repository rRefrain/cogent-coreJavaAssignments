/**
 * 
 */
package cogent.pkg.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * 
 * Accept a directory name in form of String from user using proper IO stream. Store it in a
variable. (This is Self Study Assignment. Refer Java API documentation.)

Search if it exists in your system.
If it exists then show all the files present in the directory otherwise print the message
that directory Does not Exists
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class Question05 {
	public static void main(String[] args) {
		BufferedReader reader = null;
		String current;
		
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Directory Name: ");
			current  = reader.readLine();
			File file = new File(current);
	        System.out.println("Exists: " + file.exists() 
	         					+ "\nIs A Directory: " + file.isDirectory());
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			Parser.close();
		}
	}
}
