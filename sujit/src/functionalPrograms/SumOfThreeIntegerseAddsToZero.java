package functionalPrograms;

import java.util.Scanner;

public class SumOfThreeIntegerseAddsToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements to add in the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("enter elements to add in the array");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		System.out.println();
		int count = 0;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = i + 2; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println(array[i] + " " + array[j] + " " + array[k]);
						count++;
					}
				}
			}
		}
		System.out.println("found " + count + " triplets that add up to zero");

	}

}
