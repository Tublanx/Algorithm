import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long res = lcm(a, b);
		System.out.println(res);
	}

	static long gcd(long a, long b) {
		if (a % b == 0) {
			return b;
		}

		return gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}
