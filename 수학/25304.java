package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalPrice = sc.nextInt();
		int totalItemCount = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < totalItemCount; i++) {
			int itemPrice = sc.nextInt();
			int itemCount = sc.nextInt();

			sum += (itemPrice * itemCount);
		}

		if (totalPrice == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
