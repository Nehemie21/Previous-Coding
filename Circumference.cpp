// This will calculate the area and circumference
// Nehemie Pluviose

#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

int main() {



float diameter = 0.0;
float area = 0.0;
float circumference = 0.0;
float radius = 0.0;
const float PI = 3.14;


cout << "What is the diameter? ";
cin >> diameter;

circumference = (diameter * PI);
radius = (diameter / 2);
area = (PI * (radius * radius));


cout << "The circumference is " << circumference << endl;
cout << "The area is " << area << endl;



system("pause");
return 0;
}
