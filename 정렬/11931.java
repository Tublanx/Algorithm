import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(nums);

		for (int i = n - 1; i >= 0; i--) {
			bw.write(nums[i] + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
