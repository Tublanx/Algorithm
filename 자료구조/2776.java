import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashSet<Integer> set = new HashSet<Integer>();

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			set.clear();

			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				set.add(num);
			}
			int m = Integer.parseInt(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int num = Integer.parseInt(st2.nextToken());
				if (set.contains(num)) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			}
		}
		
		bw.flush();
	}
}
