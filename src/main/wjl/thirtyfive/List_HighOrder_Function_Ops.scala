package thirtyfive

/**
  * @author gouyangyang on 2019/3/5/005 16:09
  *
  * List的map、flatMap、foreach、filter操作代码实战
  * map:作用于集合中每个元素 在组合成一个新的集合
  * flatMap 将所有元素集合中 的元素合并为一个集合  e.g {List(1, 2),List(2, 3) ...} => List(1, 2, 2, 3)
  * foreach 迭代每个元素 返回一个无返回值的函数操作 比如常用的遍历 foreach(println)
  * filter 过滤出符合提交的元素 在组合成一个新的集合  参数是一个 返回值为Boolean类型的函数
  */
object List_HighOrder_Function_Ops {

  def main(args: Array[String]): Unit = {
    // 等价于 List(1, 2, 3, 4, 6).map
    println(List(1,2,3,4,6).map(_+1))
    val data = List("Scala", "Hadoop", "Spark")
    println(data map(_.length))
    println(data map (_.toList.reverse.mkString))
  }
}
