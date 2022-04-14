import java.util.Scanner;

public class asd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int map[][] = new int[9][9];

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int maxValue = map[0][0];
		int x = 0, y = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] > maxValue) {
					maxValue = map[i][j];
					x = i + 1;
					y = j + 1;
				}
			}
		}
		
		System.out.println(maxValue);
		System.out.println(x + " " + y);
	}
}
