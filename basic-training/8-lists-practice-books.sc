case class Book(name: String, author: String, pages: Int)

object Book {
  implicit def orderingByPages[A <: Book]: Ordering[A] =
    Ordering.by(b => b.pages)
}

val books = List[Book](
  Book("Clean Code", "Bob", 100),
  Book("Refactoring", "Martin", 300),
  Book("Extreme Programming", "Bob", 200),
  Book("TDD", "Kent", 250)
)

//return all the books written by Author: Bob
books.filter(_.author == "Bob")

//return the book names of the books written by Author: Bob
books.filter(_.author == "Bob").map(_.name)

//return the book names in lower case
// of the books written by Author: Bob
books
  .filter(_.author == "Bob")
  .map(_.name)
  .map(_.toLowerCase)

//return total number of pages written by Bob
books
  .filter(_.author == "Bob")
  .map(_.pages)
  .foldLeft(0)((acc, b) => acc + b)

//return a book with name TDD
books.find(_.name == "TDD")

//return number of pages of book with name TDD
books.find(_.name == "TDD") match {
  case Some(b) => b.pages
  case None    => None
}
books.find(_.name == "TDD").map(_.pages)

// return only two books with at least 100 pages
books.filter(_.pages >= 100).take(2)

// return distinct names of all the authors
books.map(_.author).distinct

// if any book is written by "Bob"
books.exists(_.author == "Bob")

// if every book has at least 50 pages
books.forall(_.pages >= 50)

// return comma separated book names as a string
books.map(_.name).mkString(",")
//or
books
  .map(_.name)
  .foldLeft("")((acc, x) => acc + ", " + x)
  .replaceFirst(", ", "")

//or
books
  .map(_.name)
  .reduce((acc, x) => acc + ", " + x)

// return total number of pages of all books
books.map(_.pages).sum

// which book has maximum number of pages
books.reduce((a, b) => if (a.pages > b.pages) a else b)
//or
books.maxBy(_.pages)
books.max
