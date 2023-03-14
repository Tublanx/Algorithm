#include<stdio.h>

int main() {
	int t;
	int cnt[27] = {0};
	int cnt2 = 0;
	char name[30];
	
	scanf("%d", &t);
	for(int i=0; i<t; i++) {
		scanf("%s", name);
		cnt[name[0] - 'a']++;
	}
	for(int i=0; i<26; i++) {
		if(cnt[i] >= 5) {
			printf("%c", i + 'a');
			cnt2++;
		}
	}
	
	if(cnt2 == 0) {
		printf("PREDAJA");
	}
	
	return 0;
}

