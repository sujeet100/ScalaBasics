def double = (x: Int) => x * 2
def square = (x: Int) => x * x

val doubleThenSquare: Int => Int = double andThen square
doubleThenSquare(3)

val squareAndDouble = double compose square
squareAndDouble(3)
