//confirm the problem statement
package functionalPrograms;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("enter number of columns: ");
		int columns = sc.nextInt();

		System.out.println("enter elements : ");

		int[][] table = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int element = sc.nextInt();
				table[i][j] = element;
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(/* "table ["+i+"] ["+j+"] = "+ */table[i][j] + "    ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
