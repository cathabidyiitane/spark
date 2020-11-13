package thirtytwo

/**
  * @author gouyangyang on 2018/10/22/022 21:34
  *         我们可以使用 List.fill() 方法来创建一个指定重复数量的元素列表：
  */
object Test2 {

  def main(args: Array[String]): Unit = {

    val site = List.fill(3)("Runoob") // 重复 Runoob 3次
    println("site : " + site)

    val num = List.fill(10)(2) // 重复元素 2, 10 次
    println("num : " + num)
  }

}
