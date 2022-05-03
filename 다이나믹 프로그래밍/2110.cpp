#include <stdio.h>

int main() {
	int T;
	
	scanf("%d", &T);
	for (int i=0; i<T; i++) {
		int N;
		scanf("%d", &N);
		
		long long dp[N+1];
		
		if(N < 4) {
			printf("1\n");
		} else {
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;
			for(int j = 4; j<=N; j++) {
				dp[j] = dp[j-2] + dp[j-3];
			}
			
			printf("%lld\n", dp[N]);
		}
	}
	
	return 0;
}
