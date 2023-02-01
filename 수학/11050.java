import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(getBinomialCoefficient(n, k));
	}

	static int getBinomialCoefficient(int n, int k) {

		int numerator = 0;
		int denominator = 0;

		numerator = factorial(n);
		denominator = factorial(n - k) * factorial(k);

		return numerator / denominator;
	}

	static int factorial(int number) {
		if (number <= 1) {
			return 1;
		}

		return factorial(number - 1) * number;
	}

}
