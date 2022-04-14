package 알고리즘;

import java.util.Scanner;

public class Main {
	static long a, b, c;
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		
		System.out.println(getNum(b));
	}
	
	static long getNum(long b) {
		if(b == 1) return a % c;
		
		long value = getNum(b / 2) % c;
		if(b % 2 == 1) {
			return value * value % c * a % c;
		} else {
			return value * value % c;
		}
	}
}
