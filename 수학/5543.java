import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		var br = new BufferedReader(new InputStreamReader(System.in));
		var bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int hamburgers[] = new int[3];
		int drinks[] = new int[2];
		
		for (int i = 0; i < hamburgers.length; i++) {
			hamburgers[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < drinks.length; i++) {
			drinks[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(hamburgers);
		Arrays.sort(drinks);
		
		bw.write(hamburgers[0] + drinks[0] - 50 + "");
		bw.flush();
	}

}