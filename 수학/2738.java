import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int array1[][] = new int[N][M];
		int array2[][] = new int[N][M];

		for (int row = 0; row < N; row++) {
			for (int col = 0; col < M; col++) {
				array1[row][col] = sc.nextInt();
			}
		}
		
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < M; col++) {
				array2[row][col] = sc.nextInt();
			}
		}
		
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < M; col++) {
				System.out.print(array1[row][col] + array2[row][col] + " ");
			}
			System.out.println();
		}
	}
}
