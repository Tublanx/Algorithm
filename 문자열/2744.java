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

		for (int i = 0; i < strCopy.length; i++) {
			if (strCopy[i] == strCopy[i].toLowerCase()) {
				strCopy[i] = strCopy[i].toUpperCase();
			} else {
				strCopy[i] = strCopy[i].toLowerCase();
			}
			
			bw.write(strCopy[i]);
		}

		bw.flush();
	}
}
