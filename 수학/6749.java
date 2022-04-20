import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int age1 = Integer.parseInt(br.readLine());
		int age2 = Integer.parseInt(br.readLine());

		int res = (age2 - age1) + age2;

		// 15 - 12 = a - 15, a = age1 - age2 + age2
		bw.write(res + "");
		bw.flush();
	}
}
