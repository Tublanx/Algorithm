import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		bw.write(func(str) + "");
		bw.flush();
	}

	static int func(String str) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == 'c' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
					i++;
				}
			} else if (c == 'd' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '-') {
					i++;
				} else if (str.charAt(i + 1) == 'z' && i < str.length() - 2) {
					if (str.charAt(i + 2) == '=') {
						i += 2;
					}
				}
			} else if ((c == 'l' || c == 'n') && i < str.length() - 1) {
				if (str.charAt(i + 1) == 'j') {
					i++;
				}
			} else if ((c == 's' || c == 'z') && i < str.length() - 1) {
				if (str.charAt(i + 1) == '=') {
					i++;
				}
			}

			cnt++;
		}

		return cnt;
	}
}