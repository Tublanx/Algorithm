package 알고리즘;

import java.util.Scanner;

public class Main {
	static int arr[][];
	static boolean isVisited[];
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = 1;

		arr = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		isVisited = new boolean[n + 1];
		dfs(v);
		System.out.println(cnt - 1);
	}

	static void dfs(int v) {
		isVisited[v] = true;
		cnt++;

		if (v == arr.length) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[v][i] == 1 && !isVisited[i]) {
				dfs(i);
			}
		}

	}
}