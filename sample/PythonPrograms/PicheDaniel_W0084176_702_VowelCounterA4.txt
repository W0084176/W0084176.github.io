#Author: Daniel Piche - W0084176
#Date: November 10th, 2017
#Vowel Counter A4
#PROG1700-Geof Gillespie

#Program Initialization Function
def InitProg():
    print("Welcome")
    print("-" * 30)

#Function that gets a phrase as input
def InputProg():
    phrase = input("Type a phrase (or quit to exit the program): ")
    phrase = phrase.upper()
    return phrase

#Function that counts and prints the amount of vowels in a phrase
def LetterCount(Phrase):
    print("Letter A Count: {}".format(Phrase.count("A")))
    print("Letter E Count: {}".format(Phrase.count("E")))
    print("Letter I Count: {}".format(Phrase.count("I")))
    print("Letter O Count: {}".format(Phrase.count("O")))
    print("Letter U Count: {}".format(Phrase.count("U")))

#Function that asks users to enter a phrase until they enter quit
def ControlFunction():
    InitProg()
    Phrase = InputProg()
    while (Phrase != "QUIT"):
        LetterCount(Phrase)
        Phrase = InputProg()

#Section that calls the control function
ControlFunction()