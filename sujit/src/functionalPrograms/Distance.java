package functionalPrograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Distance d = new Distance();

		Scanner sc = new Scanner(System.in);

		System.out.print("enter x coordinate of the point: ");
		float x = sc.nextInt();
		System.out.print("enter y coordinate of the point: ");
		float y = sc.nextInt();

		float squareSum = (float) Math.pow(x, 2) + (float) Math.pow(y, 2);
		float distance = (float) Math.pow(squareSum, 0.5);

		System.out.print("distance is " + distance);
		sc.close();

	}

}
