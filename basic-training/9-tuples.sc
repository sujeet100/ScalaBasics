import java.util.Date

val x = Tuple1(1)
x._1

val weight1: Tuple2[Int, String] = Tuple2(2, "KG")
val weight2: (Int, String) = (3, "KG")
val weight3 = (2, "KG")
val weightQuantity = weight3._1
val weightUnit = weight3._2

val (wQuantity, _) = weight1

weight1 == weight2

val week = (new Date(), new Date())
val (start, _) = week

val z = List(weight1, weight2)
val wQuantities = z.map(_._1)

weight1 match {
  case (1, "KG") => "1000 Gms"
  case (q, u)    => s"$q $u"
}

def getWeatherStats(city: String) = {
  (26, 10)
}

val (temp, humidity) = getWeatherStats("Pune")

def swap(x: Int, y: Int) = (y, x)
swap(10, 20)