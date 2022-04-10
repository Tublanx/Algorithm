import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		var sc = new Scanner(System.in);

		String n = sc.next();
		String m = sc.next();

		if (!n.equals(m)) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
