import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		
		long sum = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				sum += (a.charAt(i)-48) * (b.charAt(j)-48);
			}
		}
		System.out.println(sum);
	}
}
