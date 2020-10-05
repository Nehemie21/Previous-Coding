//Nehemie Pluviose
//Chapter 3
//This program will demonstrate ...

#include <iostream>
#include <string>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <iomanip>

using namespace std;

int main() {


    string name = "";
    string firstName = "";
    string lastName = " ";



    cout << "What is your firstname: ";
    cin >> firstName;
    //cin.ignore(100, '\n');
    cout << "What is your lastname: ";
    cin >> lastName;


   name = firstName + " " + lastName;
    cout << "Your name is " << name << endl;
    system("pause");





    system("pause");
    return 0;
}
