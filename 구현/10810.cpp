#include <iostream>

using namespace std;

int main() {
	int n, m;
	cin >> n >> m;
	
	int bucket[n] = {0, };
	for(int idx=0; idx<m; idx++) {
		int i, j, k;
		cin >> i >> j >> k;
		
		for(int idx2=i; idx2<=j; idx2++) {
			bucket[idx2-1] = k;
		}
	}
	
	for(int i=0; i<n; i++) {
		cout << bucket[i] << " ";
	}
	
	return 0;
}
