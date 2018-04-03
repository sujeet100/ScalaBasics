def add(a: Int, b: Int) = a + b

add(10, 2)
add(10, 3)
add(10, 4)

val tenAdder = add(10, _: Int)

tenAdder(2)
tenAdder(3)
tenAdder(4)

val incr = add(1, _: Int)

incr(1)
incr(2)

def wrapWithElement(startTag: String, content: String, endTag: String) = {
  startTag + content + endTag
}

wrapWithElement("<Div>", "my content", "</Div>")
wrapWithElement("<p>", "my para content", "</p>")

val div = wrapWithElement("<Div>", _: String, "</Div>")
val para = wrapWithElement("<p>", _: String, "</p>")

div("foo")
div("bar")
para("para content")
para("para content2")

def power(base: Int, expo: Int) = Math.pow(base, expo)
power(1, 2)
power(2, 2)
power(2, 3)

val square = power(_: Int, 2)
square(2)
square(3)

val cube = power(_: Int, 3)
cube(0+2)
