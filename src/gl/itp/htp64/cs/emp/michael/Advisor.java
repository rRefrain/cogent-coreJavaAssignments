/**
 * 
 */
package gl.itp.htp64.cs.emp.michael;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Advisor {
	String [] listOfAdvice = new String[5];
		
	/**
	 * @param listOfAdvice
	 */
	public Advisor() {
		listOfAdvice[0] = "Why are you doingh this?";
		listOfAdvice[1] = "What are you doingh?";
		listOfAdvice[2] = "Why?";
		listOfAdvice[3] = "Don't be a Booingh. Be a Doingh.";
		listOfAdvice[4] = "Doinghs get things done";
	}
	
	public Advisor(String first, String second, String third, String fourth, String fifth) {
		listOfAdvice[0] = first;
		listOfAdvice[1] = second;
		listOfAdvice[2] = third;
		listOfAdvice[3] = fourth;
		listOfAdvice[4] = fifth;
	}
	
	public String getAdvice() {
		return listOfAdvice[zeroToFour()];
	}

	private static int zeroToFour() {
		int i;
		while (true) { 
			i = (int) (Math.random() * 10);
			if(i < 5) {
				break;
			}
		}
		return i;
	}
	
}
