import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static boolean[] isVisited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		dfs(n, m, 1, 0);
		System.out.println(sb);
	}

	static void dfs(int n, int m, int at, int depth) {
		if (depth == m) {
			for (var v : arr) {
				sb.append(v).append(' ');
			}

			sb.append('\n');
			return;
		}

		for (int i = 1; i <= n; i++) {
			arr[depth] = i;
			dfs(n, m, i + 1, depth + 1);
		}
	}
}