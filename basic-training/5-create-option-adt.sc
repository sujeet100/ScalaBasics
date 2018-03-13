sealed trait MyOption[+T]

case class MySome[+T](value: T) extends MyOption[T]

case object MyNone extends MyOption[Nothing]


val x: MyOption[Int] = MySome(10)
val y: MyOption[Int] = MyNone

def square(x: MyOption[Int]) = x match {
  case MySome(v) => MySome(v * v)
  case MyNone    => MyNone
}

square(x)
square(y)

val a: Option[Int] = Some(1)
val b = Option(1)

def square = (x: Int) => x * x
a.map(_ + 2)
