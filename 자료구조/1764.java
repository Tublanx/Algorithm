import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var st = new StringTokenizer(br.readLine());

		HashSet<String> hash = new HashSet<String>();
		ArrayList<String> arrList = new ArrayList<String>();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			String names = br.readLine();
			hash.add(names);
		}

		for (int i = 0; i < m; i++) {
			String names = br.readLine();
			if (hash.contains(names)) {
				arrList.add(names);
			}
		}

		Collections.sort(arrList);

		System.out.println(arrList.size());
		for (var arr : arrList) {
			System.out.println(arr);
		}
	}
}
