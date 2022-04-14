import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
		try {
			heap(maxHeap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void heap(PriorityQueue<Integer> que) throws Exception {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int nums = Integer.parseInt(br.readLine());

			if (nums == 0) {
				sb.append(que.size() == 0 ? 0 : que.poll()).append("\n");
			} else {
				que.add(nums);
			}
		}
		System.out.println(sb.toString());
	}
}
