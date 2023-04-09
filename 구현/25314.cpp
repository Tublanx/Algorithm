#include <iostream>
#include <string>

using namespace std;

int main() {
	int n;
	cin >> n;
	
	string result;
	for(int i=0; i<n/4; i++) {
		result += "long ";
	}
	cout << result + "int";
	
	return 0;
}
