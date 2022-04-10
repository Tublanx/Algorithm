import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		ArrayList<Integer> sequence = new ArrayList<Integer>();

		for (int i = 1; i <= 1000; i++) {
			for (int j = 0; j < i; j++) {
				sequence.add(i);
			}
		}

		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum += sequence.get(i - 1);
		}

		bw.write(sum + "");

		bw.flush();
	}
}
