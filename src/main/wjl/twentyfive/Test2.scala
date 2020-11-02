package twentyfive

/**
  * @author gouyangyang on 2018/10/12/012 17:05
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)
    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }
    }
  }
  // 样板类
  case class Person(name: String, age: Int)

}
