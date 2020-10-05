//Question 2


#include <iostream>
#include <string>
#include <iomanip>


using namespace std;

int main() {

    float payAmount = 2200.0; // Amount paid per period
    float payPeriod = 26;       // number of periods
    float annualPay = 0.0;

    cout << "How much do you get paid per period? ";
    cin >> payAmount;

    cout << "How many pay periods do you have annually? ";
    cin >> payPeriod;


    cout << "This is your annual pay: ";
    annualPay = (payAmount * payPeriod);

    cout << annualPay << endl;








    system("pause");
    return 0;
}
