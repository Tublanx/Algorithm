import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int end = sc.nextInt();
		int min = Integer.MAX_VALUE, sum = 0;
		boolean isPerfectSquare = false;

		for (int i = start; i <= end; i++) {
			if (Math.sqrt(i) == (int) (Math.sqrt(i))) {
				sum += i;
				if (min > i) {
					min = i;
				}
				isPerfectSquare = true;
			}
		}

		if (!isPerfectSquare) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
