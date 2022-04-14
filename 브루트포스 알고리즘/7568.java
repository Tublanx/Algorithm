import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int bulks[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			bulks[i][0] = sc.nextInt();
			bulks[i][1] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int rank = 1;

			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}

				if (bulks[i][0] < bulks[j][0] && bulks[i][1] < bulks[j][1]) {
					rank++;
				}
			}

			System.out.print(rank + " ");
		}
	}
}
