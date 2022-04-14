package 알고리즘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int n, cnt = 0;

		n = sc.nextInt();
		int nums = 0;
		for (int i = 0; i < n; i++) {
			nums = sc.nextInt();

			if (nums == 1) {
				continue;
			}

			if(isPrime(nums) == 1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

	static int isPrime(int num) {
		int cnt = 0, cnt2 = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}

		if (cnt == 2) {
			cnt2++;
		}

		return cnt2;
	}
}
