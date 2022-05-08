#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

string WB[8] = {
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW"
};
string BW[8] = {
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB",
    "BWBWBWBW",
    "WBWBWBWB"
};

string board[50]; 

int whiteCount(int n, int m) {
	int cnt = 0;
	
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if (board[n + i][m + j] != WB[i][j]) {
				cnt++;
			}
		}
	}
	
	return cnt;
}

int blackCount(int n, int m) {
	int cnt = 0;
	
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if (board[n + i][m + j] != BW[i][j]) {
				cnt++;
			}
		}
	}
	
	return cnt;
}

int main() {
	// input
	int minVal = 12345;
	pair<int, int> p;
	
	cin >> p.first >> p.second;
	
	for (int i = 0; i < p.first; i++) {
		cin >> board[i];
	}
	
	for (int i = 0; i + 8 <= p.first; i++) {
		for (int j = 0; j + 8 <= p.second; j++) {
			int tmp;
			
			tmp = min(whiteCount(i, j), blackCount(i, j));
			if (tmp < minVal) {
				minVal = tmp;
			}
		}
	}
	
	// output
	cout << minVal;
	
	return 0;
}

