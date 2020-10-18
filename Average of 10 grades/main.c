/*
    Program calculates the average of 10 grades entered by
    the user. The grades are stored in an array.
*/

#include <stdio.h>
#include <stdlib.h>
#define SIZE 10


int main()
{
    float grades[SIZE];
    int i = 0;
    float average = 0;
    float sum = 0;

    printf("Enter 10 grades to calculate the average\n");

    for(i = 0; i < SIZE; i++)
    {
        printf("grade %d : " , i + 1);
        scanf("%f" , &grades[i]); // scanf("%f" , &grade);

        sum = sum + grades[i]; //sum = sum + grade;

    }
    average = sum/SIZE;

    printf("The average of the %d grades is: %.2f\n\n" , SIZE, average);
    printf("\n\nThe grades entered were: \n");

    for(i = 0; i < SIZE; i++)
    {
        printf("%.2f, " , grades[i]);
    }

    return 0;
}
