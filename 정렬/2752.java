import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int[] nums = new int[3];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		sc.close();

		Arrays.sort(nums);

		for (var n : nums) {
			System.out.print(n + " ");
		}
	}
}
