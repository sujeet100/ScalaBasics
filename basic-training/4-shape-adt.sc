sealed trait Shape {
  def area: Double = {
    this match {
      case Square(a)       => a * a
      case Rectangle(l, b) => l * b
      case Circle(r)       => Math.PI * r * r
      case Triangle(b, h)  => h * b / 2
    }
  }

  def circumference = {
    this match {
      case Square(a)       => 4D * a
      case Rectangle(l, b) => 2D * (l + b)
      case Circle(r)       => 2 * Math.PI * r
      case Triangle(b, h)  => 3D * b
    }
  }
}

case class Square(a: Int) extends Shape

case class Circle(r: Int) extends Shape

case class Rectangle(l: Int, b: Int) extends Shape

case class Triangle(b: Int, h: Int) extends Shape

Square(2).area
Circle(2).area
val rectangle = Rectangle(2, 4)
rectangle.area

Rectangle.unapply(rectangle)

rectangle match {
  case Rectangle(l, b) => l + b
}

/*
//sujeet

case class Email(name, domain, sub) = {

}

object Email {
  def unapply(arg: String): Option[(String, String, String)] = {

  }
}

"sujeet@gmail.com" match {
  case Email() =>
}
*/
