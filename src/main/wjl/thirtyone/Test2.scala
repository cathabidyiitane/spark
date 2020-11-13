package thirtyone

/**
  * @author gouyangyang on 2018/10/22/022 20:50
  *  你可以使用 getOrElse() 方法来获取元组中存在的元素或者使用其默认的值，实例如下：
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None
    println("a.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(10): " + b.getOrElse(10))
  }
}
