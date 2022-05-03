#include <stdio.h>

int main() {
	
	int total, minus;
	
	scanf("%d %d", &total, &minus);
	
	if(total < minus) {
		printf("-1");
	} else {
		int total2 = (total + minus) / 2;
		int minus2 = (total - minus) / 2;
		
		if(total2 + minus2 == total && total2 - minus2 == minus) {
			printf("%d %d", total2, minus2);
		} else {
			printf("-1");
		}
	}
	
	return 0;
}
