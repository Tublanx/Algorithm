import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String k = br.readLine();

			if (map.get(k) == null) {
				map.put(k, 1);
			} else {
				map.put(k, map.get(k) + 1);
			}
		}

		for (int i = 0; i < n - 1; i++) {
			String k = br.readLine();

			map.put(k, map.get(k) - 1);
		}

		for (var k : map.keySet()) {
			if (map.get(k) != 0) {
				bw.write(k);
				break;
			}
		}

		bw.flush();
	}
}
