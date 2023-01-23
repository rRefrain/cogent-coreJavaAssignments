/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Question03 {
	public static void main(String[] args) {
		CalcAverage calc = new CalcAverage();
		try {
			System.out.println("avgFirstN of 10 is: " + calc.avgFirstN(10));
			System.out.println("avgFirstN of 100 is: " + calc.avgFirstN(100));
			//IllegalArgumentException from -10 
			System.out.println("avgFirstN of -10 is: ");
			System.out.println(calc.avgFirstN(-10));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		Number n = new Number(10, 15);
		Number n2 = new Number(10, 0);
		
		try {
			n.add();
			n.display();
			n.sub();
			n.display();
			n.mul();
			n.display();
			n.div();
			n.display();
			n.divSecond();
			n.display();
			
			n2.add();
			n2.display();
			//ArithmeticException from divide by 0
			n2.div();
			n2.display();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		BankAccount savings = new BankAccount(1, "Max", true, 6000.00f);
		BankAccount checking = new BankAccount(2, "Max", true, 2000.00f);
		savings.display();
		checking.display();
		
		try {
			savings.deposit(1000);
			savings.display();
			//NegativeAmount from -1000
			savings.deposit(-1000);
		} catch(NegativeAmount e) {
			System.out.println(e.getMessage());
		}
		
		try {
			savings.withdraw(1000);
			savings.display();
			//NegativeAmount from -1000
			savings.withdraw(-1000);
		} catch(NegativeAmount e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//InsufficientFunds
			savings.withdraw(2000);
		} catch(InsufficientFunds e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//InsufficientFunds
			checking.withdraw(2000);
		} catch(InsufficientFunds e) {
			System.out.println(e.getMessage());
		}
		
	}
}
