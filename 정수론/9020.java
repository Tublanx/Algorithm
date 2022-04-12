import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean prime[] = new boolean[100000];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		prime();

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int left = n / 2;
			int right = n / 2;

			while (true) {
				if (!prime[left] && !prime[right]) {
					System.out.println(left + " " + right);
					break;
				}

				left--;
				right++;
			}
		}
	}

	static void prime() {
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) {
				continue;
			}

			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}
