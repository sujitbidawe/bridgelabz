package logicalPrograms;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gambler gb = new Gambler();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting money: ");
		int money = sc.nextInt();

		System.out.println("enter the goal you want to reach: ");
		int goal = sc.nextInt();
		sc.close();

		float win_count = 0;
		float lost_count = 0;

		if (money > 0 && money < goal) {
			gb.PlaceBet(money, goal, win_count, lost_count);
		} else {
			if (money <= 0) {
				System.out.println("money is needed to place the bet!");
			} else if (goal < money) {
				System.out.println("goal should be more than current money!");
			}
		}
	}

	public void PlaceBet(int money, int goal, float win_count, float lost_count) {
		float total = 0;
		for (int i = 0; money < goal && money > 0; i++) {
			int number = (int) (Math.random() * 100);

			if (number <= 20) {
				money = money + 5;
				System.out.println("win...current money is " + money);
				win_count = win_count + 1;
				if (money >= goal) {
					System.out.println("Goal achieved!!!");
					System.out.println();

					// break;
				}

			} else {
				lost_count = lost_count + 1;
				money = money - 1;
				System.out.println("lost the bet... Current money is " + money);
				if (money <= 0) {
					System.out.println("lost all the money...");
					System.out.println();

				}

			}

		}
		total = win_count + lost_count;
		float win_per = (win_count * 100) / total;
		float lost_per = (lost_count * 100) / total;
		System.out.println(
				"winnig percentage is " + win_per + "% with total " + win_count + " wins out of " + total + " rounds");
		System.out.println("loosing percentage is " + lost_per + "% with total " + lost_count + " lost bets out of "
				+ total + " rounds");

	}


}
