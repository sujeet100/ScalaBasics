def sumH(f: Int => Int)(n: Int): Int = {
  if (n == 0) 0 else f(n) + sumH(f)(n - 1)
}

def double = (x: Int) => x * 2
def square = (x: Int) => x * x

val sumSquared: Int => Int = sumH(square)
sumSquared(4)
sumSquared(3)

val sumDoubled: Int => Int = sumH(double)
sumDoubled(3)
sumDoubled(4)

val sumSquareAndDoubled: Int => Int = sumH(square andThen double)
sumSquareAndDoubled(3)
sumSquareAndDoubled(4)
