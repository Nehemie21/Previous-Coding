#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float distance(float x1, float y1, float x2, float y2);

float isTriangle(float side1, float side2, float side3);

float side3(float side1, float side2, float angle);


float perimeterSSS(float side1, float side2, float side3);
float perimeterSAS(float side1, float angle, float side2);
float perimeterASA(float angle1, float side1, float angle2);
float perimeterAAS(float angle1, float angle2, float side1);


float areaSSS(float side1, float side2, float side3);
float areaSAS(float side1, float angle, float side2);
float areaASA(float angle1, float side1, float angle2);
float areaAAS(float angle1, float angle2, float side1);

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
    float distance = 0;


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

            break;

        case 2:

            break;

        case 3:

            break;

        case 4:
            printf("You chose the Perimeter of a Triangle.\n\n");
            printf("Press 1 to calculate the perimeter of a triangle using SSS.\n");
            printf("Press 2 to calculate the perimeter of a triangle using SAS.\n");
            printf("Press 3 to calculate the perimeter of a triangle using ASA.\n");
            printf("Press 4 to calculate the perimeter of a triangle using AAS.\n\n");

            switch(user_inner_choice1)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }
            break;

        case 5:
            printf("You chose the Perimeter of a Triangle.\n\n");
            printf("Press 1 to calculate the area of a triangle using SSS.\n");
            printf("Press 2 to calculate the area of a triangle using SAS.\n");
            printf("Press 3 to calculate the area of a triangle using ASA.\n");
            printf("Press 4 to calculate the area of a triangle using AAS.\n\n");

            switch(user_inner_choice2)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }
            break;


    }
    return 0;
}

