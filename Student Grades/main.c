/*
    Write a program that will allow the user to enter an average
    grade and the program will display the corresponding letter
    grade.

    100 - 90 A
    89 - 80 B
    79 - 70 C
    69 -60 D
    59 - 0 F

*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float studentGrade = 0;

    printf( " Enter the student's grade as a number:  ");
    scanf("%f" , &studentGrade);

   /* if (studentGrade <= 100 && studentGrade >= 90 )
    {
        printf("\nThe student grade is an A");
    }
    else if (studentGrade < 90 && studentGrade >= 80)
    {
        printf("\nThe student grade is a B");
    }
    else if (studentGrade < 80 && studentGrade >= 70)
    {
        printf("\nThe student grade is a C");
    }
    else if (studentGrade < 70 && studentGrade >= 60)
    {
        printf("\nThe student grade is a D");
    }
    else
        printf("\nThe student grade is a F"); */


    if (studentGrade  >=90 )
    {
        printf("\nThe student grade is an A");
    }
    else if (studentGrade >= 80 )
    {
        printf("\nThe student grade is a B");
    }
    else if (studentGrade >= 70 )
    {
        printf("\nThe student grade is a C");
    }
    else if (studentGrade >= 60 )
    {
        printf("\nThe student grade is a D");
    }
    else
        printf("\nThe student grade is a F");

    return 0;
}
