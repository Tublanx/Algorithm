import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String[] strNum = str.split(",");
		int sum = 0;

		for (int i = 0; i < strNum.length; i++) {
			sum += Integer.parseInt(strNum[i]);
		}

		bw.write(sum + "");
		bw.flush();
	}
}
