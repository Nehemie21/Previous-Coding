	//Write a program that will 
	//calculate the payroll for 3 employees. 
	// display the annual salary 
	//display the Company's Overall Payroll

	// It will also total payroll for the
	//company. The first element is the totals and the second is the averages

	// Nehemie Pluviose
	// C++ Final Project


#include <iostream>
#include <string>
#include <cctype>
#include <iomanip>

using namespace std;



struct Employee {
	/* Used to get the firstname, the lastname, and the Employee Number
	Of the Employee*/
	string firstname; // Employee first name
	string lastname; // Employee last name
	int empNum; // Employee Number
};

struct Payroll {

	int empNumber;
	double totHours;
	/* Total hours the Employee worked*/

	double regHours;
	/* The regular number of hours an Employee is supposed to work */

	double otHours;
	/* The number of Overtime hours an Employee did
	This is totHours - regHours = otHours*/

	double regRate;
	/* The rate at which an Employee gets paid for regular hours */

	double otRate;
	/* The rate paid for overtime hours*/

	double regPay;
	/* The pay for the regular amount of hours */

	double otPay;
	/* The Overtime pay */

	double totalPay;
	/* Total amount paid with regular hours and with overtime hours*/

	double fica;
	/* FICA */

	double socSec;

	double totDeductions;

	double netPay;
	/* The net pay*/

};

struct AnnualPayroll {


	double totRoughWeekPay;
	/* This is the amount yearly (without deductions)
	This is essentially just totalPay
	totRoughWeekPay = totalPay */


	double totWeekPay;
	/* The amount of money made in one week
	Net pay ( amount paid with deductions)
	totWeekPay = netPay */

	int numOfWeeksWorked;
	/*The number of weeks the employee worked
	The user will input this in through cin */

	double totRoughAnnualSalary;
	/* The annual salary of the worker with no deductions
	totRoughWeekPay multiplied by the numOfWeeksWorked
	*/

	double totAnnualSalary;
	/* The annual Salary of the employee
	totWeekPay multiplied by numOfWeeksWorked*/


	




	

};

struct PayrollTotals {

	double totHours;
	/* Total hours the Employee worked*/

	double regHours;
	/* The regular number of hours an Employee is supposed to work */

	double otHours;
	/* The number of Overtime hours an Employee did
	This is totHours - regHours = otHours*/

	double regRate;
	/* The rate at which an Employee gets paid for regular hours */

	double otRate;
	/* The rate paid for overtime hours*/

	double regPay;
	/* The pay for the regular amount of hours */

	double otPay;
	/* The Overtime pay */

	double totalPay;
	/* Total amount paid with regular hours and with overtime hours*/

	double fica;

	double socSec;

	double totDeductions;

	double netPay;

	AnnualPayroll annPayroll; 

	/* Variable so the the AnnualPayroll Structure can be nested in PayrollTotals Structure*/

};



/* The four double below is used to get the Company's total Payroll 
This is a global variable tough it can be used as a local variable
I will put this in the function getCompanyPayroll for extra caution just in case */

	double compAnnualPayrollWithDeduct;
	/* The company Payroll will be the sum of all
	the employees anuual salary with deductions*/

	double compWeekPayrollWithDeduct;
	/* The company Payroll will be the sum of all
	the employees weekly salary with deductions*/

	double compAnnualPayrollNoDeduct;
	/* The company Payroll will be the sum of all
	the employees anuual salary no deductions*/

	double compWeekPayrollNoDeduct;
	/* The company Payroll will be the sum of all
	the employees weekly salary no deductions*/

	






const int MAX_EMPLOYEES = 3;
const int MAX_NUMBERS = 10;
const int MAX_REG_HOURS = 40;
const double FICA_PCT = .20;
const double SS_MED_PCT = .0765;
const double OT_MULT = 1.5;
const int MAX_TOTALS = 2;


void displayMenu();
/*displays the follows
• Press 1 to input employees
• Press 2 to input hours
• Press 3 to calculate payroll
• Press 4 to calculate totals
• Press 5 to print payroll
• Press X to exit */

