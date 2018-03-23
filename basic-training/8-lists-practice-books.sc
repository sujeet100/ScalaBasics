case class Book(name: String, author: String, pages: Int)

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
//TODO
books.find(_.name == "TDD")

