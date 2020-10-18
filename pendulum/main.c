/*
  Nehemie Pluviose
  C for Engineers
  Due Date: 10/17/2019
  This program will compute the period of several simple
  pendulums and display the results in table format using
  the for loop.
  The user will input data for the Initial length of the Pendulum
  the increment of the length of the Pendulum and the
  number of calculations
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    const float PI = 3.14159;
    const float GRAVITY = 32.2;
    float time = 0;
    float withinSquareRoot = 0;
    float lengthOfPendulum = 0;
    int numberOfCalculations = 0;
    float incrementOfLength = 0;


    printf("What is your desired length of the pendulum?\n");
    scanf("%f" , &lengthOfPendulum);

    while(lengthOfPendulum <= 0)
    {
        printf("The length of the pendulum must be greater than 0\n");
        printf("What is your desired length of the pendulum?\n");
        scanf("%f" , &lengthOfPendulum);

    }

   printf("Initial length of the Pendulum is: %.2f\n", lengthOfPendulum);


    printf("What is your desired number of calculations?\n");
    scanf("%d" , &numberOfCalculations);

    while(numberOfCalculations <= 0)
    {
        printf("The number of periods must be greater than 0\n");
        printf("What is your desired number of calculations?\n");
        scanf("%d" , &numberOfCalculations);

    }

    printf("You will have a number of %d calculations.\n", numberOfCalculations);


    printf("What is your desired increment of length?\n");
    scanf("%f" , &incrementOfLength);

    while(incrementOfLength <= 0)
    {
        printf("The increment of length must be greater than 0\n");
        printf("What is your desired increment of length?\n");
        scanf("%f" , &incrementOfLength);

    }

    printf("Your increment value for the length is: %.2f\n", incrementOfLength);

    printf("\nLength\tTime\n");
    for(int i = 0; i < numberOfCalculations ; i++ )
    {

      withinSquareRoot = lengthOfPendulum / GRAVITY;
      time = (2*PI) * sqrt(withinSquareRoot);

      printf("%.2f\t%.2f\n", lengthOfPendulum , time);

      lengthOfPendulum = lengthOfPendulum + incrementOfLength;
    }




    return 0;
}
