import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();

		int checkNum = (N / 100) * 100;
		while (checkNum % F != 0) {
			checkNum++;
		}
		String numToStr = String.valueOf(checkNum);
		System.out.println(numToStr.substring(numToStr.length() - 2, numToStr.length()));
	}
}
