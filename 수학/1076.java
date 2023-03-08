import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String firstCol = sc.nextLine();
		String secondCol = sc.nextLine();
		String thirdCol = sc.nextLine();

		Map<String, Integer> resisMap = new HashMap<>();

		String str1[] = "black,brown,red,orange,yellow,green,blue,violet,grey,white".split(",");
		for (int i = 0; i < 10; i++) {
			resisMap.put(str1[i], i);
		}

		int a = resisMap.get(firstCol);
		int b = resisMap.get(secondCol);
		int c = Integer.parseInt(a + "" + b);
		long d = (long) Math.pow(10, resisMap.get(thirdCol)) * c;
		System.out.println(d);
	}
}
