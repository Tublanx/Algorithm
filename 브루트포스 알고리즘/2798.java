import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int nums[] = new int[n];

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		sc.close();

		System.out.println(bruteForce(nums, n, m));
	}

	static int bruteForce(int nums[], int n, int m) {
		int res = 0;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int j2 = j + 1; j2 < n; j2++) {
					int sum = nums[i] + nums[j] + nums[j2];

					if (n == sum)
						return sum;

					if (res < sum && sum <= m) {
						res = sum;
					}
				}
			}
		}

		return res;
	}
}
