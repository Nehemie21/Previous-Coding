/*
    This program will convert Fahrenheit(°F)
    to Kelvin (K) temperatures.
    This will allow the user to enter the increment value
    Nehemie Pluviose



*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

   float fahrenheit = 0;
   float kelvin = 0;
   float incrementValue = 0;


    printf("What is the increment value that you wish to have?:");
    scanf("%f" , &incrementValue);


    if (incrementValue < 1 || incrementValue > 200)
          {printf("Your increment value must at least be 1\nnor can it exceed 200\n");
            printf("Your increment value has been set to the default of 10\n\n");
            incrementValue = 10;
          }
    else
            printf("This is your increment value" , incrementValue);

    printf("\nFahrenheit  Kelvin\n"
            "-----------------------------\n");

    while(fahrenheit <= 200)
    {
        kelvin = ((5.0/9.0) * (fahrenheit - 32)) + 273.15;

        printf("%7.2f\t%7.2f\n" , fahrenheit , kelvin);

        fahrenheit = fahrenheit + incrementValue;
    }

    return 0;
}
