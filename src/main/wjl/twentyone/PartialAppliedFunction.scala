package twentyone

/**
  * 偏函数
  * 当函数有多个参数，而在使用该函数时不想提供所有参数(比如函数有三个参数)，只提供0到2个参数，此时得到的函数应该是偏函数
  * @author gouyangyang on 2018/10/12/012 09:59
  */
object PartialAppliedFunction {

  def main(args: Array[String]): Unit = {
    println("偏函数1......")
    val data = List(1, 2, 3, 4, 5, 6)
//    data.foreach(println _)
//    data.foreach(x => println(x))
//    data.foreach(println)

    def sum(a: Int, b: Int, c: Int): Unit = {
      println(sum(1, 2, 3))
      println("偏函数2......")
      val fa = sum _
      println(fa(2, 3, 4))
      println(fa.apply(3, 3, 4))
      println("偏函数......")
      val fb = sum(1, 2, _: Int)
      println(fb(6))
    }
  }
}