char getSelection();
/*– gets menu selection and validates input with a switch statement. Use a do while until get
valid input. If not valid does the following */

void getEmployeeNames(Employee[]);
/* Used to get the names of the Employees*/

void displayEmployeeNames(Employee[]);
/* Used to display the names of the Employees*/

void inputHours(Employee[], Payroll[]);
/* Used to input the hours of the Employees*/

void calcPayroll(Employee[], Payroll[]);
/*• Calculated fields
o otHours – calculated as hours over the maxreghours. If regHours = 48 then OT hours would be 8
o regPay (regHours * regRate)
o otPay (otHours * otPay)
o totalPay (regPay + otPay)
o fica (total pay * fica pct)
o socSec (total pay * ss med pct)
o totDeductions
o netPay*/


void getEmpName(Employee);
/* Gets the Employee name*/

void getAnnualSalary(Employee[], Payroll[], AnnualPayroll[]);
/* Function used to get the annual salary of an employee*/

void printFinalPayroll(Employee[], Payroll[], AnnualPayroll[]);
/* Used to print the final payroll of each Employee 
for Both weekly salary and annual salary*/

void getCompanyPayroll(Employee emp[], Payroll pay[], AnnualPayroll ann[]);
/* Gets the Company total Payroll for all Employees*/

enum PayEnum { TOTALS, AVERAGES }; // TOTALS = 0, AVERAGES = 1

int main() {

	Employee employees[MAX_EMPLOYEES]; // Used for the max number of Employees
	Payroll pay[MAX_EMPLOYEES]; // 
	AnnualPayroll ann[MAX_EMPLOYEES];
	PayrollTotals payTotals[MAX_TOTALS];
	bool processMenu = true;
	char selection = ' ';
	Employee empNames;

	//To access employees use employees[index].field name 
	// Example employees[1].lastname = "Jones";
	//To access pay use employees[index].field name 
	// Example pay[1].regHours = 40;

	//display menu in a while loop using following
	//use switch to error check and call functions

	do {
		displayMenu();
		selection = getSelection();
		cout << " \n";
		cout << "You chose " << selection << endl;
		cout << " \n";
		processMenu = true;
		switch (selection) {
		case '1': //Press 1 to input employees
				  // input employees
			getEmployeeNames(employees);
			displayEmployeeNames(employees);
			break;
		case '2': //Press 2 to input hours
				  //input hours
			inputHours(employees, pay); // Inputing the number of hours an Employee worked
			break;
		case '3': //Press 3 to calculate payroll 
				  // calc payroll
			calcPayroll(employees, pay);
			break;
		case '4': //Press 4 to get annual salary
			getAnnualSalary(employees, pay, ann);
			break;

		case '5': // Press 5 to print payroll 
			printFinalPayroll(employees, pay, ann);
			break;
		case '6': // Press 6 to print Company final payroll for all employees together
			getCompanyPayroll(employees, pay, ann);
			break;
		case 'X': // Press X to exit 
			cout << " You will now exit the loop \n  Please Press Enter Twice" << endl;
			processMenu = false;
			break;

		default:

			processMenu = false;


		} // switch
		system("pause");
		//display menu - function
		//get menu selection - function
		//process menu selection using a switch
		//exit when x is pressed
		//switch(choice) {
		//case 1: etc
		//extra credit - call processSelection to process
		//remember that you will need to set processMenu to exit the program
	} while (processMenu);



	system("pause");
	return 0;
}



void displayMenu() {

	/* This displays the menu for the whole program
	This is needed so that the user knows which case to input*/


	cout << "Press 1 to Input Employees";
	cout << "\nPress 2 to Input Hours ";
	cout << "\nPress 3 to calculate Payroll ";
	cout << "\nPress 4 to calculate Annual Salary ";
	cout << "\nPress 5 to print The Employee's payroll ";
	cout << "\nPress 6 to print The Company's Payroll";
	cout << "\nPress X to exit ";
	cout << "\nEnter Selection ";

} // dispaly Menu



  /* Function getSelection below
  which gets the user input that was displayed in the
  function of the displayMenu*/
