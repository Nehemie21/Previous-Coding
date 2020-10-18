#include <stdio.h>
#include <stdlib.h>
#include <math.h>

 void minmaxarray(float myArray[], int size, float *min, float *max);

int main()
{
    float myArray[10] = {0};
    int i = 0;
    float *min;
    float *max;

    float minVar = 0;
    float maxVar = 0;

    //*min = &minVar;
    //*max = &maxVar;


    int size = 10;

    for(i = 0; i < size; i++)
    {
        printf("Enter the value for the %d input in the array\n" , i+1);
        scanf("%f" , &myArray[i]);

    }


    minmaxarray(myArray, size, &min, &max);

    //printf("Hello world!\n");
    return 0;

}
 void minmaxarray(float myArray[], int size, float *min, float *max)
 {
     int i = 0;
     size = 10;

     float minVar = 0;
     float maxVar = 0;

    for(i= 0; i<size; i++)
    {
        if(myArray[i] > maxVar)
            maxVar = myArray[i];
    }
      for(i= 0; i<size; i++)
    {
        if(myArray[i] < maxVar)
            minVar = myArray[i];
    }
    min = &minVar;
    max = &maxVar;

    printf("This is the min: %f\n\n" , *min);
     printf("This is the max: %f\n\n" , *max);
}

