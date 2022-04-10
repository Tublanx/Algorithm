import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long min = Long.valueOf(st.nextToken());
		long max = Long.valueOf(st.nextToken());

		int cnt = 0;
		int size = (int) (max - min + 1);
		boolean check[] = new boolean[size];

		int sqrtNum = (int) Math.sqrt(max);

		for (long i = 2; i <= sqrtNum; i++) {
			long a = i * i;
			long b = min % a == 0 ? min / a : (min / a) + 1;
			for (long j = b; j * a <= max; j++) {
				check[(int) ((j * a) - min)] = true;
			}
		}

		for (int i = 0; i < size; i++) {
			if (!check[i]) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
