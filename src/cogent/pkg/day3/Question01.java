/**
 * 
 */
package cogent.pkg.day3;

import gl.itp.htp64.cs.emp.michael.Greeter;
import gl.itp.htp64.cs.emp.michael.Advisor;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Question01 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No one to greet");
			return;
		}
		
		Advisor advisorLen = new Advisor();
		Advisor advisorXia = new Advisor("Eat Good", "Do your Homework", 
				"Sleep Well", "Find Yourself", "Drink Tea");
		int length = args.length; 
		
		Greeter[] list = new Greeter[length];
		
		for (int i = 0; i < length; i++) {
			list[i] = new Greeter(args[i]);
		}
		
		for (Greeter person: list) {
			person.sayHello();
		}
		
		System.out.println(advisorLen.getAdvice());
		System.out.println(advisorXia.getAdvice());
		
		for (int i = length - 1; i >= 0; i--) {
			list[i].sayGoodbye();
		}
		
	}	
 }
