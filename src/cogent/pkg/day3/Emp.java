/**
 * 
 */
package cogent.pkg.day3;

/**
 * @author : michaelmiranda
 * @date   : Jan 22, 2023
 */
public class Emp {
	private int empID;
	private String empName;
	private String designation;
	private double basic;
	private double HRA = 0.00;
	
	/**
	 * @param empID
	 * @param empName
	 * @param designation
	 * @param basic
	 * @param hRA
	 */
	public Emp(int empID, String empName, String designation, 
			double basic) throws LowSalException, InvalidDesignation {
		String processed = designation.trim().toLowerCase();
		checkBasic(basic);
		checkDesignation(processed);
		
		this.empID = empID;
		this.empName = empName;
		this.designation = processed;
		this.basic = basic;
		this.HRA = calcHra();
	}
	
	public void printDET() {
		System.out.println(getDET());
	}
	
	public String getDET() {
		return "EmployeeID: " + empID + " EmpolyeeName: " + empName
				+ "\nDesignation: " + designation + " Basic: " + this.basic
				+ "\nHRA: " + HRA;
	}
	
	private double calcHra() {
		double mul = 0.05;
		if (this.designation.equals("manager")) {
			mul = 0.10;
		} else if (this.designation.equals("officer")) {
			mul = 0.12;
		} 
		return mul * this.basic;
	}

	public void checkDesignation(String designation) 
			throws InvalidDesignation {
		
		if (!designation.equals("manager") &&
			!designation.equals("officer") &&
			!designation.equals("clerk")) {
			throw new InvalidDesignation("designation: " + designation + " is invalid");
		}
	}
	
	public void checkBasic(double basic) 
			throws LowSalException {
		if (basic < 500.00) {
			throw new LowSalException("Basic must be at least 500.00! It is currently: " + basic);
		}
	}
}
