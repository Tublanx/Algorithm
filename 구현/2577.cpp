#include <stdio.h>

int main(){
    int a, b, c, sum=0;
    int arr[10] = {0, };
    scanf("%d\n%d\n%d", &a,&b,&c);
    sum = a*b*c;

    int num=0;

    while(sum > 0){
        num = sum % 10;
        arr[num]++;
        sum /= 10;
    }

    for(int i=0; i<10; i++){
        printf("%d\n", arr[i]);
    }
}

