/**
 * 
 */
package gl.itp.htp64.cs.emp.michael;

/**
 * @author : michaelmiranda
 * @date   : Jan 21, 2023
 */
public class Greeter {
	private String name;

	/**
	 * @param name
	 */
	public Greeter(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello, " + name + "!");
	}
	
	public void sayGoodbye() {
		System.out.println("Goodbye " + name + "!");
	}
	
}
