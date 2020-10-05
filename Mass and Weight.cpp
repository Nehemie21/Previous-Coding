//Chapter 4 Question 6
// Nehemie Pluviose
// This program will calculate mass and weight


#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {


    float pullOfGraity = 0.0; // Variable for the 9.8 decimal symbolzing the force of gravity on Earth. Used in calculuation for Mass and Weight
    float objectsMass = 0.0; // Variable for the mass of an object
    float objectsWeight = 0.0; // Variable for weight of an object
    float maxCapacityForNewton = 0.0; // Variable for the max limit of which the amount of weight an object can have
    float minCapacityForNewton = 0.0; // Variable for the min limit of which the amount of weight an object can have


    pullOfGraity = 9.8;
    maxCapacityForNewton = 1000;
    minCapacityForNewton = 10;

    cout << " What is the mass of your object?  ";
    cin >> objectsMass;

    objectsWeight = (objectsMass * pullOfGraity);

    cout << "Your objects weight is:  ";
    cout << objectsWeight << endl;

    if (objectsWeight > maxCapacityForNewton)
    cout << "Your object is too heavy ";
    else if (objectsWeight < minCapacityForNewton)
    cout << "Your object is too light ";
    else if (objectsWeight <= maxCapacityForNewton)
    cout << "Your objects weight is within the acceptable range. ";
    else if (objectsWeight >= minCapacityForNewton)
    cout << "Your objects weight is within the acceptable range. ";






    system("pause");
    return 0;
}
