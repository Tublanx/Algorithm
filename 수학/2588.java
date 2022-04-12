import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int v1 = b % 10;
		int v10 = (b / 10) % 10;
		int v100 = (b / 100) % 10;
		
		System.out.println(a * v1);
		System.out.println(a * v10);
		System.out.println(a * v100);
		System.out.println(a * b);
	}
}
