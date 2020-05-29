//1 style
def add(a: Int, b: Int) = a + b

//function literal
val add2 = (a: Int, b: Int) => a + b


def add3 = new Function2[Int, Int, Int] {
  override def apply(v1: Int, v2: Int) = v1 + v2
}

add(1, 2)
add2(1, 2)
add3(1, 2)

// Side effects
var x = 0
def foo(n: Int) = {
  x = 1
  n + 1
}
foo(1)
x = 3
foo(1)


//Side effects 2
def bar() = {
  println("")
  1
}
