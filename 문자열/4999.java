import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String ah1 = br.readLine();
		String ah2 = br.readLine();

		if (ah1.length() < ah2.length()) {
			bw.write("no");
		} else {
			bw.write("go");
		}

		bw.flush();
	}
}
