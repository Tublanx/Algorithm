import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> list[];
	static int res[];
	static boolean isVisited[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		list = new ArrayList[n + 1];
		res = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
		}

		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			isVisited = new boolean[n + 1];

			if (dfs(i)) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

	static boolean dfs(int x) {
		for (int i = 0; i < list[x].size(); i++) {
			int want = list[x].get(i);

			if (!isVisited[want]) {
				isVisited[want] = true;

				if (res[want] == 0 || dfs(res[want])) {
					res[want] = x;
					return true;
				}
			}
		}

		return false;
	}
}
