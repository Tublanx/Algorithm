import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			String input = sc.next();
			System.out.println(bracket(input));
		}
	}

	static String bracket(String input) {
		Stack<Character> stack = new Stack<Character>();

		for (int j = 0; j < input.length(); j++) {
			char bracket = input.charAt(j);

			if (bracket == '(')
				stack.push(bracket);
			else if (stack.empty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}

		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
