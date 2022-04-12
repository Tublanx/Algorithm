#include <stdio.h>

int main(){
    int cnt, a, b;
    scanf("%d\n", &cnt);

    for(int i=0; i<cnt; i++){
        scanf("%d %d\n", &a, &b);
        printf("%d\n", a+b);
    }
}

