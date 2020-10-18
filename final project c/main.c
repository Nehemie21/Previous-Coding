/*
    Nehemie Pluviose Final Project

*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define PI 3.14159

float distance(float x1, float y1, float x2, float y2);

float isTriangle(float sideA, float sideB, float sideC);

float sideCFunction(float sideA, float sideB, float angle);


float perimeterSSS(float sideA, float sideB, float sideC);
float perimeterSAS(float sideA, float angle, float sideB);
float perimeterASA(float angleC, float sideA, float angleB);
float perimeterAAS(float angleA, float angleB, float sideA);


float areaSSS(float sideA, float sideB, float sideC);
float areaSAS(float sideA, float angle, float sideB);
float areaASA(float angleC, float sideA, float angleB);
float areaAAS(float angleA, float angleB, float sideA);

int main()
{
    int user_choice = 0;
    int user_increment = 0;
    int user_inner_choice1 = 0;
    int user_inner_choice2 = 0;

    float x1 = 0;
    float x2 = 0;
    float y1 = 0;
    float y2 = 0;
    float distanceOfPoints = 0;

    float sideA = 0;
    float sideB = 0;
    float sideC = 0;

    float angleA = 0;
    float angleB = 0;
    float angleC = 0;

    int counter = 0;

    float perimeter = 0;
    float area = 0;

    int programRepetition =0;
    int iterations = 0;
    printf("How many times would you like to repeat this program: ");
    scanf("%d" , &programRepetition);

    while( programRepetition < 1)
    {
        printf("Value must b greater than 1\n");
        printf("How many times would you like to repeat this program: ");
        scanf("%f", &programRepetition);

    }

    do
    {


                printf("Press a number to do one of the following\n\n");
                printf("Press 1 to calculate the distance between two points.\n");
                printf("Press 2 to check if three lengths will form a triangle.\n");
                printf("Press 3 to calculate the third side of a triangle.\n");
                printf("Press 4 to calculate the perimeter of a triangle.\n");
                printf("Press 5 to calculate the area of a triangle.\n\n");


                printf("What is your choice: ");
                scanf("%d" , &user_choice);

                switch(user_choice)
                {
                    case 1:
                            printf("You chose the Distance between two points.\n\n");
                            printf("\nWhat is the value of point x1? ");
                            scanf("%f", &x1);

                            printf("\nWhat is the value of point y1? ");
                            scanf("%f", &y1);

                            printf("\nWhat is the value of point x2? ");
                            scanf("%f", &x2);

                            printf("\nWhat is the value of point y2? ");
                            scanf("%f", &y2);

                            distanceOfPoints = distance(x1, y1, x2, y2);

                            printf("The distance between your two points is: %f" , distanceOfPoints);

                        break;

                    case 2:
                            printf("Enter the value for sideA: ");
                            scanf("%f", &sideA);

                            while( sideA <= 0)
                            {
                                printf("Value must b greater than 1\n");
                                printf("Enter the value for sideA: ");
                                scanf("%f", &sideA);

                            }

                            printf("Enter the value for sideB: ");
                            scanf("%f", &sideB);

                            while( sideB <= 0)
                            {
                                printf("Value must b greater than 1\n");
                                printf("Enter the value for sideA: ");
                                scanf("%f", &sideB);

                            }

                            printf("Enter the value for sideC: ");
                            scanf("%f", &sideC);

                            while( sideC <= 0)
                            {
                                printf("Value must b greater than 1\n");
                                printf("Enter the value for sideA: ");
                                scanf("%f", &sideC);

                            }

                            if( isTriangle(sideA, sideB, sideC) == 1)
                                printf("The sides do form a triangle.\n\n");
                            else
                                printf("The sides do not form a triangle.\n\n");

                        break;

                    case 3:
                            printf("Enter the value for sideA: ");
                            scanf("%f", &sideA);

                            while( sideA <= 0)
                            {
                                printf("Value must b greater than 1\n");
                                printf("Enter the value for sideA: ");
                                scanf("%f", &sideA);

                            }

                            printf("Enter the value for sideB: ");
                            scanf("%f", &sideB);

                            while( sideB <= 0)
                            {
                                printf("Value must b greater than 1\n");
                                printf("Enter the value for sideA: ");
                                scanf("%f", &sideB);

                            }

                            printf("Enter the value for angleA in degrees: ");
                            scanf("%f", &angleA);

                            while( angleA <= 0)
                            {
                                printf("Value must b greater than 1\n");
                                printf("Enter the value for angleA: ");
                                scanf("%f", &angleA);

                            }
                           sideC = sideCFunction(sideA, sideB, angleA);

                            printf("Side 3 is equal to %f" , sideC);

                        break;

                    case 4:
                        printf("You chose the Perimeter of a Triangle.\n\n");
                        printf("Press 1 to calculate the perimeter of a triangle using SSS.\n");
                        printf("Press 2 to calculate the perimeter of a triangle using SAS.\n");
                        printf("Press 3 to calculate the perimeter of a triangle using ASA.\n");
                        printf("Press 4 to calculate the perimeter of a triangle using AAS.\n\n");

                          printf("What is your choice: ");
                            scanf("%d" , &user_inner_choice1);

                        switch(user_inner_choice1)
                        {
                            case 1:

                                printf("Enter the value for sideA: ");
                                scanf("%f", &sideA);

                                while( sideA <= 0)
                                {
                                    printf("Value must b greater than 1\n");
                                    printf("Enter the value for sideA: ");
                                    scanf("%f", &sideA);

                                }

                                printf("Enter the value for sideB: ");
                                scanf("%f", &sideB);

                                while( sideB <= 0)
                                {
                                    printf("Value must b greater than 1\n");
                                    printf("Enter the value for sideA: ");
                                    scanf("%f", &sideB);

                                }

                                printf("Enter the value for SideC: ");
                                scanf("%f", &sideC);

                                while( sideC <= 0)
                                {
                                    printf("Value must b greater than 1\n");
                                    printf("Enter the value for sideC: ");
                                    scanf("%f", &sideC);

                                }
                                 perimeter = perimeterSSS( sideA, sideB,  sideC);
                                 printf("Perimeter is equal to : %f" , perimeter);

                                break;
                            case 2:
                                    printf("Enter the value for sideA: ");
                                    scanf("%f", &sideA);

                                    while( sideA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideA: ");
                                        scanf("%f", &sideA);

                                    }

                                    printf("Enter the value for AngleA: ");
                                    scanf("%f", &angleA);

                                    while( angleA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for angleA: ");
                                        scanf("%f", &angleA);

                                    }

                                    printf("Enter the value for SideB: ");
                                    scanf("%f", &sideB);

                                    while( sideB <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideB: ");
                                        scanf("%f", &sideB);

                                    }
                                perimeter = perimeterSAS(sideA, angleA, sideB);
                                printf("Perimeter is equal to : %f" , perimeter);

                                break;
                            case 3:

                                 printf("Enter the value for angleC: ");
                                    scanf("%f", &angleC);

                                    while( angleC <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for angleC: ");
                                        scanf("%f", &angleC);

                                    }

                                    printf("Enter the value for SideA: ");
                                    scanf("%f", &sideA);

                                    while( sideA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideA: ");
                                        scanf("%f", &sideA);

                                    }

                                    printf("Enter the value for angleB in degrees: ");
                                    scanf("%f", &angleB);

                                    while( angleB <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for angleB: ");
                                        scanf("%f", &angleB);

                                    }

                                perimeter = perimeterASA(angleC, sideA, angleB);
                                printf("Perimeter is equal to : %f" , perimeter);
                                break;
                            case 4:


                                 printf("Enter the value for angleA: ");
                                    scanf("%f", &angleA);

                                    while( angleA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideA: ");
                                        scanf("%f", &angleA);

                                    }

                                    printf("Enter the value for AngleB: ");
                                    scanf("%f", &angleB);

                                    while( angleB <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for angleB: ");
                                        scanf("%f", &angleB);

                                    }

                                    printf("Enter the value for sideA: ");
                                    scanf("%f", &sideA);

                                    while( sideA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideA: ");
                                        scanf("%f", &sideA);

                                    }


                                perimeter = perimeterAAS(angleA, angleB, sideA);
                                printf("Perimeter is equal to : %f" , perimeter);
                                break;

                            default:
                                    printf("You entered an invalid value.\n");
                                break;
                        }
                        break;

                    case 5:
                        printf("You chose the Area of a Triangle.\n\n");
                        printf("Press 1 to calculate the area of a triangle using SSS.\n");
                        printf("Press 2 to calculate the area of a triangle using SAS.\n");
                        printf("Press 3 to calculate the area of a triangle using ASA.\n");
                        printf("Press 4 to calculate the area of a triangle using AAS.\n\n");

                         printf("What is your choice: ");
                        scanf("%d" , &user_inner_choice2);

                        switch(user_inner_choice2)
                        {
                            case 1:

                                  printf("Enter the value for sideA: ");
                                scanf("%f", &sideA);

                                while( sideA <= 0)
                                {
                                    printf("Value must b greater than 1\n");
                                    printf("Enter the value for sideA: ");
                                    scanf("%f", &sideA);

                                }

                                printf("Enter the value for sideB: ");
                                scanf("%f", &sideB);

                                while( sideB <= 0)
                                {
                                    printf("Value must b greater than 1\n");
                                    printf("Enter the value for sideA: ");
                                    scanf("%f", &sideB);

                                }

                                printf("Enter the value for SideC: ");
                                scanf("%f", &sideC);

                                while( sideC <= 0)
                                {
                                    printf("Value must b greater than 1\n");
                                    printf("Enter the value for sideC: ");
                                    scanf("%f", &sideC);

                                }

                                area = areaSSS(sideA,  sideB, sideC);
                                printf("Area is equal to : %f" , area);
                                break;
                            case 2:

                                printf("Enter the value for sideA: ");
                                    scanf("%f", &sideA);

                                    while( sideA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideA: ");
                                        scanf("%f", &sideA);

                                    }

                                    printf("Enter the value for AngleA: ");
                                    scanf("%f", &angleA);

                                    while( angleA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for angleA: ");
                                        scanf("%f", &angleA);

                                    }

                                    printf("Enter the value for SideB: ");
                                    scanf("%f", &sideB);

                                    while( sideB <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideB: ");
                                        scanf("%f", &sideB);

                                    }

                                area = areaSAS(sideA, angleA, sideB);
                                printf("Area is equal to : %f" , area);
                                break;
                            case 3:

                                printf("Enter the value for angleC: ");
                                    scanf("%f", &angleC);

                                    while( angleC <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for angleC: ");
                                        scanf("%f", &angleC);

                                    }

                                    printf("Enter the value for SideA: ");
                                    scanf("%f", &sideA);

                                    while( sideA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideA: ");
                                        scanf("%f", &sideA);

                                    }

                                    printf("Enter the value for angleB in degrees: ");
                                    scanf("%f", &angleB);

                                    while( angleB <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for angleB: ");
                                        scanf("%f", &angleB);

                                    }

                                area = areaASA(angleC, sideA, angleB);
                                printf("Area is equal to : %f" , area);
                                break;
                            case 4:

                                 printf("Enter the value for angleA: ");
                                    scanf("%f", &angleA);

                                    while( angleA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideA: ");
                                        scanf("%f", &angleA);

                                    }

                                    printf("Enter the value for AngleB: ");
                                    scanf("%f", &angleB);

                                    while( angleB <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for angleB: ");
                                        scanf("%f", &angleB);

                                    }

                                    printf("Enter the value for sideA: ");
                                    scanf("%f", &sideA);

                                    while( sideA <= 0)
                                    {
                                        printf("Value must b greater than 1\n");
                                        printf("Enter the value for sideA: ");
                                        scanf("%f", &sideA);

                                    }

                                area = areaAAS( angleA, angleB, sideA);
                                printf("Area is equal to : %f" , area);
                                break;

                            default:
                                printf("You entered an invalid value.\n");
                                break;
                        }
                        break;

                            default:
                                printf("You entered an invalid value.\n");
                                break;


                }

                iterations++;
    }while( iterations < programRepetition);

    return 0;
}

float distance(float x1, float y1, float x2, float y2)
{
    //WORKS
    float distance = 0;
    float insideSquare = 0;
    float xUnderSquare = 0;
    float yUnderSquare = 0;

    xUnderSquare = (x2 - x1);
    yUnderSquare = (y2 - y1);

    insideSquare = (pow(xUnderSquare, 2)) + (pow( yUnderSquare , 2));
    distance = sqrt(insideSquare);

    return distance;
}

float isTriangle(float sideA, float sideB, float sideC)
{
    //WORKS
    int counter = 0;
    if ((sideA + sideB) <= sideC)
        counter++;
    else if ((sideC + sideA) <= sideB)
        counter++;
    else if ((sideC + sideB) <= sideA)
        counter++;
    else
        counter = counter;

    if(counter > 0)
        counter = 0;
    else
        counter = 1;

    return counter;

}

float sideCFunction(float sideA, float sideB, float angleA)
{
    //HAVE TO SEE IF WORKS
   float sideC = 0;
   float result = 0;
   float angleB = 0;
   float angleC =0;

   float radiansangleA = 0;
   float radiansangleB = 0;
   float radiansangleC = 0;


    radiansangleA = (angleA) * (PI / 180);
    radiansangleB = (angleB) * (PI / 180);
    radiansangleC = (angleC) * (PI / 180);

   angleB = sin(angleA) * sideB / sideA;

   printf("\nangleB %f" , angleB);
   angleB = asin(angleB);
   angleC = 180 - (angleB + angleA);

    printf("\nangleB %f" , angleB);
    printf("\nangleC %f" , angleC);

   sideC = (sin(angleC) * sideA)/ sin(angleA);
    printf("\nsideC %f\n" , sideC);

    return sideC;
}


float perimeterSSS(float sideA, float sideB, float sideC)
{
    //WORKS
    float perimeter = 0;
    perimeter = sideA + sideB + sideC;

    return perimeter;
}
float perimeterSAS(float sideA, float angleA, float sideB)
{
    //WORKS
     float perimeter = 0;
    float sideC = 0;
    float radiansAngleA = 0;

    radiansAngleA = (angleA) * (PI / 180);


    sideC = sqrt((pow(sideA , 2) + (pow(sideB , 2)) - ((2 * sideA * sideB) * cos(radiansAngleA))));

    perimeter = sideA + sideB + sideC;

    return perimeter;
}
float perimeterASA(float angleC, float sideA, float angleB)
{
    //WORKS
    float sideB = 0;
    float sideC = 0;

    float angleA = 0;

    float perimeter = 0;

    float radiansangleA = 0;
    float radiansangleB = 0;
    float radiansangleC = 0;

    angleA = 180 - angleB - angleC;
    printf("%f\n" , angleA);
    radiansangleA = (angleA) * (PI / 180);
    radiansangleB = (angleB) * (PI / 180);
    radiansangleC = (angleC) * (PI / 180);

    sideB = (sideA * (sin(radiansangleB)/ sin(radiansangleA)));
    sideC = (sideA * (sin(radiansangleC)/ sin(radiansangleA)));
    printf("%f\n" , sideC);
    printf("%f\n" , sideB);
    perimeter = sideA + sideB + sideC;

    return perimeter;

}
float perimeterAAS(float angleA, float angleB, float sideA)
{
    //WORKS
    float sideB = 0;
    float sideC = 0;

    float angleC = 0;

    float perimeter = 0;

    float radiansangleA = 0;
    float radiansangleB = 0;
    float radiansangleC = 0;

    angleC = 180 - angleB - angleA;

    radiansangleA = (angleA) * (PI / 180);
    radiansangleB = (angleB) * (PI / 180);
    radiansangleC = (angleC) * (PI / 180);

    sideB = sideA * sin(radiansangleB)/ sin(radiansangleA);
    sideC = sideA * sin(radiansangleC)/ sin(radiansangleA);

    perimeter = sideA + sideB + sideC;

    return perimeter;
}


float areaSSS(float sideA, float sideB, float sideC)
{
    float area = 0;
    float sMultiplier = 0;
    float insideSquareRoot = 0;



    sMultiplier = (sideA + sideB + sideC) / 2;
    insideSquareRoot = sMultiplier * (sMultiplier - sideA) * (sMultiplier - sideB) * (sMultiplier - sideC);


    area = sqrt(insideSquareRoot);
    return area;
}
float areaSAS(float sideA, float angleA, float sideB)
{

    float sideC = 0;
    float radiansAngleA = 0;
    float sMultiplier = 0;
    float area = 0;
    float insideSquareRoot = 0;




    radiansAngleA = (angleA) * (PI / 180);


    sideC = sqrt((pow(sideA , 2) + (pow(sideB , 2)) - ((2 * sideA * sideB) * cos(radiansAngleA))));

    sMultiplier = (sideA + sideB + sideC) / 2;
    insideSquareRoot = sMultiplier * (sMultiplier - sideA) * (sMultiplier - sideB) * (sMultiplier - sideC);
    area = sqrt(insideSquareRoot);

   return area;
}
float areaASA(float angleC, float sideA, float angleB)
{
     float sideB = 0;
    float sideC = 0;

    float angleA = 0;
    float sMultiplier = 0;
    float insideSquareRoot = 0;
    float area = 0;

    float radiansangleA = 0;
    float radiansangleB = 0;
    float radiansangleC = 0;

    angleA = 180 - angleB - angleC;

    radiansangleA = (angleA) * (PI / 180);
    radiansangleB = (angleB) * (PI / 180);
    radiansangleC = (angleC) * (PI / 180);

    sideB = (sideA * (sin(radiansangleB)/ sin(radiansangleA)));
    sideC = (sideA * (sin(radiansangleC)/ sin(radiansangleA)));


    sMultiplier = (sideA + sideB + sideC) / 2.0;
    insideSquareRoot = sMultiplier * (sMultiplier - sideA) * (sMultiplier - sideB) * (sMultiplier - sideC);
    area = sqrt(insideSquareRoot);

    return area;
}
float areaAAS(float angleA, float angleB, float sideA)
{
    float sideB = 0;
    float sideC = 0;

    float area = 0;

    float angleC = 0;

    float perimeter = 0;

    float radiansangleA = 0;
    float radiansangleB = 0;
    float radiansangleC = 0;

    float sMultiplier = 0;
    float insideSquareRoot = 0;
    angleC = 180.0 - angleB - angleA;

    radiansangleA = (angleA) * (PI / 180.0);
    radiansangleB = (angleB) * (PI / 180.0);
    radiansangleC = (angleC) * (PI / 180.0);

    sideB = sideA * sin(radiansangleB)/ sin(radiansangleA);
    sideC = sideA * sin(radiansangleC)/ sin(radiansangleA);

    sMultiplier = (sideA + sideB + sideC) / 2;
    insideSquareRoot = sMultiplier * (sMultiplier - sideA) * (sMultiplier - sideB) * (sMultiplier - sideC);
    area = sqrt(insideSquareRoot);

    return area;
}

/*
    SAS
    int result = 0;
    float sideC = 0;
    float radiansAngle = 0;

    radiansAngle = (angle) * (PI / 180);


    sideC = sqrt((pow(sideA , 2) + (pow(sideB , 2)) - ((2 * sideA * sideB) * cos(radiansAngle))));

    SSA failed


   float sideC = 0;
   float result = 0;
   float angleB = 0;
   float angleC =0;

   float radiansangleA = 0;
   float radiansangleB = 0;
   float radiansangleC = 0;


    radiansangleA = (angleA) * (PI / 180);
    radiansangleB = (angleB) * (PI / 180);
    radiansangleC = (angle) * (PI / 180);

   angleB = sin(angleA) * sideB / sideA;

   printf("\nangleB %f" , angleB);
   angleB = asin(angleB);
   angleC = 180 - (angleB + angleA);

    printf("\nangleB %f" , angleB);
    printf("\nangleC %f" , angleC);

   sideC = (sin(angleC) * sideA)/ sin(angleA);
    printf("\nsideC %f\n" , sideC);

    return sideC;
*/
