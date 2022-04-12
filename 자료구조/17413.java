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

		String str = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		boolean bool = false;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '<') {
				bool = true;

				while (!stack.isEmpty()) {
					bw.write(stack.pop());
				}

				bw.write(c);
			} else if (c == '>') {
				bool = false;

				bw.write(c);
			} else if (bool) {
				bw.write(c);
			} else if (!bool) {
				if (c == ' ') {
					while (!stack.isEmpty()) {
						bw.write(stack.pop());
					}

					bw.write(c);
				} else {
					stack.push(c);
				}
			}

		}

		while (!stack.isEmpty()) {
			bw.write(stack.pop());
		}

		bw.flush();
	}
}
