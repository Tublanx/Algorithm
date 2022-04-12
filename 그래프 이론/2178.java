package 알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int map[][];
	static int visit[][];
	static int n, m;

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n + 1][m + 1];
		visit = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			for (int j = 1; j <= m; j++) {
				map[i][j] = str.charAt(j - 1) - '0';
			}
		}

		bfs();
	}

	public static void bfs() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(1, 1));
		int[] xArr = { -1, 0, 1, 0 };
		int[] yArr = { 0, 1, 0, -1 };
		visit[1][1] = 1;

		while (!queue.isEmpty()) {
			var location = queue.poll();
			int row = location.row;
			int col = location.col;

			for (int i = 0; i < 4; i++) {
				int x = row + xArr[i];
				int y = col + yArr[i];

				if (nodeCheck(x, y)) {
					queue.add(new Node(x, y));
					visit[x][y] = visit[row][col] + 1;
				}
			}
		}
		
		System.out.println(visit[n][m]);
	}

	static boolean nodeCheck(int row, int col) {
		if (row < 1 || row > n || col < 1 || col > m) {
			return false;
		}

		if (visit[row][col] != 0 || map[row][col] == 0) {
			return false;
		}

		return true;
	}
}

class Node {
	int row, col;

	public Node(int row, int col) {
		this.row = row;
		this.col = col;
	}
}
