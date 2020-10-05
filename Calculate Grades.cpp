//Nehemie Pluviose
//calculate grades

#include <iostream>;
#include <string>
using namespace std;


int main() {

    int grade = 0;
    char finalGrade = ' ';
    const int PASSING_GRADE = 61;


    cout << "What is the grade in number form: ";
    cin >> grade;


    if (grade >= 90)
        finalGrade = 'A';
    else if (grade >= 80)
        finalGrade = 'B';
    else if (grade >= 70)
        finalGrade = 'C';
    else if (grade >= PASSING_GRADE)
        finalGrade = 'D';
    else
        finalGrade = 'F';

    if (grade >= PASSING_GRADE)
        cout << "Congratulations! you passed \n";
    else
        cout << "You did not make the grade  \n";



    system("pause");
    return 0;
}
