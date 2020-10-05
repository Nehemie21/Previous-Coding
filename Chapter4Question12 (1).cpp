//Nehemie Pluviose
//Chapter 4 Question 12
// This program will calculate software sales

#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {

	const float initialRetailPrice = 99; //The initial retail price of $99
	float quantityDiscount1 = 0.0; // The discount given for the purchase of the quantity items from 10 - 19 which is 20%
	float quantityDiscount2 = 0.0; // The discount given for the purchase of the quantity items from 20 - 49 which is 30%
	float quantityDiscount3 = 0.0; // The discount given for the purchase of the quantity items from 50 - 99 which is 40%
	float quantityDiscount4 = 0.0; // The discount given for the purchase of the quantity items from 100 or more which is 50%
	float quantityNoDiscount = 0.0; // There is no discount given for items purchased at the quantities of 1 - 9

	float unitsCustomerPurchases = 0.0; // The amount of items the customer decides to purchase
	float priceAfterDiscount = 0.0; // The price after discount is added
	float priceNoDiscount = 0.0; // Price with no disocunt

	initialRetailPrice = 99; // $99 is the initial retail price
	quantityDiscount1 = .80; // 20% discount off of a 100% total is 80%
	quantityDiscount2 = .70; // 30% discount off of a 100% total is 70%
	quantityDiscount3 = .60; // 40% discount off of a 100% total is 40%
	quantityDiscount4 = .50; // 50% discount off of a 100% total is 50%



	cout << "How many unit(s) are you purchasing today?  ";
	cin >> unitsCustomerPurchases;
	


	if (unitsCustomerPurchases >= 1)
		priceNoDiscount = (unitsCustomerPurchases * initialRetailPrice);
	cout << "This is the cost of your purchase:  $" << priceNoDiscount << endl; //Because there is no discount for units under 10, it is not being multiplied by any other variable discount amount


	else if (unitsCustomerPurchases >= 10)
		priceAfterDiscount = ((unitsCustomerPurchases * initialRetailPrice) * quantityDiscount1);

	cout << "This is the cost of your purchase:   $" << priceAfterDiscount << endl;


	else if (unitsCustomerPurchases >= 20)
		priceAfterDiscount = ((unitsCustomerPurchases * initialRetailPrice) * quantityDiscount2);
	cout << "This is the cost of your purchase:   $" << priceAfterDiscount << endl;


	else if (unitsCustomerPurchases >= 50)
		priceAfterDiscount = ((unitsCustomerPurchases * initialRetailPrice) * quantityDiscount3);
	cout << "This is the cost of your purchase:   $" << priceAfterDiscount << endl;


	else if (unitsCustomerPurchases >= 100)
		priceAfterDiscount = ((unitsCustomerPurchases * initialRetailPrice) * quantityDiscount4);
		cout << "This is the cost of your purchase:   $" << priceAfterDiscount << endl;
	
	
	else
		cout << "Invalid Purchase! \n" << "You must purchase units with a quantity greater than 0." << endl;




	system("pause");
		return 0;
}