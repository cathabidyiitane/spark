package thirtytwo

/**
  * @author gouyangyang on 2018/10/22/022 21:35
  *         List.tabulate() 方法是通过给定的函数来创建列表。
  *         方法的第一个参数为元素的数量，可以是二维的，第二个参数为指定的函数，我们通过指定的函数计算结果并返回值插入到列表中，起始值为 0，实例如下：
  */
object Test3 {
  def main(args: Array[String]) {
    // 通过给定的函数创建 5 个元素
    val squares = List.tabulate(6)(n => n * n)
    println("一维 : " + squares)

    // 创建二维列表
    val mul = List.tabulate(4, 5)(_ * _)
    println("多维 : " + mul)
  }
}
