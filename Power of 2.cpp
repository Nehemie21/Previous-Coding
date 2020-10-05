//Nehemie Pluviose
//In class work 06/11/2019
//This program will get input of numbers and display the power of 2

#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>
#include <cctype>
using namespace std;

int main() {

    int numTimes = 0; //number of times top get power
    int power = 0;
    int numPower = 0;
    bool needData = true;
    const int MIN_TIMES = 1;
    const int MAX_TIMES = 10;
    char answer = ' ';

    cout << "Do you want to play powers of 2. Enter Y or N: ";
    cin >> answer;
    answer = toupper(answer);
    cout << answer << endl;

    while ((answer != 'Y') && (answer != 'N')) {
    cout << "Invalid answer\n";
    cout << "Re-enter";
    answer = toupper(answer);

    }


    cout << "How many times would you like to do it? \n";
    cout << "Enter a number from 1 to 10:  ";

    cin >> numTimes;

    needData = (numTimes < MIN_TIMES || numTimes > MAX_TIMES);

    while (needData) {

    cout << " You have entered an invalid number of " << numTimes << endl;
    cout << "Enter a new value from 1 to 10" << endl;
    cin >> numTimes;
    needData = (numTimes < MIN_TIMES || numTimes > MAX_TIMES);
    } ;


    cout << "What power should we use? ";
    cin >> numPower;

    for (int num = 1; num <= numTimes; num++) {

    power = pow(num, numPower);
    cout << num << "\t\t" << power << endl;

    }


    cout << "Press any key to exit this wonderful program";
    system("pause>nul");
    return 0;
}
