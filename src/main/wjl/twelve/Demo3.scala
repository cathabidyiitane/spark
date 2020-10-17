package twelve

/**
  * Scala方法重载
  * @author gouyangyang on 2018/9/26/026 09:03
  */
class Arithmetic {
  def add(a: Int, b: Int): Unit = {
    var sum = a + b
    println(sum)
  }

  def add(a: Int, b: Int, c: Int): Unit = {
    var sum = a + b + c
    println(sum)
  }
}


object Demo3 {
  def main(args: Array[String]): Unit = {
    var a = new Arithmetic()
    a.add(10, 20)
    a.add(10, 20, 30)
  }
}
