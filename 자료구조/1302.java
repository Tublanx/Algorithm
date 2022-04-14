import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String titles = sc.next();

			if (map.containsKey(titles)) {
				map.replace(titles, map.get(titles) + 1);
			} else {
				map.put(titles, 1);
			}
		}

		int max = 0;
		for (var li : map.keySet()) {
			max = Math.max(map.get(li), max);
		}

		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list);

		for (var li : list) {
			if (map.get(li) == max) {
				System.out.println(li);
				break;
			}
		}
	}
}
