import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int idx = 0;
		int map[] = new int[n * n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[idx++] = Integer.parseInt(st.nextToken());
			}
		}

		Arrays.sort(map);

		bw.write(map[map.length - n] + "");

		bw.flush();
	}

}
