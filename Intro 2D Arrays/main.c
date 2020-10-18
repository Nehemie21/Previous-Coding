/*
    Introduction to Multidimensional Arrays
*/

#include <stdio.h>
#include <stdlib.h>
#define COLS 4
#define ROWS 3

int main()
{
    //a 3x4 array
    int table[ROWS][COLS] = {0}; // Rows then columns
    int i, j;

    table[0][0] = 12;
    table[1][0] = 34;
    table[2][0] = 45;

    for( i = 0; i<ROWS; i ++)
    {
        for(j= 0; j<COLS; j++)
        {
            printf("%5d ", table[i][j]);
        }
        printf("\n\n");
    }
    printf("---------------------------------\n");

    float speed[ROWS][COLS] ={
                            {1.1, 1.2},
                            {3.2,},
                            {1.4,4.5,5.6,2.3}};
     for( i = 0; i<ROWS; i ++)
    {
        for(j= 0; j<COLS; j++)
        {
            printf("%.2f ", speed[i][j]);
        }
        printf("\n\n");
    }
 printf("---------------------------------\n");
      for(j= 0; j<COLS; j++)
    {
       for( i = 0; i<ROWS; i ++)
        {
            printf("%.2f ", speed[i][j]);
        }
        printf("\n\n");
    }

    return 0;
}
