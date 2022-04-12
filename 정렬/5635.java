import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String str[][] = new String[n][4];

		for (int i = 0; i < n; i++) {
			str[i][0] = sc.next();
			str[i][1] = sc.next();
			str[i][2] = sc.next();
			str[i][3] = sc.next();
		}

		Arrays.sort(str, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
					if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
						return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
					} else {
						return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
					}
				}

				return Integer.compare(Integer.parseInt(o1[3]), Integer.parseInt(o2[3]));
			}
		});

		System.out.println(str[n - 1][0] + "\n" + str[0][0]);
	}
}
