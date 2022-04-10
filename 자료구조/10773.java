import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		Deque<Integer> deque = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());

			if (num == 0) {
				deque.removeLast();
			} else {
				deque.add(num);
			}
		}

		for (int li : deque) {
			try {
				sum += li;
			} catch (Exception e) {
			}
		}

		System.out.println(sum);
	}
}
