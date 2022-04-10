import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str[] = new String[n];
		Deque<Integer> deque = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}

		for (int i = 0; i < n; i++) {
			if (str[i].contains("push")) {
				String cap[] = str[i].split(" ");
				deque.add(Integer.parseInt(cap[1]));
			} else if (str[i].equals("front")) {
				try {
					System.out.println(deque.getFirst());
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else if (str[i].equals("size")) {
				System.out.println(deque.size());
			} else if (str[i].equals("pop")) {
				try {
					System.out.println(deque.pop());
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else if (str[i].equals("empty")) {
				System.out.println((deque.isEmpty() == true ? 1 : 0));
			} else if (str[i].equals("back")) {
				try {
					System.out.println(deque.getLast());
				} catch (Exception e) {
					System.out.println(-1);
				}
			}
		}
	}
}
