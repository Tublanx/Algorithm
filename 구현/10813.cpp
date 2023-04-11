#include <iostream>

using namespace std;

int main() {
	int n, m;
	cin >> n >> m;
	
	int bucket[n];
	for(int i=0; i<n; i++) {
		bucket[i] = (i+1);
	}
	
	for(int idx=0; idx<m; idx++) {
		int i, j;
		cin >> i >> j;
		
		int temp = bucket[j-1];
		bucket[j-1] = bucket[i-1];
		bucket[i-1] = temp;
	}
	
	for(int i=0; i<n; i++) {
		cout << bucket[i] << " ";
	}
	
	return 0;
}
