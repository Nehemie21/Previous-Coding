//Chapter 3 Question 14
//Nehemie Pluviose
//This program will calculate the Monthly Sales Tax Report

#include <iostream>
#include <iomanip>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <string>
using namespace std;

int main() {

	float year = 0; // User inputs the value of year
	float sales = 0; //user enter value of sales
	float  totalCollected = 0; //user
	float totalSalesTax = 0;
	float countySalesTax = 0;
	float stateSalesTax = 0;


	cout << "Month: " ;
	cin >> month;

	cout << "Year: ";
	cin >> year;

	cout << fixed << setprecision(2);

	cout << "Sales:      $ ";
	cin >> sales;

	
	countySalesTax = (0.04 * sales);
	cout << "County sales tax:    $  " << countySalesTax << endl; //County sales tax from sales

	
	stateSalesTax = (0.02 * sales);
	cout << "State sales tax:     $ " << stateSalesTax << endl; //State sales tax from sales

	
	totalSalesTax = (countySalesTax + stateSalesTax);
	cout << "Total sales tax:      $ " << totalSalesTax << endl;

	
	totalCollected = (sales + totalSalesTax);
	cout << "Total Collected:      $ " << totalCollected << endl ;



	system("pause");
	return 0;
}