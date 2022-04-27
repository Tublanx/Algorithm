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

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), i);
		}

		for (int i = 0; i < M; i++) {
			if (map.get(br.readLine()) != null) {
				cnt++;
			}
		}

		bw.write(cnt + "");
		bw.flush();
	}

}