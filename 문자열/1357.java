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
		
		String x = st.nextToken();
		String y = st.nextToken();
		
		StringBuffer xSb = new StringBuffer(x);
		StringBuffer ySb = new StringBuffer(y);
		
		StringBuffer xReverse = xSb.reverse();
		StringBuffer yReverse = ySb.reverse();
		
		int sum = Integer.parseInt(xReverse.toString()) + Integer.parseInt(yReverse.toString());
		
		String sumStr = String.valueOf(sum);
		
		StringBuffer res = new StringBuffer(sumStr);
		
		int resInt = Integer.valueOf(res.reverse().toString());
		
		bw.write(resInt + "");
		
		bw.flush();
	}
}
