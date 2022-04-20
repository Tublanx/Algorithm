#include <stdio.h>
#include <stdlib.h>

long long c[30][30];

void combination() // n >= m
{
	for (int i = 1; i < 30; i++) {
		c[i][i] = 1;
		c[i][1] = i;
	}
	for (int i = 2; i < 30; i++) {
		for (int j = 2; j < 30; j++) {
			if (i>j)
				c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
		}
	}
}

int main()
{
	int T, N, M;
	scanf("%d", &T);

	combination();

	for (int i = 0; i < T; i++) {
		scanf("%d%d", &N, &M);
		printf("%lld\n", c[M][N]);
	}

	return 0;
}
