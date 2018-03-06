def sum(a: Int, b: Int) = {
  var sum = 0
  var temp = a
  while (temp <= b) {
    sum += temp
    temp = temp + 1
  }
  sum
}


def double = (x: Int) => x * 2
def square = (x: Int) => x * x


def sumH(a: Int, b: Int, f: Int => Int): Int = {
  if (a > b) 0 else f(a) + sumH(a + 1, b, f)
}


sum(1, 3) // 1, 2, 3 = 6
sumH(1, 3, double)
sumH(1, 3, square)
sumH(1, 3, x => x)

// 2, 4, 6 =  12

//Assignment: sum(n) - 1  to n
