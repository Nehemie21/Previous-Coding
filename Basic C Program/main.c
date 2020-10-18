/*
    Name: Nehemie Pluviose
    Due Date: 09.04.19
    Description: Program shows the usage of basic
                    arithmetic and variables.
*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
    //data to be processed is categorized in 3 basic types
    //C has 4 basic data types to use with variables
    //Integers, Floats, Characters, Double
    /* Rules for variable identifier:
        1) it must start with a letter or a underscore
        2)It can be alpha-numeric
        3) The only symbol allowed is the underscore
        4) It must be unique
        5) Can't contain spaces
        6) It can be of any length but only the first
            31st characters are recognized by the compiler
        7) It cannot be a keyword of the C language
        By convention we use lower case letters for variables

        Valid Examples :

        age23, carVelocity, car_velocity, aVeryLongVariableName

        Invalid Examples:

        1speed, car velocity, name#, main
    */

    int age; // declaration of the integer variable age
    float speed;
    char letter;
    double velocity;

    age = 45;
    speed = 45.5;
    letter = 'A';
    velocity = 34.56;

    //display the values of the variables to the monitor
    //using conversion specifiers
    printf("age = %d\n", age); // %d is a double and gives out a double
    printf("speed = %2.f\n" , speed); // %f is equal to float and gives out a float
    printf("letter = %c\n", letter); // %c is a character and gives out a character
    printf("velocity = %2.f\n\n" , velocity); //

    return 12;
}
