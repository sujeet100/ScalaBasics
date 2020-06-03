//Pure function evaluates to the same output for given set of inputs.
//A function evaluate the result purely based on the input and did not depends on any other variable or value or environments.
//No side-effects

def add(num1: Int, num2: Int): Int = {
  num1 + num2
}

var x = 10
def addX(num: Int) = {
  x + num
}

addX(5)
x= 5

addX(5)

//A function has a side effect if it does something other than simply return a result.
//Example: account balance-100
//debit(60) -> account balance-40
//debit(60) -> transaction declined

//Examples of side effects:
//Modifying a variable, Printing to the console or reading user input, reading from or writing to a file, Updating database, throwing an excepton or halting with an error etc.

//Advantage pure function/not having side effects
//testable, reuse, generalize and much less prone to bugs

//In functional programming it is often recommended to developed as many pure function as possible
//Functional programming puts restrictions on how we structure our programs and not what our programs can express.
//We structure our side effects at right places instead of putting them all over codebase.
