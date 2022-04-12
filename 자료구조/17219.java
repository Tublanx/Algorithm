import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));
		var st = new StringTokenizer(br.readLine());

		HashMap<String, String> map = new HashMap<String, String>();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			String key = st.nextToken();
			String value = st.nextToken();

			map.put(key, value);
		}

		for (int i = 0; i < m; i++) {
			String key = br.readLine();

			if (map.containsKey(key)) {
				bw.write(map.get(key));
			}
			
			bw.write("\n");
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
