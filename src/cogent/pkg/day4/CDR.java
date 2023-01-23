/**
 * 
 */
package cogent.pkg.day4;

/**
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class CDR {
	private String numberA;
	private String numberB;
	private double duration;
	private double calcCharge;
	
	/**
	 * @param numberA
	 * @param numberB
	 * @param duration
	 * @param calcCharge
	 */
	public CDR(String numberA, String numberB, double duration) {
		super();
		this.numberA = numberA;
		this.numberB = numberB;
		this.duration = duration;
		this.calcCharge = duration * 1.00;
	}
	
	/**
	 * @return the numberA
	 */
	public String getNumberA() {
		return numberA;
	}
	/**
	 * @param numberA the numberA to set
	 */
	public void setNumberA(String numberA) {
		this.numberA = numberA;
	}
	/**
	 * @return the numberB
	 */
	public String getNumberB() {
		return numberB;
	}
	/**
	 * @param numberB the numberB to set
	 */
	public void setNumberB(String numberB) {
		this.numberB = numberB;
	}
	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(double duration) {
		this.duration = duration;
	}
	/**
	 * @return the calcCharge
	 */
	public double getCalcCharge() {
		return calcCharge;
	}
	/**
	 * @param calcCharge the calcCharge to set
	 */
	public void setCalcCharge(double calcCharge) {
		this.calcCharge = calcCharge;
	}

	/**
	 * @return
	 */
	public String info() {
		return "NumberA: " + numberA + " NumberB: " + numberB 
				+ "\nCall Duration: " + duration
				+ "Charges is " + calcCharge + " Rupees";
	}
	
}
