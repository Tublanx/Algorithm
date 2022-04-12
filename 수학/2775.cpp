#include <stdio.h>

int getRoom(int k, int n){
    if(k == 0) return n;
    if(n == 1) return 1;
    return (getRoom(k-1, n) + getRoom(k, n-1));
}

int main(){
    int t, k, n;

    scanf("%d\n", &t);
    for(int i=0; i<t; i++){
        scanf("%d %d", &k, &n);
        printf("%d\n", getRoom(k, n));
    }
}

