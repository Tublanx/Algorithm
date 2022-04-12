#include <stdio.h>

int main(){
	int m, n, cnt=0, sum=0, isFirst = 0, minValue = 0;
	
	scanf("%d %d", &m, &n);
	
	for(int i=m; i<=n; i++){
		cnt = 0;
		for(int j=1; j<=i; j++){
			if(i % j == 0){
				cnt++;			
			}
		}
		
		if(cnt == 2){
            isFirst++;
			sum += i;
		}

        if(isFirst == 1 && cnt == 2){
            minValue = i;
        }
	}

    if(sum == 0){
        printf("-1");
    } else {
        printf("%d\n", sum);
        printf("%d", minValue);
    }
	
	return 0;
}
