import java.util.Scanner;

public class Main {
	static int digit;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		digit = sc.nextInt();
		dfs("", 0);
		System.out.println(sb);
	}

	static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	static void dfs(String str, int digit) {
		if (digit == Main.digit) {
			sb.append(str).append("\n");
		} else {
			for (int i = 1; i < 10; i++) {
				String s = str + i;

				if (isPrime(Integer.parseInt(s))) {
					dfs(s, digit + 1);
				}
			}
		}
	}
}
