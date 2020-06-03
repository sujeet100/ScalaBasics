//filter
case class Fruit(name: String)

val apple = Fruit("apple")
val orange = Fruit("orange")
val kiwi = Fruit("kiwi")

val fruitBasket = List(apple, apple, orange, orange, kiwi, apple, orange, kiwi, apple)

val apples = for (fruit <- fruitBasket if fruit.name == "apple") yield fruit
val ornage = for (fruit <- fruitBasket if fruit.name == "orange") yield fruit

def getFruit(fn: Fruit => Boolean): List[Fruit] = {
  for (fruit <- fruitBasket if fn(fruit)) yield fruit
}

getFruit(fruit => fruit.name == "apple")

fruitBasket.filter(fruit => fruit.name == "apple")

//map
val list = List(1, 2, 3, 4)

list.map(value => value * 2)