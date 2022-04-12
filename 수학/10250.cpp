#include <stdio.h>

int main(){
    int t;
    int h, w, n;
    int room = 0;
    int num = 0;

    scanf("%d\n", &t);
    for(int i=0; i<t; i++){
        scanf("%d %d %d", &h, &w, &n);

        room = n % h;
        if(room == 0){
            printf("%d\n", (h * 100) + (n / h));
        } else {
            printf("%d\n", ((room)*100)+(n / h) +1);
        }
    }
}

