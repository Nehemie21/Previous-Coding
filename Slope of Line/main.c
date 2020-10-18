/*
    Nehemie Pluviose
    C for Engineers
    Homework 1
    Due: Friday, 9/13/2019

    Goal: This program will calculate the user's
    slope of a line when the user
    input the coordinates for x1, y1 and
    x2, y2
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float pointx1 = 0; //user input for coordinate x1
    float pointx2 = 0; //user input for coordinate x2
    float pointy1 = 0; //user input for coordinate y1
    float pointy2 = 0; //user input for coordinate y2
    float slopeOfLine = 0; //formula equals ((pointy2 - pointy1)/ (pointx2 - pointx1));


    // greets user
    printf("Hello. Today we will calculate the slope of a line. \n"
           "Please enter down below your coordinates of your line.");

            // finds x1
    printf("\nCoordinate of point x1: ");
    scanf("%f" , &pointx1);

    //finds y1
    printf("\nCoordinate of point y1: ");
    scanf("%f" , &pointy1);

    //finds x2
    printf("\nCoordinate of point x2: ");
    scanf("%f" , &pointx2);

    //finds y2
    printf("\nCoordinate of point y2: ");
    scanf("%f" , &pointy2);

        // formula for slope of a line
    slopeOfLine = ((pointy2 - pointy1)/ (pointx2 - pointx1));

    //used to determine if coordinates enter equals a dot
    if (pointx1 == pointx2 && pointy1 == pointy2)
    {
        printf("\n\nCoordinates x1,y1 and x2,y2 are the same"
               "\n\nTherefore, you do not have a line");
    }
        else if (((pointy2 - pointy1) == 0)) //used to find horizontal line slope
        {
                printf("\n\nThe slope of your line is %f" , slopeOfLine);
                printf(" and it is horizontal ");
        }

            else if (((pointx2 - pointx1) == 0)) // used to find vertical line // no slope because it is undefined
            {
                    printf("\n\nThe slope of your line undefined so it is vertical");

            }
    else // used to find slopes of lines without previous conditions
        printf("\n\nThe slope of your line is %2.f" , slopeOfLine);

    //used to indicate end of program to user
    printf("\n\nEnd of Program.");
    return 0;
}
