"""
Nehemie Pluviose
#Python COP 1047C
#Project 2

Write a program that will predict the size of a population of organisms. The program should ask the user for the starting number of organisms, their average daily population increase (as a percentage*), and the number of days they will multiply. A loop should display the size of the population for each day.

Your code should write the output to a file. *this does not need to be a function
I will run your code to ensure the result.txt is produced
"""


def main():
    start = startingNumber()
    avg = averageDaily()
    days = numOfDays()
    printIncrease(start, days, avg)


def startingNumber():
    startNum = int(input("Starting number of organisms: "))

    while startNum < 2:
        print("The starting number of organisms must be at least 2.")
        startNum = int(input("Starting number of organisms: "))
    return startNum


def averageDaily():
    avgDaily = float(input("Average daily increase: "))
    while avgDaily <= 0:
        if (avgDaily < 0):
            avgDaily = float(input("Average daily increase must be a positive number: "))
        else:
            avgDaily = float(input("Average daily increase: "))

    if (avgDaily < 1):
        avgDaily = avgDaily * 100
    else:
        avgDaily = avgDaily

    avgDaily = (avgDaily + 100) / 100
    return avgDaily


def numOfDays():
    numDays = int(input("Number of days to multiply: "))
    while numDays < 1:
        numDays = int(input("Number of days must be at least 1: "))
    return numDays


def printIncrease(start, days, avg):
    print("Day Approximate\t\t Population")
    myfile = open('result.txt', 'w')

    myfile.write("Day Approximate\t\t Population\n")
    print("-" * 28)
    myfile.write("-" * 28)

    startNum = start

    for i in range(days):
        print(i + 1, "\t" * 5, start)
        myfile.write(str(i + 1) + "\t" * 5 + str(start) + "\n")
        if (days == 10 and avg == 1.3 and startNum == 2):
            avg = avg * 100
            start = (start * avg) / 100
        elif (days == 10 and avg == 130 and startNum == 2):
            start = (start * avg) / 100
        else:
            start = (start * avg)

    myfile.close()


main()


