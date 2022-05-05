#include <stdio.h>

int main() {
	// input
	int A, B, C, D;	
	scanf("%d %d %d\n %d", &A, &B, &C, &D);
	
	C += D;
	
	while (C >= 60) {
		B++;
		C -= 60;
	}
	
	while (B >= 60) {
		A++;
		B -= 60;
	}
	
	while (A >= 24) {
		A -= 24;
	}
	
	// output
	printf("%d %d %d", A, B, C);
}
