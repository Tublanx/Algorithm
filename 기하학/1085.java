import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = toInt(st.nextToken()), y = toInt(st.nextToken());
		int w = toInt(st.nextToken()), h = toInt(st.nextToken());

		int min1 = Math.min(x, w - x);
		int min2 = Math.min(y, h - y);
		
		System.out.println(Math.min(min1, min2));
	}

	static int toInt(String str) {
		return Integer.parseInt(str);
	}
}