char getSelection() {


	/**/
	char choice = ' '; // used so the user can input choice
	bool needInput = true;

	do {
		cin >> choice;

		choice = toupper(choice);
		/*needed just in case user inputs lower case x.
		The system can capitial it in the background to uppercase X */

		switch (choice) {
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case 'X':
			needInput = false;
			break;

		default:
			cout << " You have entered invalid input " << endl;;
			cout << " Please re-enter a VALID input \n" << endl;
			displayMenu();
			/* Used so just in case the user input an incorrect value,
			we can have the program run again so that they can re-enter a valid input*/

		} // switch
	} while (needInput); // while curly brace

	return choice;

} // do curly brace


  /* Function getEmployeeNames */

void getEmployeeNames(Employee empInfo[]) {

	for (int i = 0; i < MAX_EMPLOYEES; i++) {

		/* The empInfo is there to get the information of the Employees
		Like FirstName, LastName, and Employee Number*/

		/* The (i + 1) is so that the program displays "What is employee number 1 Lastname"
		instead of displaying "What is employee number 0 Lastname"
		This logic goes on to the First Name and the Employee Number*/

		cout << "\n What is employee number: " << (i + 1) << " Lastname ";
		cin >> empInfo[i].lastname;

		cout << "\n What is employee number: " << (i + 1) << " Firstname ";
		cin >> empInfo[i].firstname;

		cout << "\n What is employee number: " << (i + 1) << " Employee Number ";
		cin >> empInfo[i].empNum;
		cout << " \n";


	} //for


} //getEmployessNames 

  /* Function displayEmployeeNames */

void displayEmployeeNames(Employee empInfo[]) {

	/* The empInfo is there to get the information of the Employees
	Like FirstName, LastName, and Employee Number*/

	for (int i = 0; i < MAX_EMPLOYEES; i++) {
		cout << "\n Lastname:         " << empInfo[i].lastname;
		cout << "\n Firstname:        " << empInfo[i].firstname;
		cout << "\n Employee Number:  " << empInfo[i].empNum;
		cout << " \n";


	} //for
	cout << endl;
} //displayEmpnames

  /* Function inputHours */

void inputHours(Employee emp[], Payroll pay[]) {

	// this function get the hours and rate of all employees 


	// payroll[i].empNumber = emp[i].empnum

	for (int i = 0; i < MAX_EMPLOYEES; i++) {
		cout << " \n";
		cout << "How many hours did " << emp[i].lastname << " work? ";
		cin >> pay[i].totHours; // 
		cout << "How much does " << emp[i].lastname << " make per hour? ";
		cin >> pay[i].regRate; // 
		cout << " \n";

		pay[i].otRate = (pay[i].regRate * OT_MULT);

		if (pay[i].totHours > MAX_REG_HOURS)
		{
			pay[i].regHours = (MAX_REG_HOURS);
			pay[i].otHours = (pay[i].totHours - MAX_REG_HOURS);
		}
		else {
			pay[i].regHours = (pay[i].totHours);
			pay[i].otHours = 0;
		} //if else

		  //cout << pay[i].regHours << '\t' << pay[i].otHours << endl;

	} //for


} // input hours

  /* Function calcPayroll */

