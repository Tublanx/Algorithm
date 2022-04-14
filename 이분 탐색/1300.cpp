#include <stdio.h>
#include <stdlib.h>

#ifndef min
 #define min(a,b)  (((a) < (b)) ? (a) : (b))
#endif

int main(){
	int n, k, temp = 0;
	scanf("%d\n %d", &n, &k);
	int low = 1, high = k, mid = 1, ret = 0;
	
	while(low <= high){
		int cnt = 0;
		mid = (low + high) / 2;
		for(int i=1; i<=n; i++){
			cnt += min(mid / i, n);
		}
		
		if(cnt < k){
			low = mid + 1;
		} else {
			ret = mid;
			high = mid - 1;
		}
	}
	
	printf("%d", ret);
}
