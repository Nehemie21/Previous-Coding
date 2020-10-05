//Nehemie Pluviose
//Chapter 5 Question 12
// This program will create a Celsius and Fahrenheit table


#include <iostream>
#include <cmath>
#include <string>
#include <iomanip>

using namespace std;

int  main() {



    float fahrenheit = 0; // fahrenheit formula is = (((9/5) celsuis) +32
    const int MIN_TEMP = 0; // This is the minimum temperature for the celsius
    const int MAX_TEMP = 20; // This is the maximum temperature for the celsius



    cout << fixed << setprecision(2);
    cout << fixed << setw(2);

    for (float celsius = 0; celsius <= MAX_TEMP; celsius++) {

    fahrenheit = (((9 / 5) * celsius) + 32);

    cout << "Celsius:   " << celsius << "    " << "Fahrenheit:   " << fahrenheit << endl;




    }


    system("pause");

    return 0;
}
