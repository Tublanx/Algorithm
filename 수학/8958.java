import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();

			for (int j = 0; j < input.length(); j++) {
				char c = input.charAt(j);

				if (c == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}

			System.out.println(sum);
			cnt = 0;
			sum = 0;
		}
	}
}
