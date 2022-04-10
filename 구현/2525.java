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
		StringTokenizer st = new StringTokenizer(br.readLine());

		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());

		minute += time;
		if (minute >= 60) {
			while (minute >= 60) {
				minute -= 60;
				hour++;
				if (hour >= 24) {
					hour = 0;
				}
			}
		}

		bw.write(hour + " " + minute);
		bw.flush();
	}

}
