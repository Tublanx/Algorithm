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

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String phoneNumbers[] = new String[n];

			for (int j = 0; j < n; j++) {
				phoneNumbers[j] = br.readLine();
			}
			
			Arrays.sort(phoneNumbers);

			if (isSame(n, phoneNumbers)) {
				bw.write("NO\n");
			} else {
				bw.write("YES\n");
			}
		}

		bw.flush();
	}

	static boolean isSame(int n, String phoneNumbers[]) {
		for (int i = 0; i < n - 1; i++) {
			if (phoneNumbers[i + 1].startsWith(phoneNumbers[i])) {
				return true;
			}
		}

		return false;
	}
}
