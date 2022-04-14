import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long nums[] = new long[n + 1];
		long sum[] = new long[n + 1];

		for (int i = 1; i <= n; i++) {
			nums[i] = sc.nextLong();

			if (i == 1) {
				sum[i] = nums[i];
			} else {
				sum[i] = sum[i - 1] + nums[i];
			}
		}

		int m = sc.nextInt();
		for (int i = 1; i <= m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			if(start == 1) {
				System.out.println(sum[end]);
			} else {
				System.out.println(sum[end] - sum[start - 1]);
			}
		}
	}
}
