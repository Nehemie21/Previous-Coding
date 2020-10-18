/*
Calculate perimeter of a Triangle
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float sideA = 0;
    float sideB = 0;
    float sideC = 0;
    float perimeter = 0;

    printf(" This program calculates the perimeter of a triangle. \n "
           "Enter the values for the three sides. \n\n"
           "side A = " );



    scanf("%f" , &sideA);
    printf("You have entered: %2.f\n\n" , sideA);

    printf( "side B = ");
    scanf("%f" , &sideB);
    printf("side b is %2.f\n\n" , sideB);

    printf( "side C = ");
    scanf("%f" , &sideC);
    printf("side c is %2.f\n\n" , sideC);
if (sideA + sideB > sideC)
    {
        if(sideA + sideC > sideB)
        {
            if(sideB + sideC > sideA)
            {
                perimeter = sideA + sideB + sideC;
                printf("Perimeter = %2.f\n\n ", perimeter);
                 printf( "This is the perimeter of your triangle:  " , perimeter);
            }else
                printf("Your values didn't add up to a triangle.");
        }
        else
            printf("Your values didn't add up to a triangle.");
    }
    else
        printf("Your values didn't add up to a triangle.");
    //perimeter = (sideA + sideB + sideC);





    return 0;
}
