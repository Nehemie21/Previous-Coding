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

    cout << "\nWhat is your width for rectangle 1?";
    cin >> rectangleWidth1;

    cout << "\nWhat is your length for rectangle 1?";
    cin >> rectangleLength1;

    cout << "\nWhat is your width for rectangle 2?";
    cin >> rectangleWidth2;

    cout << "\nWhat is your length for rectangle 2? ";
    cin >> rectangleLength2;

    areaOfRectangle1 = (rectangleWidth1 * rectangleLength1);

    areaOfRectangle2 = (rectangleWidth2 * rectangleLength2);



    if (areaOfRectangle1 > areaOfRectangle2)
        cout << "The area of Rectangle 1 is greater than area of Rectangle 2\n";
    else if (areaOfRectangle1 < areaOfRectangle2)
        cout << "The area of Rectangle 1 is less than the area of Rectangle 2\n";
    else if (areaOfRectangle1 == areaOfRectangle2)
        cout << "The areas of Rectangle 1 and Rectangle 2 are equivalent.\n";



    system("pause");
    return 0;
}
