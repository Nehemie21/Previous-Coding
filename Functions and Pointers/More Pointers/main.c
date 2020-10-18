/*

*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x = 10;
    int myArray[5] = {1,3,5,7,9};
    int *ptrMyArray = &myArray;
    int *ptrX = &x;

    printf("ptrX = %d\n" , *ptrX); // it will display the value of 10 because it is a dereferncing
    printf("ptrX = %d\n" , ptrX); // address of variable x because it is assigned to the address x. That is its value
    printf("&ptrX = %d\n\n" , &ptrX); // address of variable ptrX

    (*ptrX)++; // the result of this will update x from 10 to 11

    printf("x = %d\n" , x);

    ptrX++; //The result will update the value of ptrX to an increment of 1
    // but actually updates it by the number of bytes
    // also updates the address stored in ptrX
    printf("ptrX = %d\n\n" , ptrX);
    printf("*ptrX = %d\n\n" , *ptrX);

    //ptrX = &myArray[0];
    ptrX = myArray;
    printf("ptrX = %d\n" , ptrX);
    printf("&myArray[0] = %d\n" , &myArray[0]);

    //show contents of the array using the pointer

    int i;
    for(i = 0; i < 5; i++)
    {
        printf("myArray[%d] = %d\n" , i, *ptrX);
        ptrX++;
    }
    return 0;
}
