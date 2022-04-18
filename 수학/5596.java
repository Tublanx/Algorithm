import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.NoSuchAlgorithmException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 4; j++) {
				int point = Integer.parseInt(st.nextToken());
				if (i == 0) {
					sum1 += point;
				} else {
					sum2 += point;
				}
			}
		}

		if (sum1 > sum2) {
			bw.write(sum1 + "");
		} else {
			bw.write(sum2 + "");
		}

		bw.flush();
	}
}
