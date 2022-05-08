#include <iostream>

using namespace std;

int main() {
	// input
	int N;
	cin >> N;
	
	int result = 666, temp;
	int cnt = 0;
	
	while (true) {
		
		temp = result;
		
		do {
			if (temp % 1000 == 666) {
				cnt++;
				break;
			}
			
			temp /= 10;
		} while (temp > 0);
		
		if (cnt == N) {
			cout << result;
			break;
		}
		
		result++;
		
	}
	
	return 0;
}
