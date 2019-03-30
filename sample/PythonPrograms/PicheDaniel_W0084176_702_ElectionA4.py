#Author: Daniel Piche - W0084176
#Date: November 10th, 2017
#Election A4
#PROG1700-Geof Gillespie

#Initiation to program
def InitProg():
    print("Welcome to the Election program")
    print("-" * 30)

#Input to program
def InputToProg():
    #Gets the number of candidates
    count = int(input("Enter the number of candidates in the election!"))
    print("-" * 30)
    num = 1
    CandidateList = []
    VotesList = []
    #Gets the candidates and votes for each candidate and appends to a list
    #Then the list is returned
    while (num <= count):
        Candidate = input("Enter the name of candidate #{} ".format(num))
        Votes = input("Enter the number of votes for candidate #{}: ".format(num))
        print("-" * 30)
        Votes = int(Votes)
        CandidateList.append(Candidate)
        VotesList.append(Votes)
        num = num + 1
    return CandidateList, VotesList, count

#Control Function that prints the formatted results
#This function also calls the percentage, MinValue and MaxValue functions to be used in this function
def PrintResults(CandidateList, VotesList, count):
    percentList = percentage(VotesList, count)
    valueMin = MinValue(VotesList, count)
    valueMax = MaxValue(VotesList, count)
    for i in range(count):
        extra = ""
        if (VotesList[i] == valueMax):
            extra = "<--First Place"
        elif (VotesList[i] == valueMin):
            extra = "<--Last Place-----Ha HA HA"
        print(CandidateList[i], "\t" + "- {:.1f}%    ".format(percentList[i]) + extra)

#Function that computes the percentage of votes for every candidate and appends to a list
def percentage(VotesList, count):
    total = 0
    for i in range(count):
        total += VotesList[i]
    percentList = []
    for i in range(count):
        percentList.append((VotesList[i] / total) * 100)
    return percentList

#Function that computes the Minimum value for candidate votes
def MinValue(VotesList, count):
    valuemin = 9999
    for i in range(count):
        if (VotesList[i]) < valuemin:
            valuemin = VotesList[i]
    return valuemin

#Function that computes the Maximum value for candidate votes
def MaxValue(VotesList, count):
    valuemax = 0
    for i in range(count):
        if (VotesList[i]) > valuemax:
            valuemax = VotesList[i]
    return valuemax

#Block of code used to call the other functions
InitProg()
CandidateList, VotesList, count = InputToProg()
PrintResults(CandidateList, VotesList, count)

