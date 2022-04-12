import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		StringBuffer sb = new StringBuffer(str);

		if (sb.reverse().toString().equals(str)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
