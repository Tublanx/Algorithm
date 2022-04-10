package 알고리즘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr[] = new int[100];
		int divNum = 2, sqrtNum, remainNum, cnt = -1;

		while (true) {
			sqrtNum = (int) Math.sqrt(num);

			if (num == 1) {
				System.out.println();
				break;
			}

			while (true) {
				if (divNum > sqrtNum) {
					divNum = num;
					break;
				}

				remainNum = num - (num / divNum) * divNum; // 나머지

				if (remainNum == 0) {
					break;
				} else {
					divNum++;
				}
			}

			cnt++;
			arr[cnt] = divNum;

			if (num == divNum) {
				break;
			}

			num = num / divNum;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				break;
			}
			System.out.println(arr[i]);
		}

	}
}
