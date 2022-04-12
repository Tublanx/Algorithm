import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int a = 0, b = 1, c = 0;
		int num = sc.nextInt();

		if (num < 2) {
			if (num == 0)
				System.out.println(0);
			else
				System.out.println(1);
		} else {
			for (int i = 1; i < num; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			
			System.out.println(c);
		}
	}
}
