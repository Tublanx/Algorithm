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

		int diagonal = Integer.parseInt(st.nextToken());
		int heightRatio = Integer.parseInt(st.nextToken());
		int widthRatio = Integer.parseInt(st.nextToken());

		double result = Math.sqrt(Math.pow(diagonal, 2) / (Math.pow(heightRatio, 2) + Math.pow(widthRatio, 2)));

		bw.write((int) Math.floor(result * heightRatio) + " ");
		bw.write((int) Math.floor(result * widthRatio) + "");
		bw.flush();
	}

}
