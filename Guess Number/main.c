/*
    Write a program that plays the game of "Guess the Number" as follows:
    Your program will generate a random number to be guessed by the user,
    the random to be guesses will be in the range of 1 to 1000.

*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

int main()
{
    int user_choice = 0;
    int user_guess = 0;
    int guessNumber = 0;

    guessNumber = rand()%1000 + 1;

    //srand(time(NULL));

    do
    {

        do
        {
            printf("\nWhat is your guess?\n");
            scanf("%d", &user_guess);

            if(user_guess > guessNumber)
                printf("\nYour guess is too high\n");
            if(user_guess < guessNumber)
                printf("\nYour guess is too low\n");

        }while(user_guess != guessNumber);

        printf("\nYou have guessed correctly. The number was %d\n" , guessNumber);

        printf("\nDo you want to play again?\n");
        printf("Press 1 for Yes\nPress 2 for No\n");
        scanf("%d" , &user_choice);

        guessNumber = rand()%1000 + 1;
    }while(user_choice == 1);



    return 0;

}
