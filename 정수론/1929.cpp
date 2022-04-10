#include <stdio.h>
#include <math.h>


int main(){
    int m, n;
    int cnt = 0;
    scanf("%d %d", &m, &n);

    int max = 0;
    for(int i=m; i<=n; i++){
        cnt = 0;
        max = sqrt(i);

        if(max == 1 && i != 1) printf("%d\n", i);
        else {
            for(int j=2; j<=max; j++){
                if(i % j == 0) break;
                if(j == max) printf("%d\n", i);
            }
        }
    }

    return 0;
}

