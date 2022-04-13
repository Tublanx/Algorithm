import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		ArrayList<Pair> list = new ArrayList<Pair>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(new Pair(i, Integer.parseInt(st.nextToken())));
		}

		Collections.sort(list, new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				if (o1.val > o2.val) {
					return 1;
				} else if (o1.val < o2.val) {
					return -1;
				} else {
					if (o1.idx < o2.idx) {
						return -1;
					} else {
						return 1;
					}
				}
			}
		});

		int idx[] = new int[1000];

		for (int i = 0; i < list.size(); i++) {
			idx[list.get(i).idx] = i;
		}

		for (int i = 0; i < list.size(); i++) {
			bw.write(idx[i] + " ");
		}

		bw.flush();
	}

	static class Pair {

		int idx;
		int val;

		public Pair(int idx, int val) {
			this.idx = idx;
			this.val = val;
		}
	}
}
