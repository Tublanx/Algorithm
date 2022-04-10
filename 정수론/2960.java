import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int nums[] = new int[n + 1];
		int res = 0;
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 2; i <= n; i++) {
			set.add(i);
		}

		for (int i = 2; i <= n; i++) {
			int idx = 1;
			int idx2 = i * idx;

			while (idx2 <= n) {
				if (set.contains(idx2)) {
					set.remove(idx2);
					nums[res++] = idx2;
				}

				idx2 = i * ++idx;
			}
		}

		System.out.print(nums[k - 1]);
	}
}
