/**
 * 
 */
package cogent.pkg.day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * 
 * 
 * Write a program which will accept an input String from user
(This is Self Study Assignment. Refer Java API documentation.)

Write the input in the file io.txt
Show size of the file
Read contets from the file and display them on console
Delete io.txt file using File class

 * @author : michaelmiranda
 * @date   : Jan 19, 2023
 */
public class Question04 {
	public static void main(String[] args) {
		OutputStream writer = null;
		BufferedReader reader = null;
		File writeFile = new File("./files/io.txt");
		String current;
		
		try {
			System.out.println("Top");
			
			reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter User Input:\t");
			current  = reader.readLine();
			
			writer = new FileOutputStream(writeFile);
			writer.write(current.getBytes());
			
			System.out.println("\nFile is written to!");
			System.out.println("File size is: " + writeFile.length());
			
			System.out.println("\nReading file: ");
			reader = new BufferedReader(new FileReader("./files/io.txt"));
			while ((current = reader.readLine()) != null) {
			    System.out.println(current);
			}
			
			if (writeFile.delete()) {
				System.out.println("Deleted File");
			} else {
				System.out.println("Failed to delete file");
			}
			
			System.out.println("Bottom");
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
				
				if(writer != null) {
					writer.close();
				}
				System.out.println("Finished!");
			} catch (IOException e) {
				e.getStackTrace();
			}
		}
	}
	

}
