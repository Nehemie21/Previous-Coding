/*
    This program will print a table showing
    the degrees and its equivalent value in radians
    Nehemie Pluviose
    Due Date:
    9/25/2019

*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

    float radians = 0;
    float degrees = 0;
    const float PI = 3.14159;

    printf("Degrees\t Radians\n"
            "-----------------------\n");

    while (degrees <= 360)
    {
        radians = degrees * (PI/180);

        printf("%6.2f\t%6.2f\n " , degrees , radians);

        degrees = degrees + 10;

    }

    return 0;
}
