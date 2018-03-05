def add(a: Int, b: Int) = a + b

def add2 = (a: Int, b: Int) => a + b


def add3 = new Function2[Int, Int, Int] {
  override def apply(v1: Int, v2: Int) = v1 + v2
}

add(1, 2)
add2(1, 2)
add3(1, 2)
