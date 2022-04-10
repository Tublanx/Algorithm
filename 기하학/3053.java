package 알고리즘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int num = sc.nextInt();
		double euclid = Math.PI * num * num;
		double texicap = 2 * num * num;

		System.out.println(String.format("%.6f", euclid));
		System.out.println(String.format("%.6f", texicap));
	}
}
