/**
 * 
 */
package cogent.pkg.day1;

/**
 * @author : michaelmiranda
 * @date   : Jan 20, 2023
 */
public class Question11 {
	public static void main(String[] args) {
		Matrix m = new Matrix(7,7);
		m.setElement(1,1,10);
		m.setElement(2, 3, 20);
		m.setElement(5, 12, 30);
		m.setElement(6, 5, 30);
		m.setElement(2, 3, -20);
		m.setElement(1, 6, 40);
		m.printArr();
		System.out.println("Transposed!");
		m.transpose();
		m.printArr();
		
	}
}

class Matrix {
	int [][] arr = new int[10][10];
	int rows;
	int columns;
	
	public Matrix() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = 0;
			}
		}
	}
	
	public Matrix(int x, int y) {
		this();
		rows = x;
		columns = y;
	}
	
	public void setElement(int r, int c, int value) {
		if(!validate(r,c)) {
			System.out.println("Please put a valid coordinate!");
			return;
		} else if(value < 0) {
			System.out.println("Please put a positive value!\n");
			value = 0;
		}
		arr[r][c] = value;
		System.out.println("Set:" + r + " " + c + " to: " + value);
	}
	
	public void printArr() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void transpose() {
		int [][] trans = new int[10][10];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				trans[i][j] = arr[j][i]; 
			}
		}
		this.arr = trans;
	}
	
	private boolean validate(int r, int c) {
		return r > -1 && r <= rows && c > -1 && c <= columns;
	}
}