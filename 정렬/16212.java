import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		
		for (int i = 0; i < n; i++) {
			que.add(sc.nextInt());
		}
		
		while(!que.isEmpty()) {
			sb.append(que.poll() + " ");
		}
		
		System.out.println(sb.toString());
	}
}
