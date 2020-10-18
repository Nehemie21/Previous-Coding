/*
    Description: Program introduces the basic
    arithmetic operators in C
*/


#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x = 10;
    float y = 12.5;

    int result1;
    float result2;

    /*
        The 5 basic arithmetic operators in C are:

        + addition
        - subtraction
        * multiplication
        / division
        % modulus or remainder

    */

    result1 = x/3; // x /3.0 the value is a float
    result2 = x/3;

    // integer divided by a float will equal result in a float,
    // however if it is stored in an int variable, it will result in an int
    // read from right to left
    printf("result1 = %d\nresult2 = %f\n" , result1, result2 );


    result1 = x/3.0; // x /3.0 the value is a float
    result2 = x/3.0;


    printf("result1 = %d\nresult2 = %f\n" , result1, result2 );

    //the remainder operator or modulus is the remainder
    //of the integer division of two numbers

    result1 = x%3; // both numbers/variables that are being divided must be integers
    printf("result1 = x%%4 = %d\n\n" , result1);


    return 0;
}
