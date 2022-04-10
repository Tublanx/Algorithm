package 알고리즘;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		var num1 = new BigInteger(sc.next());
		var num2 = new BigInteger(sc.next());
		
		num1 = num1.add(num2);
		
		System.out.println(num1.toString());
	}
}

