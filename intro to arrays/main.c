/*
    Introduction to Arrays
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    //single value variables
    int age = 56;
    float speed = 2.678;
    double velocity = 14.77888822233333333333;
    char letter = 'A';

    //multiple value variables
    //Arrays
    int i = 0;
    int grades[20]; //allocating 20 Memory
                    //locations for grades
    grades[0] = 10;
    grades[1] = 15;
    grades[7] = 12;
    grades[19] = 17;

    for(i = 0; i < 20; i++)
    {
        printf("grades[%d] = %d\n" , i, grades[i]);
    }

    //float speeds[5] = {[2] = 2.4, 3.5};
    //printf("\n\n");

    float speeds[5] ={[2] = 2.4, [4] = 3.5};
    printf("\n\n");

    for(i = 0; i < 5; i++)
    {
        printf("speeds[%d] = %f\n" , i, speeds[i]);
    }

    return 0;
}
