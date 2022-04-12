import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			String str = br.readLine();

			char[] c1 = str.split(" ")[0].toCharArray();
			char[] c2 = str.split(" ")[1].toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			if (Arrays.equals(c1, c2)) {
				bw.write(str.split(" ")[0] + " & " + str.split(" ")[1] + " are anagrams.\n");
			} else {
				bw.write(str.split(" ")[0] + " & " + str.split(" ")[1] + " are NOT anagrams.\n");
			}
		}

		bw.flush();
	}
}
