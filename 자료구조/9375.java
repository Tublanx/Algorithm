import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			HashMap<String, Integer> map = new HashMap<String, Integer>();

			for (int j = 0; j < n; j++) {
				String name = sc.next();
				String type = sc.next();

				map.put(type, map.getOrDefault(type, 0) + 1);
			}

			Iterator<Integer> iterator = map.values().iterator();
			int answer = 1;

			while (iterator.hasNext()) {
				answer *= iterator.next().intValue() + 1;
			}

			System.out.println(answer - 1);

		}
	}
}
