/*

    This program will generate 100 data points using the damped
    sine function above and display the results in table format
    1 ≤ k ≤100.

*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    float time = 0.0;
    float sineResult = 0.0;
    int incrementValueK = 0.0;
    const float PI = 3.14159;
    int datapoints = 1;

    printf("What do you want your increment value to be? \n");
    scanf("%d" , &incrementValueK);

    while(incrementValueK > 100 || incrementValueK < 1)
    {
        printf("Error, your increment value must be equal to or greater than 1\n"
               "but also must be less than or equal to 100\n\n");
        printf("Please enter a new value for your increment value\n\n");

        printf("What do you want your increment value to be? \n");
        scanf("%d" , &incrementValueK);

    }

    printf("\n\nYour increment value is: %d\n\n" , incrementValueK);

    time = (incrementValueK - 1)/10.0;

    sineResult = exp(-time)*(sin(2*PI*time));

    printf("\n\nThe results for the increment value and time in relation to the Damped Sine function are as followed: \n\n");

    printf("Increment Value\tTime\tDamped Sine Result\n\n");



    do
    {

        printf("%d\t%6.6f\t%6.6f" , incrementValueK, time, sineResult);
        printf("\n");



        incrementValueK = incrementValueK + 1;
        datapoints++;

        time = (incrementValueK - 1) * (1/10.0);

        sineResult = (1/exp(time))*(sin(2*PI*incrementValueK));

    } while(datapoints <= 100);

    return 0;
}
