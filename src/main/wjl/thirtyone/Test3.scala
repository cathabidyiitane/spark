package thirtyone

/**
  * @author gouyangyang on 2018/10/22/022 20:52
  *         你可以使用 isEmpty() 方法来检测元组中的元素是否为 None，实例如下：
  */
object Test3 {

  def main(args: Array[String]): Unit = {
    val a:Option[Int] = Some(5)
    val b:Option[Int] = None

    println("a.isEmpty: " + a.isEmpty )
    println("b.isEmpty: " + b.isEmpty )
  }
}
