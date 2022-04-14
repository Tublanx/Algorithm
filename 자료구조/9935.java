import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		String explodeStr = br.readLine();
		var stack = new Stack<Character>();
		boolean bool = false;

		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));

			if (stack.size() >= explodeStr.length()) {
				bool = true;
				for (int j = 0; j < explodeStr.length(); j++) {
					if (stack.get(stack.size() - explodeStr.length() + j) != explodeStr.charAt(j)) {
						bool = false;
						break;
					}
				}

				if (bool) {
					for (int j = 0; j < explodeStr.length(); j++) {
						stack.pop();
					}
				}
			}
		}
		
		if(stack.size() == 0) {
			System.out.println("FRULA");
		}

		for (var i : stack) {
			sb.append(i);
		}

		System.out.println(sb.toString());
	}
}
