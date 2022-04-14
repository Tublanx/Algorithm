import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int res = 0;

		for (int i = 0; i < n; i++) {
			int sum = 0;
			int idx = i;

			while (idx != 0) {
				sum += idx % 10;
				idx /= 10;
			}

			if (sum + i == n) {
				res = i;
				break;
			}
		}

		System.out.println(res);
	}
}
