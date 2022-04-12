#include <stdio.h>

int main(void)
{
    int num, max = 0, cnt=0;
    for (int i = 1; i <= 9; i++){
        scanf("%d", &num);
        if (num > max){
            max = num;
            cnt=i;
        }
    }
    printf("%d %d", max, cnt);

    return 0;
}

