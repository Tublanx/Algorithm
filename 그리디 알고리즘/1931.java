import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m[][] = new int[n][2];
		int cnt = 0, end = 0;

		for (int i = 0; i < n; i++) {
			m[i][0] = sc.nextInt();
			m[i][1] = sc.nextInt();
		}

		Arrays.sort(m, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}

				return o1[1] - o2[1];
			}
		});

		for (int i = 0; i < n; i++) {
			if(end <= m[i][0]) {
				end = m[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}