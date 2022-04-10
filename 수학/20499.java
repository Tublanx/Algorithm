import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String nums[] = str.split("/");

		if (toInt(nums[0]) + toInt(nums[2]) < toInt(nums[1]) || toInt(nums[1]) == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}

	static int toInt(String path) {
		return Integer.parseInt(path);
	}
}