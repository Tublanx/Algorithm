import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String fileName[] = new String[N];
		boolean bool = false;

		for (int i = 0; i < N; i++) {
			fileName[i] = br.readLine();
		}

		for (int i = 0; i < fileName[0].length(); i++) {
			char firstFileName = fileName[0].charAt(i);

			for (int j = 1; j < N; j++) {
				char fileNameChr = fileName[j].charAt(i);

				if (fileNameChr != firstFileName) {
					bool = true;
					break;
				} else {
					bool = false;
				}
			}

			if (bool) {
				bw.write("?");
			} else {
				bw.write(firstFileName);
			}
		}
		bw.flush();
	}
}
