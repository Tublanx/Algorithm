package 알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			String[] strCopy = str.split(" ");
			for (int j = 0; j < strCopy.length; j++) {
				StringBuffer sb = new StringBuffer(strCopy[j]);

				System.out.print(sb.reverse() + " ");
			}
			
			System.out.println();
		}
	}
}
