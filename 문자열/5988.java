import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			BigInteger num = sc.nextBigInteger();
			System.out.println(num.remainder(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)) ? "even" : "odd");
		}
	}
}
