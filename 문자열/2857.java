import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();

			if (str.contains("FBI")) {
				bw.write((i + 1) + " ");
				cnt++;
			}
		}

		if (cnt == 0) {
			bw.write("HE GOT AWAY!");
		}
		bw.flush();
	}
}
