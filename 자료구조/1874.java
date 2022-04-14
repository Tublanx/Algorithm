import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		var br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int idx = 0;

		while (n-- > 0) {
			int nums = Integer.parseInt(br.readLine());

			if (nums > idx) {
				for (int i = idx + 1; i <= nums; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}

				idx = nums;
			} else if (stack.peek() != nums) {
				System.out.println("NO");
				System.exit(0);
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}

		System.out.println(sb);
	}
}
