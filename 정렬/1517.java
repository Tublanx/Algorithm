import java.util.Scanner;

public class Main {
	static long sum;
	static long arr[];
	static long temp[];

	static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;

			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			int p = start;
			int q = mid + 1;
			int idx = start;

			while (p <= mid && q <= end) {
				if (arr[p] <= arr[q]) {
					temp[idx++] = arr[p++];
				} else {
					temp[idx++] = arr[q++];
					sum += (mid + 1 - p);
				}
			}
			
			while(p <= mid) {
				temp[idx++] = arr[p++];
			}
			
			while(q <= end) {
				temp[idx++] = arr[q++];
			}

			for (int i = start; i <= end; i++) {
				arr[i] = temp[i];
			}
		}
	}

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int n = sc.nextInt();
		sum = 0;

		arr = new long[n];
		temp = new long[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}

		mergeSort(0, n - 1);
		System.out.println(sum);
	}
}
