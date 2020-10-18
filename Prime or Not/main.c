/*
    Nehemie Pluviose
    C for Engineers
    Homework 4
    Due Date: 10/31/2019

    Program Description:
    I will write a function that determines if a number is prime.
    int isPrime(int number); is the function prototype
    The function returns 1 if the number is prime
    The function returns 0 if the number is not prime
    This function to determine all the prime numbers  from 1 to 1,000.

*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int isPrime(int number);

int main(void) {


  const int MAX_NUMBER = 1000;
  int number = 1;
  int prime = 0;


  printf("Prime Numbers 1 to 1000\n\n");
  printf("----------------------------\n");

  for(int number = 1 ; number <= 1000 ; number++)
  {

    prime = isPrime(number);
    printf("\n%d" , number);
        if (prime == 1)
        {
            printf(" Prime\n");
        }
        else
        {
            printf(" Not Prime\n");
        }
  }
}


int isPrime(int number)
{
    int result = 0;
    int primeCheck = 2;
    int counter = 0;
    int iterations = 1;


      do
      {
        if ((number % primeCheck) == 0)
          counter++;
        else
          counter = counter;


        primeCheck++;
        iterations++;
      }while(iterations <= number);

      if (counter <= 1)
        result = 1;
      else
        result = 0;

  return result;
}
