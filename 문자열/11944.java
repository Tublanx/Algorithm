import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		var sc = new Scanner(System.in);

		String n = sc.next();
		int m = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < Integer.valueOf(n) * n.length() && i <= m; i += n.length()) {
			sb.append(n);
		}

		if (sb.length() > m) {
			System.out.println(sb.substring(0, m));
		} else {
			System.out.println(sb);
		}
	}
}
