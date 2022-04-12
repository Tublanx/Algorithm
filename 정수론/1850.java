import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long res = gcd(a, b);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < res; i++) {
			sb.append(1);
		}

		System.out.println(sb);
	}

	static long gcd(long a, long b) {
		if (a % b == 0) {
			return b;
		}

		return gcd(b, a % b);
	}
}
