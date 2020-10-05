//Chapter 4 Question 4
// Nehemie Pluviose
// This program will calculate the area of rectangle


#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {


	float rectangleWidth1 = 0.0; // Variable for Width of Rectangle 1
	float rectangleWidth2 = 0.0; // Variable for Width of Rectangle 2
	float rectangleLength1 = 0.0; // Variable for Length of Rectangle 1
	float rectangleLength2 = 0.0; // Variable for Length of Rectangle 2
	float areaOfRectangle1 = 0.0; // Variable for Area of Rectangle 1
	float areaOfRectangle2 = 0.0; // Variable for Area of Rectangle 2

	cout << " What is your width for rectangle 1?  "; // User enter desired width for Rectangle 1
	cin >> rectangleWidth1;

	cout << " What is your length for rectangle 1?  "; // User enter desired length for Rectangle 1
	cin >> rectangleLength1;

	cout << "What is your width for rectangle 2?  "; // User enter desired width for Rectangle 2
	cin >> rectangleWidth2;

	cout << "What is your length for rectangle 2?  ";// User enter desired length for Rectangle 2
	cin >> rectangleLength2;

	areaOfRectangle1 = (rectangleWidth1 * rectangleLength1); // area for rectangle 1

	areaOfRectangle2 = (rectangleWidth2 * rectangleLength2); // area for rectangle 2


	if (areaOfRectangle1 == areaOfRectangle2) // Both are equivalent
		cout << "The areas of Rectangle 1 and Rectangle 2 are equivalent.   ";


	else if (areaOfRectangle1 > areaOfRectangle1) // Rectangle 2 is less than Rectangle 1 // Recangle 1 is greater than Rectangle 2
		cout << "The area of Rectangle 1 is greater than area of Rectangle 2. \n The area of Rectangle 2 is less than the area of Rectangle 1.   ";
	

	else (areaOfRectangle1 < areaOfRectangle2) // Rectangle 1 is less than Rectangle 2 // Recangle 2 is greater than Rectangle 1
		cout << "The area of Rectangle 1 is less than the area of Rectangle 2. \n The area of Rectangle 2 is greater than area of Rectangle 1.   ";
	
	


	system("pause");
	return 0;
}