/*

    This program will generate a table of conversion
    from Celsius to Rankin
    The user will enter the starting point for Celsius
    and the increment value

*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
   float incrementValue = 0;
   float celsius = 0;
   float rankin = 0;
   float counter = 0;

   printf("What do you want your increment value to be?: ");
   scanf("%f" , &incrementValue);


   if (incrementValue < 1)
          {printf("Your increment value must be at least 1\n");
            printf("Your increment value has been set to the default of 10\n\n");
            incrementValue = 10;
          }
    else
            printf("This is your increment value" , incrementValue);


    printf("\nWhat do you want your Celsius starting value to be?: ");
    scanf("%f" , &celsius);

    if (celsius < -273.14)
          {printf("\nYour Celsius starting value cannot be -273.15 or lower\n");
            printf("Your Celsius starting value has been set to the default of 10\n\n");
            celsius = 10;
          }
    else
            printf("\nThis is your Celsius starting value\n" , celsius);


    printf("  Celsius\t\tRankin\n"
            "--------------------------\n");


    while (counter < 25)
    {

        rankin = (9.0/5.0) * (celsius + 273.15);

        printf("%10.2f\t%10.2f\n" , celsius, rankin);

        celsius = celsius + incrementValue;
        counter = counter + 1;
    }
    return 0;
}
