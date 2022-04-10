import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int n = sc.nextInt();
		String strs[] = new String[n];
		
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			strs[i] = sc.nextLine();
		}

		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}
		});

		System.out.println(strs[0]);
		for (int i = 1; i < n; i++) {
			if (!strs[i].equals(strs[i - 1])) {
				System.out.println(strs[i]);
			}
		}
	}
}
