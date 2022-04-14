import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		var br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Queue<Integer> que = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			que.add(i);
		}

		int cnt = 0;

		while (!que.isEmpty()) {
			if (cnt == k - 1) {
				list.add(que.poll());
				cnt = 0;
			} else {
				que.add(que.poll());
				cnt++;
			}
		}

		sb.append("<");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				sb.append(list.get(i));
			} else {
				sb.append(list.get(i) + ", ");
			}
		}
		sb.append(">");

		System.out.println(sb);
	}
}
