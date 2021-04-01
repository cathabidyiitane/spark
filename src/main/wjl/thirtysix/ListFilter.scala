package thirtysix

/**
  * https://blog.csdn.net/dingyuanpu/article/details/52099205
  * @author gouyangyang on 2019/3/8/008 09:53
  */
object ListFilter {

  def main(args: Array[String]): Unit = {
    //println(List(1, 2, 3, 4, 6).map(_ + 1))
    val data = List("Scala", "Hadoop", "Spark")
    //println(data.map(_.length))
    // mkString:将list 转换成String，分隔符去掉
    println(data.map(_.toList.reverse.mkString))
    println(data.map(_.toList))
    println(data.flatMap(_.toList))
  }
}
