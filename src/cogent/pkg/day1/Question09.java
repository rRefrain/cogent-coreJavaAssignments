/**
 * 
 */
package cogent.pkg.day1;

/**
 * Write a program that allows you to create an integer array of 18 elements with the
following values: int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0}. The program
computes the sum of element 0 to 14 and stores it at element 15, computes the
average and stores it at element 16 and identifies the smallest value from the array
and stores it at element 17.
 * @author : michaelmiranda
 * @date   : Jan 20, 2023
 */
public class Question09 {
	public static void main(String[] args) {
		int[] A = new int [18];
		A[0] = 3;
		A[1] = 2;
		A[2] = 4;
		A[3] = 5;
		A[4] = 6;
		A[5] = 4;
		A[6] = 5;
		A[7] = 7;
		A[8] = 3;
		A[9] = 2;
		A[10] = 3;
		A[11] = 4;
		A[12] = 7;
		A[13] = 1;
		A[14] = 2;
		A[15] = 0;
		A[16] = 0;
		A[17] = 0;
		
		int sum = 0;
		int average = 0;
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < 15; i++) {	
			sum += A[i];
			smallest = Math.min(smallest, A[i]);
		}
		average = sum / 15;
			
		A[15] = sum;
		A[16] = average;
		A[17] = smallest;
		
		for (int i: A) {
			System.out.print(i + " ");
		}
	}
}
