#include <iostream>

using namespace std;

int main() {
	int number = 10;
	int * pNumber;
	
	* pNumber = 15;
	
	cout << number << endl;
	cout << * pNumber << endl;	
}