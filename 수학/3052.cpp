#include <stdio.h>

int main(){
    int cnt=0, i, j;
    int a[100];
    int remainder[1000];

    for(i=0; i<10; i++){
        scanf("%d", &a[i]);
        remainder[i] = a[i] % 42;
        for(j=0; j<i; j++){
            if(remainder[i] == remainder[j]) break;
        }

        if(i == j) cnt++;
    }

    printf("%d", cnt);

    return 0;
}

