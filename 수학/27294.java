import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int S = sc.nextInt();
		System.out.println(T <= 11 ? 280 : (T >= 12 && T <= 16 ? (S == 0 ? 320 : 280) : 280));
	}
}
