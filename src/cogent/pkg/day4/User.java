/**
 * 
 */
package cogent.pkg.day4;

import java.io.Serializable;

/**
 * @author : michaelmiranda
 * @date   : Jan 23, 2023
 */
public class User implements Serializable {
	
	private String name;
	private String address;
	private int age;
	private int rollNo;
	
	/**
	 * @param age
	 * @param rollNo
	 * @param name
	 * @param address
	 */
	public User(String name, String address, 
			int age, int rollNo) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.rollNo = rollNo;	
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getInfo() {
		return "Name: " + name + " Address: " + address +
				"\nAge: " + age + " RollNo: " + rollNo;
	}
	
}
