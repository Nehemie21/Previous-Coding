/*
    Write a program that calculates and displays
    the area of 1000 circles.
    No user input.
    Use an array for the radii
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
#define SIZE 1000
#define PI 3.14159

int main()
{
    float area[SIZE];
    float radii[SIZE];
    int i = 0;


    for(i = 0; i < SIZE; i++)
    {
        radii[i] = (rand()%10 + 1) *1.3;
        area[i] = PI*pow(radii[i], 2);
        printf("Circle %d\n\tRadius = %f\n"
               "\tArea:%f\n\n" , i + 1, radii[i] , area[i]);
    }

    return 0;
}
