trait Shape {
  def area: Double

  def circumference: Double
}

case class Square(a: Int) extends Shape {
  override def area: Double = {
    a * a
  }

  override def circumference = 4 * a
}

case class Circle(r: Int) extends Shape {
  override def area = Math.PI * r * r

  override def circumference = 2 * Math.PI * r
}

case class Rectangle(l: Int, b: Int) extends Shape {
  override def area = l * b

  override def circumference = 2 * (l + b)
}

case class Triangle(b: Int, h: Int) extends Shape {
  override def area = {
    b * h / 2
  }

  override def circumference = 3 * b
}

Square(2).area
Circle(2).area
Rectangle(2, 4).area

Square(2).circumference
Circle(2).circumference
Rectangle(2, 4).circumference
