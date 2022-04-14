import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nums[] = new int[7];
		int sum = 0, min = 100, cnt = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			if(nums[i] % 2 == 1) {
				sum += nums[i];
				if(min > nums[i])
					min = nums[i];
			} else {
				cnt++;
			}
		}
		
		if(cnt == 7) {
			System.out.println(-1);
		} else {
			System.out.println(sum + "\n" + min);
		}
	}
}
