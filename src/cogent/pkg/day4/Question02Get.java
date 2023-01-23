/**
 * 
 */
package cogent.pkg.day4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 
 * Write a stream based program which will accept Roll Number, Name, Age and Address
from user
Age and Roll-no should be numeric. Handle with built-in exception.
None of the field should be blank. Handle with custom exception,

Ask user ,whether to write the data in the file
If answer is yes then data is saved into a file as an object(User can write many records in
the file), otherwise terminate the current program
Write another program to display all the records saved into the file

 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class Question02Get {
	public static void main(String[] args) {
		ObjectInputStream 	ois = null;
		FileInputStream 	fis = null;
		
		try {			
			/* DeSerialization */
			fis = new FileInputStream("./files/user.txt");
			ois = new ObjectInputStream(fis);
			User obj;
			
			while ((obj = (User) ois.readObject()) != null) {
					System.out.println(obj.getInfo());
			}
			
		} catch (EOFException e) {
			System.out.println("End of file!");
		} catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
				if (fis != null) {
					fis.close();
				}
				System.out.println("Complete");
			} catch (IOException e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
