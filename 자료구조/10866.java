import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws Exception {
		var br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			if (str.contains("push_back")) {
				String cap[] = str.split(" ");
				deq.addLast(Integer.parseInt(cap[1]));
			} else if (str.contains("push_front")) {
				String cap[] = str.split(" ");
				deq.addFirst(Integer.parseInt(cap[1]));
			} else if (str.equals("pop_front")) {
				try {
					System.out.println(deq.removeFirst());
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else if (str.equals("pop_back")) {
				try {
					System.out.println(deq.removeLast());
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else if (str.equals("size")) {
				System.out.println(deq.size());
			} else if (str.equals("empty")) {
				System.out.println(deq.isEmpty() == true ? 1 : 0);
			} else if (str.equals("front")) {
				try {
					System.out.println(deq.getFirst());
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else {
				try {
					System.out.println(deq.getLast());
				} catch (Exception e) {
					System.out.println(-1);
				}
			}
		}
	}
}