void calcPayroll(Employee emp[], Payroll pay[]) {

	//int empNumber;
	//double regHours;
	//double otHours;
	//double regRate;
	//double otRate;
	//double regPay;
	//double otPay;
	//double totalPay;
	//deductions
	//double fica;
	//double socSec;
	//double totDeductions;
	//double netPay;
	for (int i = 0; i < MAX_EMPLOYEES; i++) {

		pay[i].otRate = (pay[i].regRate * OT_MULT);
		/* The OverTime rate is regrate multiplied by overtime multiplier*/

		pay[i].otPay = (pay[i].otRate * pay[i].otHours);
		/* The overtime pay is the rate for Ovetime multipled by the overtime hours they worked */

		pay[i].totalPay = ((pay[i].regRate * pay[i].totHours) + pay[i].otPay);
		/* Total pay is the hours worked multiplied by the amount they get paid per hour
		plus any overtime pay if they qualify*/

		pay[i].fica = (FICA_PCT  * pay[i].totalPay);
		/* The amount of fica discount is FicA_PCT multiplied by the total pay*/

		pay[i].socSec = (SS_MED_PCT * pay[i].totalPay);
		/* The amount of socSec discount is SS_MED_PCT multiplied by the total pay*/

		pay[i].totDeductions = (pay[i].fica + pay[i].socSec);
		/* Total deductions is the deductions of both the fica and the socSec*/

		pay[i].netPay = (pay[i].totalPay - pay[i].totDeductions);
		/* Net Pay is totalPay - total deductions*/


		if (pay[i].totHours > MAX_REG_HOURS)
			pay[i].otHours = (pay[i].totHours - MAX_REG_HOURS);
		/* The overtime hours is the total hours worked subtracted by the Max REG HOURS
		*/
		else
			pay[i].otHours = 0;

		cout << "                                                        " << endl; // Used for cosmetics
		cout << " This is " << emp[i].lastname << " Weekly Salary:  " << endl;;
		cout << " Total Hours Worked:  " <<  fixed << showpoint << setprecision(2) << pay[i].totHours << endl;; //  Displays total hours
		cout << " Rate per Hour:       $" <<  fixed << showpoint << setprecision(2) << pay[i].regRate << endl; // Displays Reg Rate
		cout << " Over Time Hours:     " <<  fixed << showpoint << setprecision(2) << pay[i].otHours << endl; // Displays Overtime Hours
		cout << " Over Time Rate:      $" <<  fixed << showpoint << setprecision(2) << pay[i].otRate << endl; // Displays OverTime Rate
		cout << " Over Time Pay:       $" <<  fixed << showpoint << setprecision(2) << pay[i].otPay << endl; // Displays overtime pay
		cout << " Total Pay:           $" <<  fixed << showpoint << setprecision(2) << pay[i].totalPay << " (No deductions) " << endl; // No deductions // Displas total pay
		cout << " Fica :               $" <<  fixed << showpoint << setprecision(2) << pay[i].fica << " (Deduction Amount) " << endl; // Displays fica deduction amoutn
		cout << " Social Security:     $" <<  fixed << showpoint << setprecision(2) << pay[i].socSec << " (Deduction Amoun) " << endl; // Displays social security deduction amount
		cout << " Total Deductions:    $" <<  fixed << showpoint << setprecision(2) << pay[i].totDeductions << endl; // Displays total deduction amount
		cout << " Net Pay:             $" <<  fixed << showpoint << setprecision(2) << pay[i].netPay << " (With Deductions weekly)" << endl; // Displays net pay
		cout << " -----------------------------------------" << endl; // Used for cosmetics 

	} //for


	cout << "In calc payroll\n ";
	system("pause");

} // I need to know the formula for the fica and the socSec and the totDeductions


  /* Function getEmpName */

void getEmpName(Employee empStuff) {

	cout << "Lastname ";
	cin >> empStuff.lastname; // User inputs lastname




}// getEmpName

