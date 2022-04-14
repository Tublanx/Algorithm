import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		var maxQue = new PriorityQueue<Integer>();
		var minQue = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int nums = Integer.parseInt(br.readLine());
			maxQue.add(nums);

			if ((maxQue.size() + minQue.size()) % 2 != 0) {
				minQue.add(maxQue.poll());
			} else {
				if (minQue.peek() > maxQue.peek()) {
					maxQue.add(minQue.poll());
					minQue.add(maxQue.poll());
				}
			}
			
			sb.append(minQue.peek()).append("\n");
		}

		System.out.println(sb.toString());
	}
}
