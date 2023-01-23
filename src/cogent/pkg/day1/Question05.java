/**
 * 
 */
package cogent.pkg.day1;

import java.time.LocalDate;

/**
 * 
Create a class Date for manipulating dates. Provide a constructor that enables an
object of this class to be initialized when it is declared (You can select any default
values for the day, month & year, e.g. your birth date). 

Provide the necessary functionality to perform error checking on the initializer values for data members
day, month, and year.

Also, provide a member function to add an integer in a date
to obtain a new date.

Design separate class Employee which will have following information.
Employee Number Number
Employee Name Text
Joining Date Date
Provide appropriate constructor(s) & methods to this class. Provide main function
which will create 5 objects of Employee class.
 * 
 * @author : michaelmiranda
 * @date   : Jan 19, 2023
 */
public class Question05 {
	public static void main(String[] args) {
		Employee [] employees = new Employee[5];
		employees[0] = new Employee(1 , "Name1", new Date(01, 01, 1991));
		employees[1] = new Employee(2 , "Name2", new Date(02, 02, 1992));
		employees[2] = new Employee(3 , "Name3", new Date(03, 03, 1993));
		employees[3] = new Employee(4 , "Name4", new Date(04, 04, 1994));
		employees[4] = new Employee(5 , "Name5", new Date(05, 05, 1995));
		
		for (var x : employees) {
			System.out.println(x);
		}
	}
}

class Employee {
	int eNumber;
	String eName;
	Date joinDate;
	
	/**
	 * @param eNumber
	 * @param eName
	 */
	public Employee(int eNumber, String eName, Date joinDate) {
		super();
		this.eNumber = eNumber;
		this.eName = eName;
		this.joinDate = joinDate;
	}
	
	/**
	 * @return the joinDate
	 */
	public Date getJoinDate() {
		return joinDate;
	}

	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	public String toString() {
		return "\neNumber:" + eNumber +
				"\teName:" + eName +
				"\njoinDate:" + joinDate.toString();
	}
	
	
}

class Date {
	private int day;
	private int month;
	private int year;
	private LocalDate date;
	
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		date = LocalDate.of(year, month, day);
	}
	
	public Date(LocalDate date) {
		this(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
	}
	
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	public void addDate(Integer date) {
		this.date 	= this.date.plusDays(date);
		this.day   	= this.date.getDayOfMonth();
		this.month 	= this.date.getMonthValue();
		this.year 	= this.date.getYear();
	}
	
	public String toString() {
		return date.toString();
	}
}
