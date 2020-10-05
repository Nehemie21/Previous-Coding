#include <iostream>
#include <string>
#include <iomanip>
#include <cctype>
using namespace std;

int main() {

	char choice = ' ';
	bool needInput = true;

	do {

		cout << "Enter a number from 1-4 or X to exit ";
		cin >> choice;
		choice = toupper(choice);


		needInput = false;
		
		switch (choice) {
		case '1': // single quotes because it is a character (char)
			break;
		
		case '2':
			break;
		
		case '3':
			break;
		
		case '4':
			break;
		
		case 'X':
			break;
		
		default:
		+	cout << "You must enter a valid choice \n";
			cout << "Please re-enter \n";
			needInput = true;

		}



	} while (needInput);






	return 0;
}