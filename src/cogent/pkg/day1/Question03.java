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
public class Question03 {
	public static void main(String[] args) {
		Book [] books = new Book [2];
		books[0] = createBooks("Java Programming", 350.50);
		books[1] = createBooks("Let Us C", 200.00);
		showBooks(books);
	}
	
	public static Book createBooks(String name, double price) {
		return new Book(name, price);
	}
	
	public static void showBooks(Book[] books) {
		for(var x: books) {
			System.out.println(x.getBook_title() + " Rs." + x.getBook_price());
		}
	}
}
