import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		sc.close();
		
		int nCopy = n;
		int cnt = 0;

		while (true) {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);

			cnt++;
			if (n == nCopy) {
				break;
			}
		}

		System.out.println(cnt);
	}
}
