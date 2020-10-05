//Nehemie Pluviose
//Chapter 4 Question 23
// This program will run a geometry calculator
#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {

	int userChoice = 0; // The choice from 1 to 4 the user chooses

	cout << "	Choose an option from 1 to 4:  \n";
	cout << "	1. Calculate the Area of a Circle \n";
	cout << "	2. Calculate the Area of a Rectangle \n";
	cout << "	3. Calculate the Area of a Triangle \n";
	cout << "	4. Quit" << endl;
	cin >> userChoice;
	cout << endl;
	
	float base = 0.0; // How big the base is for triangle in choice 3
	float height = 0.0; // How tall the triangle is for choice 3
	float half = .5; // The .5 (or half) that triangles are divided by to figure out the area
	float areaOfTriangle = 0.0; // Area of triangle equals base times height times half

	float areaOfCircle = 0.0; // Area of circle is pow(PI * radius, 2)'
	float pi = 3.14159; // The value of the variable pi used for the area of a circle
	float radius = 0.0; // Radius of circle for choice 1

	float length = 0.0; // Length of rectangle for choice 2
	float width = 0.0; // Width of rectangle for choice 2
	float areaOfRectangle = 0.0; // Area of Rectangle equals length times width


	switch (userChoice) // based on what the user enters, it will go to case 1, case 2, case 3 , or case 4
	{
		
	case 1: // used for the Area of circle

		cout << "Congrats! We will calulate the Area of a Circle!" << endl; 
		cout << "What radius do you want your circle to have? ";
		cin >> radius;


		if (radius < 0) // radius cannot be a negative number
		{
			cout << "Radius must be a positive number"
				<< "Enter a positive value on the next rerun";

		}
		else // if positive number is entered, then the program will continue to run the formula
		{
			areaOfCircle = (pi * pow(radius, 2));
			cout << "The area of your circle is: " << areaOfCircle << endl;
		}
		break;

	case 2: // used for Area of a Rectangle
	

		cout << "Congrats! We will calculate the Area of a Rectangle!" << endl;
		cout << "What length do you want your rectangle to have? ";
		cin >> length;


		if (length > 0) // must be greater than 0 
		{
			cout << "\n What width do you want your rectangle to have? ";
			cin >> width;


			if (width > 0) { // must be greater than 0

				areaOfRectangle = (length * width);
				cout << "The area of your rectangle is: " << areaOfRectangle << endl;
			}
			else { // used to inform user that width must be greater than 0
				cout << "Width must be greater than 0. Enter a different value next time."
					<< endl;

			}

		}
		else // used to inform user that length must greater than 0
		{
			cout << "Length must be greater that 0. Enter a different value next time." << endl;

		}
		break;

	case 3: // used to Calculate the Area of a Triangle


		cout << "Congrats! We will calculate the Area of a Triangle!" << endl;
		cout << "What base do you want your triangle to have? ";
		cin >> base;


		if (base > 0) // must be greater than 0
		{
			cout << "What height do you want your triangle to have? ";
			cin >> height;

			if (height > 0) // must be greater than 0
			{
				areaOfTriangle = (base * height * half);
				cout << "The area of you triangle is: " << areaOfTriangle << endl;

			}
			else // used to inform user than height must be greater than 0
			{
				cout << "Height must be greater than 0. Enter a different value. " << endl;
			}

		}
		else // used to inform user that base must be greater than 0
		{
			cout << " Base must be greater than 0. Enter a different value." << endl;
		}
		break;

	case 4: // user chose to qut the program 
		cout << "Congrats! You have choosen to quit the program! \n"
			<< "Press ENTER twice to exit the screen";
		break;

	default: // used just in case user does not enter number between 1 to 4
		cout << "Choose a number between 1 and 4. Any other number is invalid." << endl;
		break;
	}

	cout << endl;





	system("pause");
	return 0;
}