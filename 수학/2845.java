package asdf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));
		var st = new StringTokenizer(br.readLine());

		int l = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		int totalPeople = l * p;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 5; i++) {
			int people = Integer.parseInt(st.nextToken());

			bw.write(people - totalPeople + " ");
		}

		bw.flush();
	}

}