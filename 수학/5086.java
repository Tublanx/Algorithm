package 알고리즘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int num1 = 1, num2 = 1;
		while (num1 != 0 || num2 != 0) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			try {
				if(num2 % num1 == 0) {
					System.out.println("factor");
				} else if(num1 % num2 == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			} catch (Exception e) {
				break;
			}
		}
	}
}
