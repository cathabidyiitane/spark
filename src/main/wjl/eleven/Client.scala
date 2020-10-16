package eleven

/**
  *
  * https://blog.csdn.net/bitcarmanlee/article/details/76736252
  * Created by gouyangyang on 2018/9/24/024.
  */
object Client {
  //  def main(args: Array[String]): Unit = {
  //    val foo = Foo("Hello")
  //    print(foo)
  //  }

  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](3)
    arr(0) = 0
    arr(1) = 1
    arr(2) = 2
    arr.foreach(x => print(x + ""))
    println()
    val array = Array(1, 2, 3)
    array.foreach(x => println(x + ""))
  }
}
