package 알고리즘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			long num = sc.nextLong();

			long start = 0;
			long end = 1000000000;

			while (start + 1 < end) {
				long mid = (start + end) / 2;
				if(mid * mid < num) {
					start = mid;
				} else {
					end = mid;
				}
			}

			System.out.println(end * end == num ? 1 : 0);
		}
	}
}
