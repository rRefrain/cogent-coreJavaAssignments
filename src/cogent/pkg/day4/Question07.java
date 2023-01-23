/**
 * 
 */
package cogent.pkg.day4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 * 
 * Identify that, what functionality need to be added in above assignment , so that it
will require object externalization. Take approval for this functionality from the
faculty. Then implement this functionality using Object Externalization.
 */
public class Question07 {
	public static void main(String[] args) {
		FileOutputStream outputStream = null;
		FileOutputStream 	fos = null;
		ObjectOutputStream	oos = null;
	
		try {
			String numberA = Parser.readStr("Enter the first number");
			String numberB = Parser.readStr("Enter the Second number");
			double duration = Parser.readDoubleLoop("Enter Call Duration in minutes");
			
			CDR cdr = new CDR(numberA, numberB, duration);
			File f = new File ("./files/rated_cdr.txt");
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cdr);
		    System.out.println("Finished!");
		    
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		
		finally {
			try {
				Parser.close();
				if (fos != null) {
					fos.close();
				}
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.getStackTrace();
			}
			
		}
	}
}
