package basicCorePrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeapYear LY = new LeapYear();
		LY.yearCheck();

	}

	public void yearCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a 4 digit year: ");
		int year = sc.nextInt();
		int len = Integer.toString(year).length();

		if (len != 4) {
			System.out.println("The year should have 4 digits!!");
			yearCheck();
		} else {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
				System.out.println(year + " is a leap year!");
			} else {
				System.out.println(year + " is not a leap year!");
			}
			sc.close();
		}

	}

}
