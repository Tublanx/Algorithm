import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			char c[] = str.toCharArray();

			c[0] = Character.toUpperCase(c[0]);	
			
			bw.write(c);
			bw.write("\n");
		}
		
		bw.flush();
	}

}