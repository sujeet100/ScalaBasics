// Sum all numbers from 1 to n

//imperative
def sum(n: Int) = {
  var sum = 0
  var temp = n
  while (temp > 0) {
    sum += temp
    temp -= 1
  }
  sum
}

//recursive
def sumRec(n: Int): Int = {
  if (n == 0) 0 else n + sumRec(n - 1)
}

//sum of double of numbers from 1..n
def sumDoubledRec(n: Int): Int = {
  if (n == 0) 0 else (n * 2) + sumDoubledRec(n - 1)
}

//sum of square of numbers from 1..n
def sumSquaredRec(n: Int): Int = {
  if (n == 0) 0 else (n * n) + sumSquaredRec(n - 1)
}


def double = (x: Int) => x * 2
def square = (x: Int) => x * x


def sumH(n: Int, f: Int => Int): Int = {
  if (n == 0) 0 else f(n) + sumH(n - 1, f)
}


sum(3) // 1, 2, 3 = 6
sumRec(3) // 1, 2, 3 = 6

sumH(3, double)
sumH(3, square)

sumDoubledRec(3)
sumSquaredRec(3)

sumH(3, x => x)
sumH(3, x => x * x)
