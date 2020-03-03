package basicCorePrograms;

import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloUser HU = new HelloUser();
		HU.hello();
	}

	public void hello() {
		System.out.println("please enter your name: ");
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();

		if (name.length() >= 3) {
			System.out.println("Hello, " + name + "!");
		} else {
			System.out.println("The name should have 3 or more characters ");
			hello();
		}

		sc.close();

	}

}
