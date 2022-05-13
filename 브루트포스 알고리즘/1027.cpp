#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
	
	int N;
	vector<int> buildings;
	
	cin >> N;
	for (int i=0; i<N; i++) {
		int height;
		cin >> height;
		
		buildings.push_back(height);
	}
	
	vector<int> count(N);
	
	for (int i=0; i<N; i++) {
		double max = -1000000000;
		
		for (int j=i+1; j<N; j++) {
			int height = buildings[j] - buildings[i];
			int width = j-i;
			
			double g = height * 1.0 / width;
			
			if(g <= max) {
				continue;
			}
			
			max = g;			
			count[i]++;
			count[j]++;
		}
	}
	
	cout << *max_element(count.begin(), count.end());
	
	
}
