package 알고리즘;

import java.util.Scanner;

public class Main {
	static int cnt2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		int nums[] = new int[1000];

		for (int i = 0; i < cnt; i++) {
			cnt2 = sc.nextInt();
			for (int j = 0; j < cnt2; j++) {
				nums[j] = sc.nextInt();
			}
			System.out.println(kadaneAlgorithm(nums));
		}

	}

	static int kadaneAlgorithm(int nums[]) {
		int maxNum = -1000;
		int end = Integer.MIN_VALUE;
		
		for (int i = 0; i < cnt2; i++) {
			maxNum = Math.max(maxNum + nums[i], nums[i]);
			end = Math.max(maxNum, end);
		}

		return end;
	}
}
