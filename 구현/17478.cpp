#include <iostream>
#include <string> 

using namespace std;

string line = "";

void func(int N);

int main() {
	// input
	int N;
	cin >> N;
	
	// output
	cout << "��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n";
	func(N);
}

void func(int N) {
	ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
	
	string underbar = line;
	
	if(N == 0) {
		cout << underbar << "\"����Լ��� ������?\"\n";
		cout << underbar << "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n";
		cout << underbar << "��� �亯�Ͽ���.\n";
		return;
	}
	
	cout << underbar << "\"����Լ��� ������?\"\n";
	cout << underbar << "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n";
	cout << underbar << "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n";
	cout << underbar << "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n";
	
	line += "____";
	
	func(N - 1);
	cout << underbar << "��� �亯�Ͽ���.\n";
	
}
