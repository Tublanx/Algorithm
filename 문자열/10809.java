import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int chk[] = new int[26];

		sc.close();

		for (int i = 0; i < 26; i++) {
			chk[i] = -1;
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (chk[c - 97] == -1) {
				chk[c - 97] = i;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(chk[i] + " ");
		}
	}
}
