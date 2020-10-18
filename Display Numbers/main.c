/*
    This program will show how to format the display
    of numbers to the monitor


*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int myInteger = 1234;
    float myFloat = 1234.56789;

    printf("%d\n" , myInteger);
    printf("%i\n" , myInteger);
    printf("%o\n" , myInteger); //octal representation
    printf("%x\n", myInteger); //hexadecimal
    printf("%X\n" , myInteger);

    printf("%10d\n" , myInteger); // width specification
    printf("%2d\n\n\n" , myInteger);

    printf("%f\n" , myFloat);
    printf("%e\n" , myFloat);
    printf("%E\n" , myFloat);
    printf("%g\n" , myFloat);
    printf("%G\n" , myFloat);
    printf("%20f\n" , myFloat);
    printf("%.2f\n" , myFloat);
    printf("%20.2f\n" , myFloat);


    return 0;
}
