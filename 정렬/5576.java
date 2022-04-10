import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		var w = new Integer[10];
		var k = new Integer[10];
		
		int wSum = 0, kSum = 0;
		
		for (int i = 0; i < 10; i++) {
			w[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			k[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(w, Collections.reverseOrder());
		Arrays.sort(k, Collections.reverseOrder());
		
		for (int i = 0; i < 3; i++) {
			wSum += w[i];
		}
		
		System.out.println(wSum);
		
		for (int i = 0; i < 3; i++) {
			kSum += k[i];
		}
		
		System.out.println(kSum);
	}
}
