import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String num = br.readLine();

			if (num.equals("0")) {
				break;
			}

			StringBuffer sb = new StringBuffer(num);

			if (num.equals(sb.reverse().toString())) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
