//Nehemie Pluviose
//Chapter3 Question2
// This progrm will ask how many tickets for each class of seats were sold

#include <iostream>
#include <string>
#include <iomanip>


using namespace std;

int main() {

    const int CLASSA = 15;
    const int CLASSB = 12;
    const int CLASSC = 9;


    float ticketsClassA = 0.0;
    float ticketsClassB = 0.0;
    float ticketsClassC = 0.0;


    float profitOfClassA = 0.0;
    float profitOfClassB = 0.0;
    float profitOfClassC = 0.0;


    float totalIncome = 0.0;


    cout << "What are the number of tickets sold for Class A?";
    cin >> ticketsClassA;

    profitOfClassA = (ticketsClassA * CLASSA);


    cout << "What are the number of tickets sold for Class B?";
    cin >> ticketsClassB;

    profitOfClassB = (ticketsClassB * CLASSB);

    cout << "What are the number of tickets sold for Class C?";
    cin >> ticketsClassC;

    profitOfClassC = (ticketsClassC * CLASSC);


    totalIncome = (profitOfClassA + profitOfClassB + profitOfClassC);

    cout << "The amount of income from class A is " << profitOfClassA << endl;
    cout << "The amount of income from class B is " << profitOfClassB << endl;
    cout << "The amount of income from class C is " << profitOfClassC << endl;
    cout << "The total income from all classes are  " << fixed<< setprecision(2) << totalIncome << endl;




    system("pause");
    return 0;

}