void getAnnualSalary(Employee emp[], Payroll pay[], AnnualPayroll ann[]) {

	bool invalidInput = false;

	
	

	for (int i = 0; i < MAX_EMPLOYEES; i++) {

		ann[i].totRoughWeekPay = pay[i].totalPay;
		ann[i].totWeekPay = pay[i].netPay;

		invalidInput = false;

		
		cout << " How many weeks will " << emp[i].lastname << " work this year? ";
		cin >> ann[i].numOfWeeksWorked;
		invalidInput = (ann[i].numOfWeeksWorked > 52 || ann[i].numOfWeeksWorked < 1);
		/* This is needed because there are 52 weeks in a year. 
		If the user inputs a value that is greater than 52 or less than 1, the data would be unrealistic*/

		while (invalidInput) {

			cout << "Number of weeks must be equal to or less than 52 \n Because there are only 52 weeks in a year" << endl;
			cout << " Please Re-Enter a valid input: ";
			cin >> ann[i].numOfWeeksWorked;

			invalidInput = (ann[i].numOfWeeksWorked > 52 || ann[i].numOfWeeksWorked < 1);
			
			/* This loop is needed to check to see if the user put an invalid input for ann[i].numOfWeeksWorked */

		}// while loop 

		

		ann[i].totRoughAnnualSalary = (ann[i].totRoughWeekPay * ann[i].numOfWeeksWorked);
		/* The annual salary of the worker with no deductions
		totRoughWeekPay multiplied by the numOfWeeksWorked
		*/

		ann[i].totAnnualSalary = (ann[i].totWeekPay * ann[i].numOfWeeksWorked);
		/* The annual Salary of the employee with deductions
		totWeekPay multiplied by numOfWeeksWorked*/

		cout << "                                                        " << endl; // Used for cosmetics
		cout << "\nThis is " << emp[i].lastname << "'s Annual Salary:" << endl;
		cout << " Weekly Pay (No Deductions):       $" <<  fixed << showpoint << setprecision(2) << ann[i].totRoughWeekPay << endl; // Weekly Pay used with ann for no deductions
		cout << " Weekly Pay (With Deductions):     $" <<  fixed << showpoint << setprecision(2) << ann[i].totWeekPay << endl; // Weekly pay used with ann for deductions
		cout << " Weeks Worked In A Year:            " <<  fixed << showpoint << setprecision(2) << ann[i].numOfWeeksWorked << endl; // Weeks user worked in a year
		cout << " Annual Salary (No Deductions):    $" <<  fixed << showpoint << setprecision(2) << ann[i].totRoughAnnualSalary << endl; // Annual Salary used with ann for no deductions
		cout << " Annual Salary (With Deductions):  $" <<  fixed << showpoint << setprecision(2) << ann[i].totAnnualSalary << endl; //Annual Salary used with ann for deductions
		cout << "--------------------------------------------------------------" << endl; // Used for cosmetics






	}// for loop





}//getAnnualSalary

void printFinalPayroll(Employee emp[], Payroll pay[], AnnualPayroll ann[]) {


	for (int i = 0; i < MAX_EMPLOYEES; i++) {

		cout << " This is " << emp[i].firstname << " " << emp[i].lastname << "'s Final Payroll with Weekly Salary and Annual Salary" << endl;
		cout << "                                                        " << endl; // Used for cosmetics
		cout << " Total Hours Worked Weekly:         " <<  fixed << showpoint << setprecision(2) << pay[i].totHours << endl;; //  Displays total hours
		cout << " Weeks Worked In A Year:            " << fixed << showpoint << setprecision(2) << ann[i].numOfWeeksWorked << endl; // Weeks user worked in a year
		cout << " Rate per Hour:                    $" <<  fixed << showpoint << setprecision(2) << pay[i].regRate << endl; // Displays Reg Rate
		cout << " Over Time Hours:                   " <<  fixed << showpoint << setprecision(2) << pay[i].otHours << endl; // Displays Overtime Hours
		cout << " Over Time Rate:                   $" <<  fixed << showpoint << setprecision(2) << pay[i].otRate << endl; // Displays OverTime Rate
		cout << " Over Time Pay:                    $" <<  fixed << showpoint << setprecision(2) << pay[i].otPay << endl; // Displays overtime pay
		cout << " Total Pay:                        $" <<  fixed << showpoint << setprecision(2) << pay[i].totalPay << endl; // No deductions // Displas total pay
		cout << " Fica Deduction:                   $" <<  fixed << showpoint << setprecision(2) << pay[i].fica << endl; // Displays fica deduction amoutn
		cout << " Social Security Deduction:        $" <<  fixed << showpoint << setprecision(2) << pay[i].socSec <<  endl; // Displays social security deduction amount
		cout << " Total Deductions:                 $" <<  fixed << showpoint << setprecision(2) << pay[i].totDeductions << endl; // Displays total deduction amount
		cout << " Net Pay Weekly (With Deductions): $" <<  fixed << showpoint << setprecision(2) << pay[i].netPay << endl; // Displays net pay
		cout << " Weekly Pay (No Deductions):       $" <<  fixed << showpoint << setprecision(2) << ann[i].totRoughWeekPay << endl; // Weekly Pay used with ann for no deductions
		cout << " Weekly Pay (With Deductions):     $" <<  fixed << showpoint << setprecision(2) << ann[i].totWeekPay << endl; // Weekly pay used with ann for deductions
		cout << " Annual Salary (No Deductions):    $" <<  fixed << showpoint << setprecision(2) << ann[i].totRoughAnnualSalary << endl; // Annual Salary used with ann for no deductions
		cout << " Annual Salary (With Deductions):  $" <<  fixed << showpoint << setprecision(2) << ann[i].totAnnualSalary << endl; //Annual Salary used with ann for deductions
		cout << "--------------------------------------------------------------" << endl; // Used for cosmetics

		
		

	}// for loop
	
	

} //printFinalPayroll

