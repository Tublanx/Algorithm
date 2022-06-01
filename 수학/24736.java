import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			int t = sc.nextInt();
			int f = sc.nextInt();
			int s = sc.nextInt();
			int p = sc.nextInt();
			int c = sc.nextInt();

			System.out.print((t * 6) + (f * 3) + (s * 2) + (p) + (c * 2) + " ");
		}
	}

}
