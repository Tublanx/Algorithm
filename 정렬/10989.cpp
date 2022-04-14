#include <stdio.h>

int cnt[100000] = {0, };

int main(){
	int n, nums;
	
	scanf("%d", &n);
	
	for(int i=0; i<n; i++){
		scanf("%d", &nums);
		cnt[nums]++;
	}
	
	for(int i=0; i<=10000; i++){
		if(cnt[i] == 0) continue;
		
		for(int j=0; j<cnt[i]; j++){
			printf("%d\n", i);
		}
	}
	
	return 0;
}
