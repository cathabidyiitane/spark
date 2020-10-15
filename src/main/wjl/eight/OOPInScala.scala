package eight

/**
  * Created by gouyangyang on 2018/9/21/021.
  */
//class Teacher {
//  var name: String = _
//  private var age = 27
//  private[this] val gender = "male"
//
//  def this(name: String) {
//    this
//    this.name = name
//  }
//
//  def sayHello() {
//    println(this.name + ":" + this.age + " : " + this.gender)
//  }
//}

class Teacher private(val name: String, val age: Int) {
  println("This is the primary constructor!!!")
  var gender: String = _
  println(gender)

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }
}

class Outer(val name: String) {
  outer =>

  class Inner(val name: String) {
    def foo(b: Inner) = println("Outer: " + outer.name +
      " Inner: " + b.name)
  }

}

object OOPInScala {
  def main(args: Array[String]): Unit = {
    val outer1 = new Outer("Spark");
    val outer2 = new Outer("Hadoop");
    val inner1 = new outer1.Inner("Scala")
    val inner2 = new outer1.Inner("Java")
    inner1.foo(inner1)
    inner1.foo(inner2)
  }
}
