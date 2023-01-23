/**
 * 
 */
package cogent.pkg.day4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * Write a program using java file system to copy the contents of one file into another.
(This is Self Study Assignment. Refer Java API documentation.)

 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class Question03 {
	public static void main(String[] args) {
		File source = new File("./files/where.txt");
		File dest = new File("./files/new.txt");
		FileReader fr = null;
		FileWriter fw = null;

		if (!source.exists() || source.isDirectory() || !source.canRead()) {
			System.out.println("Error: Please enter a valid source file");
			return;
		} 
		
		if (dest.exists()) {
			if (dest.isDirectory()) {
				System.out.println("Error: Destination is a folder");
				return;
			} else if(!dest.canWrite()) {
				System.out.println("Error: Cannot Write to destination");
				return;
			}	
		}
		
		try {
			fr = new FileReader(source);
			fw = new FileWriter(dest);
			
			int ch;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
		
			fr.close();
			fw.close();
			System.out.println("Finished!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
