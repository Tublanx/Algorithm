#include <stdio.h>

int main() {
	// input
	int L, A, B, C, D;
	scanf("%d %d %d %d %d", &L, &A, &B, &C, &D);

	int temp1 = 0, temp2 = 0;
	
	if (A % C == 0) {
		temp1 = (A / C);
	} else {
		temp1 = (A / C) + 1;
	}
	
	if (B % D == 0) {
		temp2 = (B / D);
	} else {
		temp2 = (B / D) + 1;
	}
	
	// output
	if (temp1 > temp2) {
		printf("%d", L - temp1);
	} else {
		printf("%d", L - temp2);
	}
}
