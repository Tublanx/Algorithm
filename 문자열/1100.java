import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			var s = sc.nextLine().split("");
			for (int j = 0; j < 8; j++) {
				var board = s[j];
				if ((i + j) % 2 == 0) {
					if (board.equals("F"))
						cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
