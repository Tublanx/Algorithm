#include <stdio.h>

int main(){
    int a, b, v, time=0;
    scanf("%d %d %d", &a, &b, &v);

    time = (v - b - 1) / (a - b) + 1;
    printf("%d", time);
}

