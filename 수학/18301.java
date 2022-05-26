import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n12 = sc.nextInt();

		int result = ((n1 + 1) * (n2 + 1)) / (n12 + 1) - 1;
		System.out.println(result);
	}
}
