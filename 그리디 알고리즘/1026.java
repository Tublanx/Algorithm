import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int b[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st2.nextToken());
		}

		Arrays.sort(a);
		Arrays.sort(b);

		bw.write(func(a, b) + "");

		bw.flush();
	}

	static int func(int[] a, int[] b) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[a.length - i - 1];
		}

		return sum;
	}
}
