import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> que = new ArrayDeque<Integer>();

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
			case "push":
				que.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				Integer item = que.poll();
				if (item == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(item).append('\n');
				}
				break;

			case "size":
				sb.append(que.size()).append('\n');
				break;

			case "empty":
				if (que.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				break;

			case "front":
				Integer ite = que.peek();
				if (ite == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(ite).append('\n');
				}
				break;

			case "back":
				Integer it = que.peekLast();
				if (it == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(it).append('\n');
				}
				break;
			}
		}

		System.out.println(sb);
	}
}