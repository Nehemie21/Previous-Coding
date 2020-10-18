/*
    Modify the Broker's commission program to allow
    the user to enter up to 15 transactions

*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int transactionRuns = 0;
    const float MINCHARGE = 39.0;
    float transAmount = 0;
    float commissionRate = 0;
    const int MAX_TRANS_RUNS = 15;
    transactionRuns = 1;

    while(transactionRuns <= MAX_TRANS_RUNS)
    {

        printf("Enter a transaction Amount $ ");
        scanf("%f", &transAmount);

        if (transAmount <= 0)
            printf("\n\t\aERROR: Invalid amount entered. Must be greater than 0");
        else if (transAmount < 2500)
            commissionRate = 30 + (0.017 * transAmount);
        else if (transAmount < 6250)
            commissionRate = 56 + (0.066 *transAmount);
        else if (transAmount < 20000)
            commissionRate = 76 + (0.0034 *transAmount);
        else if (transAmount < 50000)
            commissionRate = 100 + (0.0022 * transAmount);
        else if (transAmount < 500000)
            commissionRate = 155 + (0.0011 * transAmount);
        else
            commissionRate = 255 + (0.009 * transAmount);


        if (commissionRate < MINCHARGE && transAmount > 0)
            commissionRate = MINCHARGE;
        printf("Your commission rate is :  $%.2f \n\n" , commissionRate);

        transactionRuns = transactionRuns + 1;

    }

    return 0;
}
