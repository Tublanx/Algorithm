import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(input.readLine());
		input.close();

		BigInteger res = new BigInteger("1");
		for (int i = N; i >= 1; i--) {
			BigInteger num = new BigInteger(String.valueOf(i));
			res = res.multiply(num);
		}
		
		String str = new StringBuffer(res.toString()).reverse().toString();
		
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '0') {
				cnt++;
			} else {
				break;
			}
		}

		output.write(cnt + "");
		output.close();
	}
}