void getCompanyPayroll(Employee emp[], Payroll pay[], AnnualPayroll ann[]) {

	/* The four double below is used to get the Company's total Payroll
	This is a global variable tough it can be used as a local variable
	I will put this in the function getCompanyPayroll for extra caution just in case */

	double compAnnualPayrollWithDeduct;
	/* The company Payroll will be the sum of all
	the employees anuual salary with deductions*/

	double compWeekPayrollWithDeduct;
	/* The company Payroll will be the sum of all
	the employees weekly salary with deductions*/

	double compAnnualPayrollNoDeduct;
	/* The company Payroll will be the sum of all
	the employees anuual salary no deductions*/

	double compWeekPayrollNoDeduct;
	/* The company Payroll will be the sum of all
	the employees weekly salary no deductions*/







	for (int i = 0; i < 1; i++) { 

		/* There is for loop middle statement is i < 1 because I am trying to calculate the total
		of all employees and if it were i < MAX_EMPLOYEES, the calculations below would be
		over the MAX_EMPLOYEES, which is 3, limit and it would give an Error
		Having the for loop to less than 1 keeps the values the same without really incrementing them
		allowing for my calculation to increment them itself
		If I were to put my calculations outside the for loop, it would give an error
		because i is only initialized in the for loop itself*/

		compAnnualPayrollNoDeduct = (ann[i].totRoughAnnualSalary /* Employee Number 1*/ + ann[i + 1].totRoughAnnualSalary /* Employee Number 2*/ + ann[i + 2].totRoughAnnualSalary  /* Employee Number 3*/) ;
		compWeekPayrollNoDeduct = (ann[i].totRoughWeekPay /* Employee Number 1*/ + ann[i + 1].totRoughWeekPay /* Employee Number 2*/ + ann[i + 2].totRoughWeekPay  /* Employee Number 3*/);
		compAnnualPayrollWithDeduct = (ann[i].totAnnualSalary /* Employee Number 1*/ + ann[i + 1].totAnnualSalary /* Employee Number 2*/ + ann[i + 2].totAnnualSalary  /* Employee Number 3*/);
		compWeekPayrollWithDeduct = (ann[i].totWeekPay /* Employee Number 1*/  + ann[i + 1].totWeekPay /* Employee Number 2*/ + ann[i + 2].totWeekPay  /* Employee Number 3*/);


	}// for loop
		cout << "                                                                                        " << endl;
		cout << " This is the Company's Payroll:" << endl;
		cout << "                                                                                        " << endl;
		cout << "Company Weekly Payroll of All Employees No Deductions:      $" <<  fixed << showpoint << setprecision(2) << compWeekPayrollNoDeduct << endl;//Company Weekly Payroll of All Employees No Deductions
		cout << "Company Annual Payroll of All Employees No Deductions:      $" <<  fixed << showpoint << setprecision(2) << compAnnualPayrollNoDeduct << endl;//Company Annual Payroll of All Employees No Deductions:
		cout << "Company Weekly Payroll of All Employees With Deductions:    $" <<  fixed << showpoint << setprecision(2) << compWeekPayrollWithDeduct << endl;//Company Weekly Payroll of All Employees With Deductions
		cout << "Company Annual Payroll of All Employees With Deductions:    $" <<  fixed << showpoint << setprecision(2) << compAnnualPayrollWithDeduct << endl; // Company Annual Payroll of All Employees With Deductions
		cout << "--------------------------------------------------------------" << endl; // Used for cosmetics 

	
}//getCompanyPayroll