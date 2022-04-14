package 알고리즘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		String nums = sc.next();
		String[] num = nums.split(":");
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);
		print(reduce(n, m));
	}
	
	static void print(int[] nums) {
		System.out.format("%d:%d", nums[0], nums[1]);
	}

	static int[] reduce(int num1, int num2) {
		int[] reduce = new int[2];

		reduce[0] = num1;
		reduce[1] = num2;

		if (reduce[1] == 0) {
			reduce[0] = 0;
			reduce[1] = 0;
			return reduce;
		}

		int res = gcd(reduce[0], reduce[1]);

		reduce[0] /= res;
		reduce[1] /= res;

		return reduce;
	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}

		return Math.abs(a);
	}
}
