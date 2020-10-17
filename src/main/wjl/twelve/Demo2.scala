package twelve

/**
  * @author gouyangyang on 2018/9/26/026 08:58
  */
class A {
  var salary1 = 10000
}

class B extends A {
  var salary2 = 20000
}

class C extends B {
  def show(): Unit = {
    println("salary1 = " + salary1)
    println("salary2 = " + salary2)
  }
}

object Demo2 {
  def main(args: Array[String]): Unit = {
    var c = new C()
    c.show()
  }
}
