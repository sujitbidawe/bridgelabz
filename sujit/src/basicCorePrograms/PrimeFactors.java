package basicCorePrograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeFactors pf = new PrimeFactors();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number whose prime factors are to be found: ");
		int number = sc.nextInt();
		sc.close();

		int[] array = new int[number / 2];
		int index = 0;

		pf.FindFactors(array, index, number);
		pf.CheckIfPrime(array, number);

	}

	public void FindFactors(int[] array, int index, int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				array[index] = i;
				index++;
			}
		}

	}

	public void CheckIfPrime(int[] array, int number) {

		int count = 0;
		System.out.println("prime factors of " + number + " are:");
		for (int i = 0; i < array.length && array[i] != 0; i++) {
			for (int j = 2; j <= array[i] / 2; j++) {
				if (array[i] % j == 0) {
					count++;
				}

			}
			if (count == 0) {
				System.out.print(array[i] + " ");
				count = 0;
			}
			count = 0;

		}
	}
}
