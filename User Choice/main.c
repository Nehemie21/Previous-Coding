/*
Write a program that will allow the user to choose one of the following
conversions:

    1) Miles to Kilometer
    2) Kilometers to Miles
    3) Degrees Celsius to Fahrenheit
    4) Fahrenheit to Celsius

    The user will be prompted for the corresponding values
    depending on his/her choice.

    The program will also allow the user to make multiple conversions until the option
    entered is equal to 5

    Make sure that you validate inputs and outputs where necessary.


*/


#include <stdio.h>
#include <stdlib.h>

int main()
{

    int userChoice = 0;
    float miles = 0;
    float kilometers = 0;
    float celsius = 0;
    float fahrenheit = 0;
    const float milesKilometersConversion = 0.62137;

    printf( "-Press 1 to Convert Miles to Kilometers\n"
            "-Press 2 to Convert Kilometers to Miles\n"
            "-Press 3 to Convert Degrees Celsius to Fahrenheit\n"
            "-Press 4 to Convert Degrees Fahrenheit to Celsius\n"
            "What would you like to choose today?  \n");
    scanf("%d" , &userChoice);


    switch(userChoice)
    {
        case 1:
            printf("\nHow many miles would you like to convert to kilometers? ");
            scanf("%f" , &miles);
            kilometers = miles / milesKilometersConversion;
            printf("\n%.2f miles equals %.2f kilometers\n\n" , miles , kilometers);
            break;
        case 2:
            printf("\nHow many kilometers would you like to convert to miles? ");
            scanf("%f" , &kilometers);
            miles = kilometers * milesKilometersConversion;
            printf("\n%.2f kilometers equals %.2f miles\n\n" , kilometers , miles);
            break;
        case 3:
            printf("\nHow many degrees Celsius would you like to convert to Degrees Fahrenheit? ");
            scanf("%f" , &celsius);
            fahrenheit = (celsius * (9.0/5.0)) + 32;
            printf("\n%.2f degrees Celsius equals %.2f degrees Fahrenheit\n" , celsius , fahrenheit);
            break;
        case 4:
            printf("\nHow many degrees Fahrenheit would you like to convert to Degrees Celsius? ");
            scanf("%f" , &fahrenheit);
            celsius = (fahrenheit - 32) * (5.0/9.0);
            printf("\n%.2f degrees Fahrenheit equals %.2f degrees Celsius\n" , fahrenheit , celsius);
            break;
        default:
            printf("You entered a number that is not 1, 2 ,3 or 4\n"
                    "\nYour input is invalid.\n");
    }

    while( userChoice <= 4 && userChoice >= 1)
    {

        printf( "-Press 1 to Convert Miles to Kilometers\n"
                "-Press 2 to Convert Kilometers to Miles\n"
                "-Press 3 to Convert Degrees Celsius to Fahrenheit\n"
                "-Press 4 to Convert Degrees Fahrenheit to Celsius\n"
                "What would you like to choose today?  \n");
        scanf("%d" , &userChoice);

        switch(userChoice)
        {
            case 1:
                printf("\nHow many miles would you like to convert to kilometers? ");
                scanf("%f" , &miles);
                kilometers = miles / milesKilometersConversion;
                printf("\n%.2f miles equals %.2f kilometers\n" , miles , kilometers);
                break;
            case 2:
                printf("\nHow many kilometers would you like to convert to miles? ");
                scanf("%f" , &kilometers);
                miles = kilometers * milesKilometersConversion;
                printf("\n%.2f kilometers equals %.2f miles\n" , kilometers , miles);
                break;
            case 3:
                printf("\nHow many degrees Celsius would you like to convert to Degrees Fahrenheit? ");
                scanf("%f" , &celsius);
                fahrenheit = (celsius * (9.0/5.0)) + 32;
                printf("\n%.2f degrees Celsius equals %.2f degrees Fahrenheit\n" , celsius , fahrenheit);
                break;
            case 4:
                printf("\nHow many degrees Fahrenheit would you like to convert to Degrees Celsius? ");
                scanf("%f" , &fahrenheit);
                celsius = (fahrenheit - 32) * (5.0/9.0);
                printf("\n%.2f degrees Fahrenheit equals %.2f degrees Celsius\n" , fahrenheit , celsius);
                break;
            default:
                printf("You entered a number that is not 1, 2 ,3 or 4"
                        "It is invalid.\n");
        }
    }
    return 0;
}
