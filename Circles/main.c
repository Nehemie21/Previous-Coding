/*
    Write a formula that will calculate the
    diameter, circumference,
    area of a circle and a volume of sphere
    the user will enter the value of the radius

*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    const float PI = 3.141593;
    float radius = 0;
    float diameter = 0;
    float circumference = 0;
    float areaOfCircle = 0;
    float volumeOfSphere = 0;



    printf("Hello User! \n"
           "Today we will be calculating a\n"
           "Variety of topics and types\n"
           "Relating to circles.\nEnjoy!\n\n");
    printf("What is the radius of your circle? ");
    scanf("%f" , &radius);

    diameter = (radius * 2);
    circumference = (diameter * PI);
    areaOfCircle = ((radius * radius)* PI);
    volumeOfSphere = ((radius *radius * radius)* PI* (1.33333));


    printf("\nThe radius of your circle is: %2.f\n\n" , radius);
    printf("The diameter of your circle is: %2.f\n\n" , diameter);
    printf("The circumference of your circle is: %2.f\n\n" , circumference);
    printf("The area of your circle is: %2.f\n\n" , areaOfCircle);
    printf("The volume of your sphere is: %2.f\n\n" , volumeOfSphere);

    printf("End of Program \n");



    return 0;
}
