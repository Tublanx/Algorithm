import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		var br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int max = 1, cnt = 1, res = 0;
		long nums[] = new long[n];

		for (int i = 0; i < n; i++) {
			nums[i] = Long.parseLong(br.readLine());
		}

		Arrays.sort(nums);

		for (int i = 1; i < n; i++) {
			if (nums[i] == nums[i - 1])
				cnt++;
			else
				cnt = 1;

			if (cnt > max) {
				max = cnt;
				res = i;
			}
		}
		
		System.out.println(nums[res]);
	}
}
