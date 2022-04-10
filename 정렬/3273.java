import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int num[] = new int[100001];
	static int x;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt(br.readLine());
		num = new int[size];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		x = Integer.parseInt(br.readLine());
		
		Arrays.parallelSort(num);

		bw.write(twoPointer(0, size - 1) + "");
		bw.flush();
	}

	static int twoPointer(int start, int end) {
		int sum = 0, count = 0;

		while (start < end) {
			sum = num[start] + num[end];

			if (sum == x) {
				count++;
			}

			if (sum <= x) {
				start++;
			} else {
				end--;
			}
		}

		return count;

	}

}
