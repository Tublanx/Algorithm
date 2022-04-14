import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int cnt1 = 0, cnt2 = 0;

	public static void main(String[] args) throws Exception {
		var br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			fibo(Integer.parseInt(br.readLine()));
			sb.append(cnt1).append(" ").append(cnt2).append("\n");
			cnt1 = 0;
			cnt2 = 0;
		}

		System.out.println(sb);
	}

	static void fibo(int n) {
		int a = 0, b = 1, c = 0;

		if (n == 0) {
			cnt1++;
		} else if (n == 1) {
			cnt2++;
		} else if (n < 0) {
			return;
		} else {
			for (int i = 1; i <= n; i++) {
				a = b + c;
				b = c;
				c = a;
			}

			cnt1 = b;
			cnt2 = c;
		}
	}
}
