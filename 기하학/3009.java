import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		var sc = new Scanner(System.in);

		int num1[] = { sc.nextInt(), sc.nextInt() };
		int num2[] = { sc.nextInt(), sc.nextInt() };
		int num3[] = { sc.nextInt(), sc.nextInt() };

		int x, y;

		if (num1[0] == num2[0]) {
			x = num3[0];
		} else if (num2[0] == num3[0]) {
			x = num1[0];
		} else {
			x = num2[0];
		}
		
		if (num1[1] == num2[1]) {
			y = num3[1];
		} else if (num2[1] == num3[1]) {
			y = num1[1];
		} else {
			y = num2[1];
		}
		
		System.out.println(x + " " + y);
	}
}
