import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String subStr[] = new String[str.length()];

		for (int i = 0; i < str.length(); i++) {
			subStr[i] = str.substring(i);
		}

		Arrays.sort(subStr);

		for (var li : subStr) {
			bw.write(li + "\n");
		}

		bw.flush();

	}
}
