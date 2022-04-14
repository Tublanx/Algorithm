#include <stdio.h>

int main(){
    int cnt, nums, sum=0;
    scanf("%d\n", &cnt);

    for(int i=0; i<cnt; i++){
        scanf("%1d", &nums);

        sum += nums;
    }

    printf("%d", sum);

    return 0;
}

