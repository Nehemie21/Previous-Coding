/*
    Introduction to user-defined functions

    We will write a function that returns the maximum
    of two integer numbers.
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

//function prototype
int maxValue(int x, int y);

int main()
{
    int value1 = 0;
    int value2 = 0;
    int max = 0;

    printf("Enter two integer values and I will tell you\n"
            "which one is larger.\n>>value 1: ");
    scanf("%d" , &value1);

    printf(">> value 2? ");
    scanf("%d" , &value2);

    max = maxValue(value1, value2); //function call

    printf("The largest value is: %d\n\n" , max);

    printf("End of program.\n\n");

    return 0;
}

//--- maxValue ---
//---This function returns the largest number
//---if two integers

int maxValue(int x, int y)
{
    int max = 0;

    if(x > y)
        max = x;
    else if (y > x)
        max = y;
    else
        printf("There is no maximum value.\nThey both are equal.\n");

    return max;
}
