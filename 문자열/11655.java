import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		bw.write(rot13(str));
		bw.flush();
	}

	public static String rot13(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c >= 'a' && c <= 'm') {
				c += 13;
			} else if (c >= 'A' && c <= 'M') {
				c += 13;
			} else if (c >= 'n' && c <= 'z') {
				c -= 13;
			} else if (c >= 'N' && c <= 'Z') {
				c -= 13;
			}
			
			sb.append(c);
		}
		
		return sb.toString();
	}
}
