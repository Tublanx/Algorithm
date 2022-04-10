import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int grades[] = new int[n];

			double sum = 0, avg = 0, cnt = 0;

			for (int j = 0; j < n; j++) {
				grades[j] = sc.nextInt();
				sum += grades[j];
			}

			avg = sum / n;

			for (int j = 0; j < n; j++) {
				if (grades[j] > avg) {
					cnt++;
				}
			}

			System.out.printf("%.3f%%\n", (cnt / n) * 100);
		}
	}
}
