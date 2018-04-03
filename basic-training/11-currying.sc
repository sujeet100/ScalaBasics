/*
Currying
Curried functions
 */
def add(a: Int, b: Int) = a + b

val incr = add(1, _: Int)
incr(2)

def addC(a: Int)(b: Int) = a + b
addC(1)(2)

val incrC: Int => Int = addC(1)

incrC(2)
incrC(2)

val addTen: Int => Int = addC(10)

addTen(1)

def foo(xs: List[Int], f: Int => Int) = {
  xs.map(x => f(x))
}

foo(List(1, 2, 3), addC(1))

val curriedAdd = (add _).curried
curriedAdd(1)(2)

def wrapWithElement(startTag: String, content: String, endTag: String) = {
  startTag + content + endTag
}

def wrapWithElementC(startTag: String, endTag: String)(content: String) = {
  startTag + content + endTag
}

def div: String => String = wrapWithElementC("<Div>", "</Div>")
def para: String => String = wrapWithElementC("<p>", "</p>")

div("some div content")
para("my para")
