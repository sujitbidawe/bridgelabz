package functionalPrograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("enter temperature in fahrenheit: ");
		double t = sc.nextDouble();
		System.out.print("enter wind speed in MPH: ");
		double v = sc.nextDouble();

		// double w = 0;

		if (t <= 50 && v>=3 && v<=120) {
			double w = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));

			System.out.println("the temperature felt by body is: " + w);
		}
		else {
			System.out.print("the formula only works for temperatures at or below 50°F and wind speeds above 3 mph. ");

		}
		sc.close();
	}

}
