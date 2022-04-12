import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		int m = sc.nextInt();
		int b[] = new int[m];

		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			if (map.containsKey(b[i])) {
				sb.append(1 + " ");
			} else {
				sb.append(0 + " ");
			}
		}
		
		System.out.println(sb.toString());
	}
}