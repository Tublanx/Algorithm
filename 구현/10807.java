import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		int v = sc.nextInt();
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == v) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
