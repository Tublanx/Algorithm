import java.util.Scanner;

public class Main {
	static int nums[] = new int[1000000];

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10000; i++) {
			nums[getNum(i)] = 1;
			if (nums[i] != 1) {
				System.out.println(i);
			}
		}
	}

	static int getNum(int i) {
		int res = i;
		if (i >= 10000) {
			res += i / 10000;
			i %= 10000;
		}
		if (i >= 1000) {
			res += i / 1000;
			i %= 1000;
		}
		if (i >= 100) {
			res += i / 100;
			i %= 100;
		}
		if (i >= 10) {
			res += i / 10;
			i %= 10;
		}

		return res += i;
	}
}
