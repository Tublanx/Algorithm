package 알고리즘;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int arr[][];
	static boolean isVisited[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();

		arr = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		isVisited = new boolean[n + 1];
		dfs(v);
		System.out.println();
		isVisited = new boolean[n + 1];
		bfs(v);
	}

	static void dfs(int v) {
		isVisited[v] = true;

		System.out.print(v + " ");

		if (v == arr.length) {
			return;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[v][i] == 1 && isVisited[i] == false) {
				dfs(i);
			}
		}
	}

	static void bfs(int v) {
		Queue<Integer> que = new LinkedList<Integer>();

		que.add(v);
		isVisited[v] = true;

		System.out.print(v + " ");

		while (!que.isEmpty()) {
			int temp = que.poll();
			for (int i = 0; i < arr.length; i++) {
				if (arr[temp][i] == 1 && isVisited[i] == false) {
					que.add(i);
					isVisited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
}
