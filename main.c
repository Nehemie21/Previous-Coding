/*
    Nehemie Pluviose
    C for Engineers
    In-Class Assignment 1
    Due Date: Sunday, 9/29/2019

    This program will generate a table of conversion
    from celsius to Rankin
    The user will enter the starting point for celsius
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


   printf("We will calculate Rankin Temperature by converting it from Celsius Temperature\n"
          "You will enter your increment value for Celsius\n"
          "and the starting point for Celsius\n\n");

    //This is when the user inputs their increment value for celsius
    printf("What do you want your increment value to be?: ");
    scanf("%f" , &incrementValue);

    //increment value cannot be a number less than one.
    //Celsius must increase
    //This is used so that we can ensure the user enters a positive number
    while (incrementValue < 1)
    {
        printf("Your increment value must be at least 1\n");
        printf("Please re-enter your increment value\n");

        printf("\nWhat do you want your increment value to be?: ");
        scanf("%f" , &incrementValue);
    }
        // The user inputs the starting point for Celsius
        printf("\nWhat do you want your celsius starting value to be?: ");
        scanf("%f" , &celsius);

        //This is used so that the user does not make the
        //rankin equation equal to zero
        //We can ensure the user doesn't do this because we
        //have the while loop
     while(celsius < -273.14)
  {
      printf("\nYour celsius starting value cannot be -273.15 or lower\n");
      printf("Please re-enter your value\n");

        printf("\nWhat do you want your celsius starting value to be?: ");
        scanf("%f", &celsius);
  }

        //This is used to format the data
      printf("  Celsius\tRankin\n"
            "--------------------------\n");

    //This displays the data exactly 25 times
    while (counter < 25)
    {

        rankin = (9.0/5.0) * (celsius + 273.15);

        printf("%10.2f\t%10.2f\n" , celsius, rankin);

        //increases celsius by user increment value
        celsius = celsius + incrementValue;

        //This is used so that the code repeats exactly 25 times
        counter = counter + 1;
    }
    return 0;
}
