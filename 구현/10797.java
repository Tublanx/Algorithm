import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String n = sc.nextLine();
		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			String str = sc.next();

			if (str.contains(n)) {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
	}
}
