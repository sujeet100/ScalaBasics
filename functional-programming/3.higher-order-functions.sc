//problem statement: Sum all numbers from 1 to n

//imperative
def sumImperative(num: Int): Int = {
  var sum = 0
  for (i <- 1 to num) {
    sum = sum + i
  }
  sum
}

sumImperative(5)

//recursive
def sumRec(num: Int): Int = {
  if (num == 0) 0 else num + sumRec(num - 1)
}

sumRec(5)


//sum of double of numbers from 1..n
def sumRecDouble(num: Int): Int = {
  if (num == 0) 0 else num * 2 + sumRecDouble(num - 1)
}

sumRecDouble(5)


//sum of square of numbers from 1..n
def sumRecSquare(num: Int): Int = {
  if (num == 0) 0 else num * num + sumRecSquare(num - 1)
}

sumRecSquare(5)

def sum(num: Int, fun: Int => Int): Int = {
  if (num == 0) 0 else fun(num) + sum(num - 1, fun)
}

sum(5, x => x * 2)
sum(5, x => x * x)

//Higher order function are function which either takes function as input or return function as output.
//It provide a way to abstract the part that don't change and take the part that change as function argument.
//Maximize code reusability

