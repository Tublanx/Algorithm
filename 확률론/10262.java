import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = 0, b = 0;

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			a += Integer.parseInt(st1.nextToken());
		}

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			b += Integer.parseInt(st2.nextToken());
		}

		if (a > b) {
			bw.write("Gunnar");
		} else if (a < b) {
			bw.write("Emma");
		} else {
			bw.write("Tie");
		}

		bw.flush();
	}

}
