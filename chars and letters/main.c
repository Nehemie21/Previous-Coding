#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#define SIZE 50

int main()
{
    char userString[SIZE] = {0};
    int lowerCount = 0;
    int upperCount = 0;
    int i = 0;

    printf("Enter a username.\n");
    scanf("%49s" , userString);
    printf("You entered: %s\n " , userString);

    for(i = 0; userString[i] != '\0'; i++)
    {

        if(islower(userString[i]))
            lowerCount++;
        else if((isupper(userString[i])))
         {
              upperCount++;
              userString[i] = tolower(userString[i]);
         }

    }
    printf("\nupper letters: %d" , upperCount);
    printf("\nlower case letters: %d\n" , lowerCount);
    printf("\nnew string: %s\n" , userString);

    printf("\n\n");
    return 0;
}
