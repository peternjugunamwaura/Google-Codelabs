# Notes about Classes in Kotlin
A class is a blueprint plan that is followed by objects. For example in the Dice Roller project, there is need to create a class of Dice. This class would be the blueprint of all dices and from it, one can easily create an object. Therefore objects are just instances of a class.

Tip: A class is similar to how an architect's blueprint plans are not the house; they are the instructions of how to build the house. The house is the actual thing, or object instance, created according to the blueprint.

Note: Organizing everything about dice into a class is called encapsulation. Encapsulation is a big fancy word, but all it means is that you can enclose functionality that is logically related into a single place.

To define a class in Kotlin, Use the class keyword. For example:-

```
class Dice
{
  //add member functions here as well as member variables
  var sides = 6;
}
```
You can choose any name for a class, but it is helpful if the name indicates what the class represents. By convention, the class name is written in Upper Camel Case (also called Pascal Casing). For example: Car, ParkingMeter, and CustomerRecord are all valid class names, and you can guess at what they represents.

## creating objects
To create an object instance of Dice, in the main() function, create a val called myFirstDice and initialize it as an instance of the Dice class. Notice the parentheses after the class name, which denote that you are creating a new object instance from the class. For example

```
fun main()
{
    var myfirstDice = Dice()
}
```
To access the properties of the Dice class, use the dot notation using the obeject created. In this case, the object is named myfirstDice, hence to obtain the properties of the dice class use. object name dot property. The dice class has a Property of sides. To access this we would use.
```
var sides = myfirstDice.sides
//print the sides
println(sides)
```
The complete code for the Dice class and the firstDice instance should be
```
fun main() {
    val myFirstDice = Dice()
    println(myFirstDice.sides)
}

class Dice {
    var sides = 6
}
```
To make the Dice roll we need to add a function of roll. For example.To declare a function in kotlin, use the fun keyword.

```
class Dice {
    var sides = 6
    fun roll()
    {
        var randomnumber = (1..6).random()
        println(randomNumber)
    }
}
```
## Specyfing the function return type
The syntax for specifying the return type is: After the name of the function, after the parentheses, add a colon, space, and then the Int keyword for the return type of the function. The function definition should look like the code below.
For example
```
fun roll(): Int
{
    
    var randomnumber = (1..6).random()
    return ransomnumber
}
```
### Summary
- Call the random() function on an IntRange to generate a random number: (1..6).random()
- Classes are like a blueprint of an object. They can have properties and behaviors, implemented as variables and functions.
- An instance of a class represents an object, often a physical object, such as a dice. You can call the actions on the object and change its attributes.
- You can supply values to a class when you create an instance. For example: class Dice(val numSides: Int) and then create an instance with Dice(6).
- Functions can return something. Specify the data type to be returned in the function definition, and use a return statement in the function body to return something. For example: fun example(): Int { return 5 }
