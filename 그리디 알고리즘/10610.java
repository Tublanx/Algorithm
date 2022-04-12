import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int res = 0;

		for (int i = 0; i < n.length(); i++) {
			res += n.charAt(i) - '0';
			arr.add(n.charAt(i) - '0');
		}

		Collections.sort(arr);

		if (arr.get(0) == 0 && res % 3 == 0) {
			for (int i = arr.size() - 1; i >= 0; i--) {
				System.out.print(arr.get(i));
			}
		} else {
			System.out.println(-1);
		}
	}
}
