import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int len[];
	static int k, n;

	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));
		var st = new StringTokenizer(br.readLine());

		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		len = new int[k];
		long max = 0;

		for (int i = 0; i < k; i++) {
			len[i] = Integer.parseInt(br.readLine());
			if (len[i] > max) {
				max = len[i];
			}
		}

		max++;

		long start = 0;
		long mid = 0;

		while (start < max) {
			mid = (start + max) / 2;
			long cnt = 0;

			for (int i = 0; i < len.length; i++) {
				cnt += (len[i] / mid);
			}

			if (cnt < n) {
				max = mid;
			} else {
				start = mid + 1;
			}
		}

		bw.write(start - 1 + "");
		bw.flush();
	}

}
