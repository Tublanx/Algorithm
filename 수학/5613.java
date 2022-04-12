import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int res = num;

		while (true) {
			String str = br.readLine();

			if (str.equals("=")) {
				break;
			}

			int nums = Integer.parseInt(br.readLine());

			if (str.equals("+")) {
				res += nums;
			} else if (str.equals("-")) {
				res -= nums;
			} else if (str.equals("*")) {
				res *= nums;
			} else {
				res /= nums;
			}
		}
		
		bw.write(res + "");
		bw.flush();
	}
}
