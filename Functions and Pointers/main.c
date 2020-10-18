/*
    Introduction to functions with pointers
    - call-by-reference
*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float cubed(int x);
void cubedPtr(int x, float *resultPtr);

int main()
{
    int value = 7;
    float result;

    result = cubed(value); //call-by-value
    printf("%d^3 = %f\n" , value, result);

    value = 4;
    cubedPtr(value, &result);
    printf("%d^3 = %f\n" , value, result);

    return 0;
}

float cubed(int x)
{
    float y = powf(x,3);

    return y;
}

void cubedPtr(int x, float *resultPtr)
{
    *resultPtr = powf(x,3);

}
