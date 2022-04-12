package 알고리즘;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int[] num = new int[26];

		for (int i = 0; i < str.length(); i++) {
			num[str.charAt(i) - 97]++;
		}

		for (int i = 0; i < num.length; i++) {
			bw.write(num[i] + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
