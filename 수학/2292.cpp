#include <stdio.h>

int main(){
	int n, cnt=0, pile=1;
	scanf("%d", &n);
	while(n > pile){
		pile += 6 * cnt;
		cnt += 1;
	}
	if(n == 1) cnt = 1;
	printf("%d", cnt);
	
	return 0;
}
