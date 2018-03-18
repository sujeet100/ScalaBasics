case class Phone(brand: String,
                 name: String,
                 extMemory: Option[Int]) {

  def addMemory(memory: Int) = {
    def f = (n: Int) => Some(n + 10)
    val newMemory = extMemory.flatMap(f)

    copy(extMemory = newMemory)
  }

  def isGreater32GB = {
    extMemory match {
      case None    => false
      case Some(m) => m > 32
    }
  }
}

val nexus = Phone("LG", "Nexus5", Some(32))
val nokia = Phone("Nokia", "1100", None)

val nexusWith128GB = nexus.addMemory(32)

nokia.addMemory(12)

nexus.isGreater32GB
nokia.isGreater32GB
nexusWith128GB.isGreater32GB

nokia.extMemory.getOrElse(0)
nexus.extMemory.getOrElse(0)

