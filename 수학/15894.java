import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		BigInteger n = sc.nextBigInteger();
		System.out.println(n.multiply(BigInteger.valueOf(4)));
	}

}