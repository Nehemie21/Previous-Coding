//Nehemie Pluviose
//Chapter 4 Question 16
// This program will calculate the times of people running a race

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

	cout << "	What is the name of Runner 1?  "; // user enters name of runner 1
	cin >> Runner1;

	cout << "	What is the name of Runner 2?  "; // user enters name of runner 2
	cin >> Runner2;

	cout << "	What is the name of Runner 3?  "; // user enters name of runner 3
	cin >> Runner3;

	cout << "	What time did " <<  Runner1 << " finish their race? "; // user enters time of runner 1
	cin >> timeOfRunner1;

	cout << "	What time did " << Runner2 << " finish their race? "; // user enters time of runner 2
	cin >> timeOfRunner2;

	cout << "	What time did " << Runner3 << " finish their race? "; // user enters time of runner 3
	cin >> timeOfRunner3;


	// The one who has the least amount of time finishes the race the fastest. This is why there is a less-than sign instead of a greater-than

	if (timeOfRunner1 < 0 || timeOfRunner2 < 0 || timeOfRunner3 < 0) // time must be greater than 0 
	{
		cout << "	One (or more) of your time inputs is invalid!" << endl;
		cout << "	Time must be a positive number." << endl;
		cout << "	Try inputing another value greater than or equal to 0" << endl;
	}


	else 

	{// winner is determined by who has the lowest time
		if (timeOfRunner1 < timeOfRunner2) 
		{
			if (timeOfRunner1 < timeOfRunner3) 
			{
				cout << "	" << Runner1 << "  Wins first place with a time of " << timeOfRunner1 << endl; // runner 1 is winner
				if (timeOfRunner2 < timeOfRunner3)
				{
					cout << "	" << Runner2 << " Wins second place with a time of " << timeOfRunner2 << endl; // runner 2 second place and runner 3 is third
					cout << "	" << Runner3 << " Wins third place with a time of " << timeOfRunner3 << endl;
				}
				if (timeOfRunner3 < timeOfRunner2)
				{
					cout << "	" << Runner3 << " Wins second place with a time of " << timeOfRunner3 << endl; // runner 3 second place and runner 2 is third
					cout << "	" << Runner2 << " Wins third place with a time of " << timeOfRunner2 << endl;
				}
			}
		} 
		
		// winner is determined by who has the lowest time
		if (timeOfRunner2 < timeOfRunner3)
		{
			if (timeOfRunner2 < timeOfRunner1) 
			{
				cout << "	" << Runner2 << " Wins first place with a time of " << timeOfRunner2 << endl; // runner 2 is winner
				if (timeOfRunner1 < timeOfRunner3)
				{
					cout << "	" << Runner1 << " Wins second place with a time of " << timeOfRunner1 << endl; // runner 1 second place and runner 3 is third
					cout << "	" << Runner3 << " Wins third place with a time of " << timeOfRunner3 << endl;
					
				}
				if (timeOfRunner3 < timeOfRunner1)
				{
					cout << "	" << Runner3 << " Wins second place with a time of " << timeOfRunner3 << endl; // runner 3 second place and runner 1 is third
					cout << "	" << Runner1 << " Wins third place with a time of " << timeOfRunner1 << endl;
				}
			}
		}
		
		// winner is determined by who has the lowest time
		if (timeOfRunner3 < timeOfRunner2)
		{
			if (timeOfRunner3 < timeOfRunner1)
			{
				cout << "	" << Runner3 << " Wins first place with a time of " << timeOfRunner3 << endl; // runner 3 is winner
				if (timeOfRunner1 < timeOfRunner2)
				{
					cout << "	" << Runner2 << " Wins second place with a time of " << timeOfRunner2 << endl; // runner 2 second place and runner 1 is third
					cout << "	" << Runner1 << " Wins third place with a time of " << timeOfRunner1 << endl;
				}
				if (timeOfRunner2 < timeOfRunner1)
				{
					cout << "	" << Runner1 << " Wins second place with a time of " << timeOfRunner1 << endl;// runner 1 second place and runner 2 is third
					cout << "	" << Runner2 << " Wins third place with a time of " << timeOfRunner2 << endl;
				}
			}
		}
	}

	cout << endl;




	system("pause");
	return 0;
} 