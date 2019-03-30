__author__ = 'w0272301'

#Tell Python we want to use these two external code libraries.
import turtle, random

#Custom function for turning the lines random colors
#Uses a list of colors and grabs a random index value
def GetRandomColor():
    listOfColors = ["red", "yellow", "blue", "green", "pink", "purple", "orange", "black", "cyan", "magenta"]
    return listOfColors[random.randint(0, len(listOfColors) - 1)]

#Create a turtle object named Bob, so we can use some built-in turtle code functionality
bob = turtle.Turtle()

#Configure some basic values
bob.speed(9)
bob.pensize(1)
bob.shape("turtle")

#Move starting point up and left a bit
bob.penup()
bob.goto(-200, 400)
bob.pendown()

#Set variables
DEGREES_IN_CIRCLE = 360
numberOfSides = 12
length = 300
angle = DEGREES_IN_CIRCLE / numberOfSides

#Nested Loops to draw patterns.
#Exterior loop
for outer in range(numberOfSides):
    bob.forward(length)
    bob.right(angle)
    bob.pencolor(GetRandomColor())  #<---- Call to our GetRandomColor function

    #First nested interior loop
    for inner in range(numberOfSides):
        bob.forward(length / 2)
        bob.right(angle)

        #Second nested interior loop
        for farInner in range(numberOfSides):
            bob.forward(length / 4)
            bob.right(angle)

            #Third nested interior loop
            for reallyFarInner in range(numberOfSides):
                bob.forward(length / 8)
                bob.right(angle)

#Line at end of program to make the graphics windows stay open (REQUIRED)
turtle.done()
