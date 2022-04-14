#include <stdio.h>
#include <stdlib.h>

typedef struct x_y
{
    int x;
    int y;
} coordinates, *coordinatesList;

int compare( const void *a, const void *b )
{
    const coordinatesList a1 = *( const coordinatesList * )a;
    const coordinatesList b1 = *( const coordinatesList * )b;
    
    if(a1->y != b1->y){
    	return a1->y - b1->y;
	} else {
		return a1->x - b1->x;
	}
}

int main(void) 
{
    unsigned int i, N;
    
    scanf("%d\n", &N);

    coordinatesList *A = malloc( N * sizeof( coordinatesList ) );

    for ( i = 0; i < N; i++ )
    {
        A[i] = malloc( sizeof( coordinates ) );
    }
    
    for ( i = 0; i < N; i++ )
    {
    	scanf("%d %d", &A[i]->x, &A[i]->y);
    }

    qsort( A, N, sizeof( coordinatesList ), compare );

    for ( i = 0; i < N; i++ )
    {
        printf( "%d %d\n", A[i]->x, A[i]->y );
    }
    
    free(A);

    return 0;
}
