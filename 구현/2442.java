import java.io.IOException;
import java.util.Scanner;

public class asdf {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = i; j < N; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
