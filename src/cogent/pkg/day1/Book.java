/**
 * 
 */
package cogent.pkg.day1;

/**
 * 
Create a class Book which describes its Book_title and Book_price. 
Use getter and setter methods to get & set the Books description.
Implement createBooks and showBooks methods to create n objects of Book in an
array. Display the books along with its description as follows:-

Book Title Price
Java Programming Rs.350.50
Let Us C Rs.200.00

Note: createBooks & showBooks should not be member functions of Book class.
 * @author : michaelmiranda
 * @date   : Jan 19, 2023
 */
public class Book {
	String Book_title;
	double book_price;

	/**
	 * @param book_title the book's title
	 * @param book_price the book's price
	 */
	public Book(String book_title, double book_price) {
		Book_title = book_title;
		this.book_price = book_price;
	}
	/**
	 * @return the book_title
	 */
	public String getBook_title() {
		return Book_title;
	}
	/**
	 * @param book_title the book_title to set
	 */
	public void setBook_title(String book_title) {
		Book_title = book_title;
	}
	
	/**
	 * @return the book_price
	 */
	public double getBook_price() {
		return book_price;
	}
	/**
	 * @param book_price the book_price to set
	 */
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	
}
