import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int n = sc.nextInt();
		long nums[] = new long[k];
		var que = new PriorityQueue<Long>();

		for (int i = 0; i < k; i++) {
			nums[i] = sc.nextLong();
			que.add(nums[i]);
		}

		long res = 0;

		for (int i = 0; i < n; i++) {
			res = que.poll();

			for (int j = 0; j < k; j++) {
				que.add(res * nums[j]);

				if (res % nums[j] == 0) {
					break;
				}
			}
		}

		System.out.println(res);
	}
}
