import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<Character>();
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			stack.clear();

			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);

				if (!stack.isEmpty() && stack.peek() == c) {
					stack.pop();
				} else {
					stack.add(c);
				}
			}

			if (stack.size() == 0) {
				cnt++;
			}
		}

		bw.write(cnt + "");
		bw.flush();
	}

}
