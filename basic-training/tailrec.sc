def sumH(n: Int, f: Int => Int): Int = {
  if (n == 0) 0 else f(n) + sumH(n - 1, f)
}

def sumTailRec(n: Int, f: Int => Int): Int = {
  @scala.annotation.tailrec
  def sumTailRecF(n: Int, f: Int => Int, acc: Int): Int = {
    if (n == 0) acc else sumTailRecF(n - 1, f, f(n) + acc)
  }

  sumTailRecF(n, f, 0)
}

def double = (x: Int) => x * 2
def square = (x: Int) => x * x

sumH(10, double)
sumTailRec(10, double)

sumTailRec(100000, double)
sumH(100000, double)
