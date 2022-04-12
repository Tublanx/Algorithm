#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
	return *(int *)a - *(int *)b;
}

int main() {
	int n, k;
	scanf("%d %d\n", &n, &k);
	
	int nums[n];
	
	for(int i=0; i<n; i++){
		scanf("%d", &nums[i]);
	}
	
	qsort(nums, n, sizeof(int), compare);
	
	for(int i=0; i<n; i++){
		if(i == k-1) printf("%d", nums[i]);
	}
}
