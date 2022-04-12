import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String[] minus = str.split("-");
		int result = Integer.MAX_VALUE;

		for (int i = 0; i < minus.length; i++) {
			int sum = 0;
			String[] plus = minus[i].split("\\+");

			for (int j = 0; j < plus.length; j++) {
				sum += Integer.parseInt(plus[j]);
			}

			if (result == Integer.MAX_VALUE) {
				result = sum;
			} else {
				result -= sum;
			}
		}

		bw.write(result + "");
		bw.flush();
	}

}
