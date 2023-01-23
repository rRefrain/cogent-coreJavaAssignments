/**
 * 
 */
package cogent.pkg.day4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * Write a program which take source file and destination file as input as command line arguments. It
copies the source file contents to destination file. If source file does not exist, it should give appriate
message to use. If destination file does not exist, it should be created. If it exists, program should
ask that, “whether you want to overwrite?(Yes/No”.
On the basis of user choice, appropriate action should be taken.
Note: Files may be any type of files like bitmap files, exe files, text files etc.

 * @author : michaelmiranda
 * @date   : Jan 22, 2023
 */
public class Question01 {
	public static void main(String[] args) {
		if (args.length > 2) {
			System.out.println("Error: Please enter source and destination file");
			return;
		}
		
		System.out.println("args[0]: " + args[0].trim() +
							"\nargs[1]:" + args[1].trim());
		
		File source = new File(args[0].trim());
		File dest = new File(args[1].trim());
		FileReader fr = null;
		FileWriter fw = null;
		Scanner s = new Scanner(System.in);
		
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
			} else {
				while (true) {
					System.out.println("Y to override / N to exit");
					String str = s.nextLine();
					if (str.trim().toLowerCase().equals("y")) {
						System.out.println("Overriding!");
						break;
					} else if (str.trim().toLowerCase().equals("n")) {
						System.out.println("Exiting!");
						return;
					}
					System.out.println("valid inputs are Y and N");
				}
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
		s.close();
	}
}
