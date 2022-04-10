import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int nums[] = new int[3];
		int firstMax = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();

			if (firstMax < nums[i]) {
				secMax = firstMax;
				firstMax = nums[i];
			} else if (secMax < nums[i]) {
				secMax = nums[i];
			}
		}
		
		System.out.println(secMax);
	}
}
