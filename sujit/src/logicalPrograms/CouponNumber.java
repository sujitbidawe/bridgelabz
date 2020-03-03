package logicalPrograms;

import java.util.Scanner;

public class CouponNumber {
	public static int current = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CouponNumber cn = new CouponNumber();
		Scanner sc = new Scanner(System.in);

		int number_of_elements = sc.nextInt();
		int[] array = new int[number_of_elements];
		int count =  0;
		int k = 0;
		int flag = 0;

		while (count != number_of_elements) {
			int coupon = (int) (Math.random() * 100);
			System.out.print(coupon + " ");
			for (int i = 0; i <= k; i++) {
				if (array[i] != coupon) {
					flag = 0;
				} else {
					flag = 1;
				}
			}
			if (flag == 0) {
				array[k] = coupon;
				count++;
				k++;
			}
			flag = 0;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}