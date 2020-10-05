//Nehemie Pluviose
//Chapter 4 Question 16
// This program will calculate the times of people running a rac

#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {

	string Runner1 = " "; //The name of runner 1
	string Runner2 = " "; //The name of runner 2
	string Runner3 = " "; //The name of runner 3

	float timeOfRunner1 = 0.0; // The time it took for Runner 1 to finish race
	float timeOfRunner2 = 0.0; // The time it took for Runner 2 to finish race
	float timeOfRunner3 = 0.0; // The time it took for Runner 3 to finish race

	cout << " What is the name of Runner 1?  ";
	cin >> Runner1;

	cout << "What is the name of Runner 2?  ";
	cin >> Runner2;

	cout << "What is the name of Runner 3?  ";
	cin >> Runner3;

	cout << " What time did " <<  Runner1 << " finish their race? ";
	cin >> timeOfRunner1;

	cout << "What time did " << Runner2 << " finish their race? ";
	cin >> timeOfRunner2;

	cout << "What time did " << Runner3 << " finish their race? ";
	cin >> timeOfRunner3;



	// The one who has the least amount of time finishes the race the fastest. This is why there is a less-than sign instead of a greater-than
	
	 if (timeOfRunner1 < timeOfRunner2 < timeOfRunner3)
		cout << Runner1 << " has first place \n" << Runner2 << " has second place \n" << Runner3 << " has third place" << endl;
	else if (timeOfRunner2 < timeOfRunner3 and timeOfRunner3 < timeOfRunner1)
		cout << Runner2 << " has first place \n" << Runner3 << " has second place \n" << Runner1 << " has third place" << endl;
	else if (timeOfRunner3 < timeOfRunner1 and timeOfRunner1 < timeOfRunner2)
		cout << Runner3 << " has first place \n" << Runner1 << " has second place \n" << Runner2 << " has third place" << endl;
	else if (timeOfRunner3 < timeOfRunner2 and timeOfRunner2 < timeOfRunner1)
		cout << Runner3 << " has first place \n" << Runner2 << " has second place \n" << Runner1 << " has third place" << endl;
	else if (timeOfRunner2 < timeOfRunner1 and timeOfRunner1 < timeOfRunner3)
		cout << Runner2 << " has first place \n" << Runner1 << " has second place \n" << Runner3 << " has third place" << endl;
	else if (timeOfRunner1 < timeOfRunner3 and timeOfRunner3 < timeOfRunner2)
		cout << Runner1 << " has first place \n" << Runner3 << " has second place \n" << Runner2 << " has third place" << endl;
	else if (timeOfRunner1 <= 0 or timeOfRunner2 <= 0 or timeOfRunner3 <= 0)
		cout << "One (or more) of your time inputs is invalid! Time must be a positive number greater than 0." << endl;

	system("pause");
	return 0;
}