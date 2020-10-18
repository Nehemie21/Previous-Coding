/*
    Introduction to Pointers
*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int grade = 97;
    float average = 10;
    char letter = 'a';
    double speed = 23.567;
    int bubble = 45;

    int *ptrGrade; //pointers will store addresses
    float *ptrAverage;
    char *ptrLetter;
    double *ptrSpeed;

    ptrGrade = &grade; //ptrGrade will contain the address of grade
    ptrAverage = &average;
    ptrLetter = &letter;
    ptrSpeed = &speed;

    //displaying the contents of the variables average and grade
    printf("average = %.2f\n" , average);
    printf("grade = %d\n" , grade);
    printf("letter = %c\n" , letter);
    printf("speed = %lf\n\n" , speed);
    printf("ptrAverage = %d\n" , ptrAverage);
    printf("ptrGrade = %d\n" , ptrGrade);
    printf("ptrLetter = %d\n" , ptrLetter);
    printf("ptrSpeed = %d\n\n" , ptrSpeed);

    //displaying the address of the variables average and grade
    printf("address of average: %d\n", &average);
    printf("address of bubble: %d\n" , &bubble);
    printf("address of grade: %d\n", &grade);
    printf("address of letter: %d\n" , &letter);
    printf("address of speed: %d\n\n" , &speed);

    average = 23.6; //direct access to the variable average
    printf("New contents of average = %f\n" , average);

    //dereference the pointer to change/update the contents
    //of the variable the pointer is pointing to
    *ptrAverage = 5.5;
    *ptrGrade = 21;
    *ptrLetter = 'N';
    *ptrSpeed = 17;


    printf("New contents of average through the pointer is = %.2f\n" , average);
    printf("New contents of grade through the pointer is = %d\n" , grade);
    printf("New contents of letter through the pointer is = %c\n" , letter);
    printf("New contents of speed through the pointer is = %.2lf\n" , speed);
    return 0;
}

