import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int height[];
	static int m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		height = new int[n];
		int max = 0;

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			height[i] = Integer.parseInt(st2.nextToken());

			if (height[i] > max) {
				max = height[i];
			}
		}

		// 4 42 40 26 46인 경우 start = 0, end = 46임
		int start = 0;
		int end = max;

		// start와 end의 중간값에서 20높이의 나무를 가질 수 있는지 판별
		bw.write(parametricSearch(start, end) + "");

		bw.flush();
	}

	static int parametricSearch(int start, int end) {
		while (start + 1 < end) {
			int mid = (start + end) / 2;

			if (check(mid)) {
				start = mid;
			} else {
				end = mid;
			}
		}

		return start;
	}

	static boolean check(int height) {
		long sum = 0;
		long result, tree;

		for (int i = 0; i < Main.height.length; i++) {
			tree = Main.height[i];

			if (tree >= height) {
				result = tree - height;
				sum += result;
			}
		}

		if (sum >= m) {
			return true;
		} else {
			return false;
		}
	}

}
