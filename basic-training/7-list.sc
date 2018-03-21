val xs = List(1, 2, 3)
val z = 4 :: xs
xs

xs.isEmpty
xs.head
xs.tail
xs.size

Nil.isEmpty
//Nil.tail
Nil.size

def sum(xs: List[Int]): Int = {
  if (xs.isEmpty) 0 else xs.head + sum(xs.tail)
}

def sum2(xs: List[Int]): Int = {
  xs match {
    case Nil    => 0
    case h :: t => h + sum2(t)
  }
}

def square = (x: Int) => x * x
def incr = (x: Int) => x + 1

def squareAll(xs: List[Int]): List[Int] = {
  xs match {
    case Nil    => Nil
    case h :: t => square(h) :: squareAll(t)
  }

}

def str: Int => String = (x: Int) => x.toString

def foo: Int => List[Int] = (x: Int) => List.range(0, x)

xs.flatMap(foo)

squareAll(xs)
xs.map(square)
xs.map(incr).map(square)
xs.map(_.toString)
sum(xs)
sum2(xs)

xs.foldRight(0)((x, acc) => acc - x)
xs.foldLeft(0)((x, acc) => acc - x)
xs.fold(0)((x, acc) => acc - x)
xs.sum





/*
Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced
 with a single copy of the element.
  The order of the elements should not be changed.

Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */
val s: Symbol = 'a

val x: List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

def compress(xs: List[Char]): List[Char] = {
  xs match {
    case Nil                               => Nil
    case head :: Nil                       => head :: Nil
    case head :: tail if head == tail.head => compress(tail)
    case head :: tail if head != tail.head => head :: compress(tail)
  }
}

compress(x)
