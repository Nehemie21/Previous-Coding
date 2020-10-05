// This program will calculate tardies

#include <iostream>
#include <iomanip>
#include <string>
using namespace std;


int main() {

    const int START_TIME = 6.00;
    float timeArrive = 0.0;
    bool late = false;
    string dayOfWeek = "";

    if (dayOfWeek == "Monday")
    cout << " Today is Monday";
    else if (dayOfWeek == "Tuesday")
    cout << "Today is Tuesday";
    else if (dayOfWeek == "Wednesday")
    cout << "Today is Wednesday";
    else
    cout << "\nIt is no class today. Wahooo!";




    cout << "\nEnter time arrived: ";
    cin >> timeArrive;


    if(timeArrive > START_TIME)
        late = true;

    if (late)
    {
    cout << "\nHey dude you are late!\n";
    }
    else {

    cout << "\nThanks for coming on time.";
    }


    system("pause");
    return 0;
}
