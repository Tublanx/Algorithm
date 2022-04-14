package 알고리즘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int num = sc.nextInt();
		System.out.println(fibonacci(num));
	}

	static int fibonacci(int num) {
		if (num < 2) {
			return num;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);
	}
}
