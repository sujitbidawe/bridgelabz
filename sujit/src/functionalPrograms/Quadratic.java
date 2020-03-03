package functionalPrograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("for equation a*x*x + b*x + c = 0 : ");

		System.out.print("enter value of a: ");
		double a = sc.nextDouble();
		System.out.print("enter value of b: ");
		double b = sc.nextDouble();

		System.out.print("enter value of c: ");
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("delta: " + delta);

		if (delta > 0) {
			double root_one_of_x = (-b - (Math.sqrt(delta))) / (2 * a);
			double root_two_of_x = (-b + (Math.sqrt(delta))) / (2 * a);

			System.out.println("first root of x: " + root_one_of_x);
			System.out.println("second root of x: " + root_two_of_x);

		} else if (delta == 0) {
			double root_one_of_x = -b / (2 * a);

			System.out.println("root of x: " + root_one_of_x);

		} else {
			double real_part_of_root = -b / (2 * a);
			double imaginary_part_of_root = Math.sqrt(-delta) / (2 * a);

			System.out.println("first root of x: " + real_part_of_root + "+" + imaginary_part_of_root + "i");
			System.out.println("second root of x: " + real_part_of_root + "-" + imaginary_part_of_root + "i");

		}
		sc.close();

	}

}
