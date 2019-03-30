#Author: Daniel Piche - W0084176
#Date: November 10th, 2017
#Five Numbers A4
#PROG1700-Geof Gillespie

#Program Initiation
def InitProg():
    print("Welcome")
    print("-" * 30)

#Input function that returns a list
def GetInput():
    val1 = int(input("Enter value #1: "))
    val2 = int(input("Enter value #2: "))
    val3 = int(input("Enter value #3: "))
    val4 = int(input("Enter value #4: "))
    val5 = int(input("Enter value #5: "))
    print("-" * 30)
    NumList = [val1, val2, val3, val4, val5]
    return NumList
    #print(NumList)

#Function that reverses the list and prints output
def NumInReverse(List):
    print("Numbers in reverse order")
    reversedlist = list(reversed(List))
    for num in reversedlist:
        print(num)
    print("-" * 30)

#Function that calculates the average of the numbers and prints output
def CalcAverage(List):
    sum1 = sum(List)
    avg = sum1 / len(List)
    #StringAvg = str(avg)
    print("The average of the numbers is: {:.1f}".format(avg))
    print("-" * 30)

#Function that computes all the numbers above average and prints the results
def GreaterAvg(List):
    sum1 = sum(List)
    avg = sum1 / len(List)
    print("Numbers greater than the average")
    for num in List:
        if num > avg:
            print(num)



#Section of code that calls the functions
InitProg()
List = GetInput()
NumInReverse(List)
CalcAverage(List)
GreaterAvg(List)