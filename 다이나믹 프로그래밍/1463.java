import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int max = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		func(n, 0);
		bw.write(max + "");

		bw.flush();
	}

	static void func(int num, int cnt) {
		if (num == 1) {
			max = Math.min(max, cnt);
			return;
		}

		if (cnt >= max) {
			return;
		}

		if (num % 3 == 0) {
			func(num / 3, cnt + 1);
		}

		if (num % 2 == 0) {
			func(num / 2, cnt + 1);
		}

		func(num - 1, cnt + 1);
	}
}
