import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int cnt1 = 0, cnt2 = 0;

		for (int i = 0; i < n; i++) {
			int opinion = Integer.parseInt(br.readLine());

			if (opinion == 0) {
				cnt1++;
			} else {
				cnt2++;
			}
		}

		if (cnt1 > cnt2) {
			bw.write("Junhee is not cute!");
		} else if (cnt2 > cnt1) {
			bw.write("Junhee is cute!");
		}
		
		bw.flush();
	}
}
