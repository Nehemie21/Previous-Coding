/*
    Find and display the lowest grade in
    the array grades
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define STUDENTS 2
#define EXAMS 4

int main()
{
    int grades[STUDENTS][EXAMS] = {{98, 75, 68, 90},
                                    {67, 88, 72, 43}};

    int min = grades[0][0];
     for(int i = 0; i<STUDENTS; i++)
    {
        for(int j= 0; j<EXAMS; j++)
        {
            printf("%5d ", grades[i][j]);
            if (grades[i][j] < min)
                min = grades[i][j];
        }
        printf("\n\n");
    }

    printf("The minimum grade is %d\n\n" , min);

    return 0;
}
