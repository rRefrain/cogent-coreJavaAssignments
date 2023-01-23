/**
 * 
 */
package cogent.pkg.day4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
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
public class Question02Write {
	public static void main(String[] args) {
		FileOutputStream 	fos = null;
		ObjectOutputStream	oos = null;
		String name;
		String address;
		int age;
		int rollNo;
		String keepGoing = "Y";
		ArrayList<User> arr = new ArrayList<User>();
		
		try {
			/* Serialization */
			fos = new FileOutputStream("./files/user.txt");
			oos = new ObjectOutputStream(fos);

			while (keepGoing.equals("Y")) {
				name = Parser.readString("Enter UserName");
				address = Parser.readString("Enter Address");
				age = Parser.readInt("Enter Age");
				rollNo = Parser.readInt("Enter Roll#");
				
				arr.add(new User(name, address, age, rollNo)); 
				
				keepGoing = Parser.readString("Enter Y to keep adding more users\n or anything else to exit");
			}	
			
			for (User x: arr) {
					oos.writeObject(x);
			}
			System.out.println("End of Try");
		} catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (EmptyFieldException e) {
			System.out.println("EmptyFieldException");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("General Exception message");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (oos != null) {
					oos.close();
				}
				Parser.close();
				System.out.println("Finished!");
			} catch(IOException e) {
				System.out.println(e.getMessage());
			} 
		}
	}
}
