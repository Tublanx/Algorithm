import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int sqrt[] = new int[5];
		int sum = 0;
		for (int i = 0; i < sqrt.length; i++) {
			sqrt[i] = (int) Math.pow(nums[i], 2);
			sum += sqrt[i];
			
		}
		
		System.out.println(sum % 10);
		
	}
}
