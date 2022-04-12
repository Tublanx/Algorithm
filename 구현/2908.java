package 알고리즘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		StringBuffer sb1 = new StringBuffer(a);
		StringBuffer sb2 = new StringBuffer(b);

		StringBuffer reA = sb1.reverse();
		StringBuffer reB = sb2.reverse();

		if (toInt(reA) > toInt(reB)) {
			System.out.println(reA);
		} else if (toInt(reB) > toInt(reA)) {
			System.out.println(reB);
		}
	}

	static int toInt(Object path) {
		return Integer.parseInt(path.toString());
	}
}
