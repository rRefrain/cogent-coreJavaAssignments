/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class BankAccount {
	
	private final Integer accNo;
	private final String custName;
	private final boolean isSavings;
	private float balance;

	/**
	 * @param accNo
	 * @param custName
	 * @param accType
	 * @param balance
	 */
	public BankAccount(Integer accNo, String custName, boolean isSavings, float balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.isSavings = isSavings;
		this.balance = balance;
	}
	
	public void deposit(float amt) throws NegativeAmount{
		if (amt < 0) {
			throw new NegativeAmount(amt + " is negative");
		}
		this.balance += amt;
	}
	
	public void withdraw(float amt) throws InsufficientFunds, NegativeAmount{
		if (amt < 0) {
			throw new NegativeAmount(amt + " is negative");
		} 
		
		float newBalance = balance - amt;
		
		checkBalance(newBalance);
		this.balance -= newBalance;
	}
	
	public float getBalance() throws InsufficientFunds, NegativeAmount {
		if (balance < 0) {
			throw new NegativeAmount(balance + " is negative");
		}
		checkBalance(balance);
		return balance;
	}
	
	public void checkBalance(float current) throws InsufficientFunds {
		if (isSavings == true && current < 5000) {
			throw new InsufficientFunds("Must have at leat 5000 in savings account!\nAfter Transaction: " + current);
		} else if (isSavings == false && current < 1000) {
			throw new InsufficientFunds("Must have at leat 1000 in savings account!\\nAfter Transaction: " + current);
		}
	}
	
	public void display() {
		System.out.print("Account#: " + accNo + " Customer Name: " + custName);
		if (isSavings) {
			System.out.println("'s Saving Account");
		} else {
			System.out.println("'s Checking Account");
		}
		System.out.println("has $" + balance);
	}
	
}
