#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
	return *(int *)a - *(int *)b;
}

int main(){
	int n, i;
	scanf("%d\n", &n);
	int nums[n];
	
	for(i=0; i<n; i++){
		scanf("%d", &nums[i]);
	}
	
	qsort(nums, n, sizeof(int), compare);
	
	for(i=0; i<n; i++){
		printf("%d\n", nums[i]);
	}
}
