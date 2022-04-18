import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int min = Integer.MAX_VALUE;
			int sum = 0;

			for (int j = 0; j < 7; j++) {
				int nums = sc.nextInt();

				if (nums % 2 == 0) {
					sum += nums;

					if (min > nums) {
						min = nums;
					}
				}
			}

			System.out.println(sum + " " + min);
		}
	}
}
