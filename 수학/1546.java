import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double grades[] = new double[n];
		double max = Double.MIN_VALUE;
		int index = 0;

		for (int i = 0; i < n; i++) {
			grades[i] = sc.nextDouble();

			if (max < grades[i]) {
				max = grades[i];
				index = i;
			}
		}

		for (int i = 0; i < index; i++) {
			grades[i] = grades[i] / max * 100;
		}

		for (int i = index; i < n; i++) {
			grades[i] = grades[i] / max * 100;
		}

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += grades[i];
		}
		double avg = sum / n;

		System.out.println(avg);
	}
}
