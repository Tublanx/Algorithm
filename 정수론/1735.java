import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();

		int tmp = lcm(a2, b2);
		int resA = a1 * (tmp / a2);
		int resB = b1 * (tmp / b2);
		int res = resA + resB;

		System.out.println(res / gcd(tmp, res) + " " + tmp / gcd(tmp, res));
	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return a;
	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
