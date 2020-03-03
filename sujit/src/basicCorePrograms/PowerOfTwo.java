package basicCorePrograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PowerOfTwo pot = new PowerOfTwo();
		pot.Power();

	}

	public void Power() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a power for 2 between 0 and 31: ");
		int power = sc.nextInt();

		if (power >= 0 && power < 32) {
			for (int i = 0; i <= power; i++) {
				System.out.println("2^" + i + " = " + (int) Math.pow(2, i) + " ");
			}
		} else {
			System.out.println("Please enter a power within given range");
			Power();
		}
		sc.close();
	}
}
