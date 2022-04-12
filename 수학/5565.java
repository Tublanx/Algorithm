package asdf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int totalPrice = Integer.parseInt(br.readLine());
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		bw.write(totalPrice - sum + "");
		bw.flush();
	}

}