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
		String strCopy[] = str.split("");
		int sum1 = 0, sum2 = 0;

		for (int i = 0; i < strCopy.length; i++) {
			if (i < str.length() / 2) {
				sum1 += Integer.parseInt(strCopy[i]);
			} else {
				sum2 += Integer.parseInt(strCopy[i]);
			}
		}

		if (sum1 == sum2) {
			bw.write("LUCKY");
		} else {
			bw.write("READY");
		}
		
		bw.flush();

	}
}
