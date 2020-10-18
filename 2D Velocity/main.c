
/*
    Writ
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define ROWS 4
#define COLS 8

int main()
{

    float flowRate[ROWS][COLS] = {0};
    float velocity = 0;
    const float PI = 3.14159;
    int i = 0;
    int j = 0;


    float diameter_Pipes [ROWS][COLS] = {{1.0, 1.125, 1.25, 1.375, 1.5, 1.625, 1.75, 1.875},
                                        {2.0, 2.125, 2.25, 2.375, 2.5, 2.625, 2.75, 2.875},
                                        {3.0, 3.125, 3.25, 3.375, 3.5, 3.325, 3.75, 3.875},
                                        {4.0, 4.125, 4.25, 4.375, 4.5, 4.625, 4.75, 4.875}};


    printf("Today we are going to calculate the flow rate in a set of pipes\n"
           "You will enter the velocity and the Diameter of the Pipe\n"
           "and the rate at which the water flows will appear\n\n");

    printf("What is the your desired velocity for your Flow Rate? ");
    scanf("%f" , &velocity);

    while(velocity <= 0)
    {
        printf("\nPlease enter a value of velocity that is greater than zero.\n");
        printf("What is the your desired velocity for your Flow Rate? ");
        scanf("%f" , &velocity);

    }
    printf("Your velocity is %.2f \n\n" , velocity);

    //flowRate = ((pow(diameter_Pipes, 2) * PI)/4.0) * velocity);

    for(i = 0; i <ROWS; i++)
    {
        printf("Diameter of Pipe\t\t\tFlow Rate\n");
        for(j = 0; j < COLS; j++)
        {

            flowRate[i][j] = (((pow(diameter_Pipes[i][j], 2) * PI)/4.0) * velocity);
            printf("\n %10.4f ft" , diameter_Pipes[i][j]);
            printf("\t\t\t\t%10.4f ft3/sec" , flowRate[i][j]);
        }
        printf("\n  \n");
    }

    return 0;
}
