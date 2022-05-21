import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int[3];
		int b[] = new int[3];
		int c[] = new int[3];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		
		b[0] = c[0] - a[2];
		b[1] = c[1] / a[1];
		b[2] = c[2] - a[0];
		
		System.out.print(b[0] + " " + b[1] + " " + b[2]);
	}
}
