import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			if (str.contains("push")) {
				String cap[] = str.split(" ");
				stack.push(Integer.parseInt(cap[1]));
			} else if (str.equals("top")) {
				try {
					System.out.println(stack.peek());
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else if (str.equals("size")) {
				System.out.println(stack.size());
			} else if (str.equals("pop")) {
				try {
					System.out.println(stack.pop());
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else if (str.equals("empty")) {
				System.out.println((stack.empty() == true ? 1 : 0));
			}
		}
	}
}
