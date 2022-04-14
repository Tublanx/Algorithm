import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<>();
		String[] index = new String[N + 1];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			map.put(str, i);
			index[i] = str;
		}

		for (int i = 0; i < M; i++) {
			String str = br.readLine();

			try {
				sb.append(index[Integer.parseInt(str) - 1] + "\n");
			} catch (NumberFormatException e) {
				sb.append((map.get(str) + 1) + "\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
	}

}
