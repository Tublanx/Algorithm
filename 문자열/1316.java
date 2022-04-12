import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			if (isGroup(str)) {
				cnt++;
			}
		}

		bw.write(cnt + "");
		bw.flush();
	}

	static boolean isGroup(String str) {
		int prev = 0;
		boolean bool[] = new boolean[100];
		for (int j = 0; j < str.length(); j++) {
			int c = str.charAt(j);

			if (prev != c) { // 전에 문자가 현재 문자와 같은지 체크
				if (bool[c - 'a'] == false) { // 현재 문자가 처음 나오는 경우
					bool[c - 'a'] = true;
					prev = c;
				} else {
					return false;
				}
			} else {
				continue;
			}
		}

		return true;
	}
}
