#include <stdio.h>

int main() {
	int t;
	scanf("%d\n", &t);
	
	int num1, num2;
	
	for(int i=0; i<t; i++){
		scanf("%d,%d", &num1, &num2);
		printf("%d\n", num1 + num2);
	}	
}
