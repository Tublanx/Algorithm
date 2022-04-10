import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new TreeMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '.') {
					String key = str.substring(j + 1);

					if (map.get(key) == null) {
						map.put(key, 1);
					} else {
						map.put(key, map.get(key) + 1);
					}
				}
			}
		}

		for (var k : map.entrySet()) {
			bw.write(k.getKey() + " " + k.getValue() + "\n");
		}

		bw.flush();
	}
}
