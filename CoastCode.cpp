#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

int main() {


	const float SALES_PERCENT = .58;
	float totalSales = 0.0;         //Sales for the entire company
	float eastCoastSales = 0.0;     // Sales for the East Coast
	float restOfCompany = 0.0;      // Sales for non-East Coast


	cout << "What is total company sales?";
	cin >> totalSales;

	eastCoastSales = (totalSales * SALES_PERCENT);
	restOfCompany = (totalSales - eastCoastSales);


	cout << "East Coast Sales are: " << eastCoastSales << endl;
	cout << "Rest of company are: " << restOfCompany << endl;



	system("pause");
	return 0;
}
