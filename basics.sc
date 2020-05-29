def add(a: Int, b: Int) = a + b
val add2: (Int, Int) => Int = (a: Int, b: Int) => a + b

add(1, 2)



def sum(n: Int): Int = {
  var temp = n;
  var sum = 0
  while (temp > 0) {
    sum = sum + temp
    temp -= 1
  }
  sum
}

def sumF(n: Int): Int = {
  if (n == 0) n else n + sumF(n - 1)
}

val double = (n: Int) => 2 * n
val square = (n: Int) => n * n


def sum2(n: Int, f: Int => Int): Int = {
  if (n == 0) n else f(n) + sum2(n - 1, f)
}


sumF(10)
sumF(3)

sum(10)
sum(3)

sum2(10, double)
sum2(3, double)
