import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String nums[] = str.split(",");
		int cnt = 0;
		
		for (int i = 0; i < nums.length; i++) {
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
