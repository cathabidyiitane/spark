package six

/**
  * 在这一讲我们将分享 Map ,Tuple 以及 Zip 操作
  * Map 本身是映射，在生活中应用也非常广泛
  * Tuple 也是scala中非常重要的数据结构，我们使用tuple可以把很多类型不一样的元素组成一个集合
  * Zip 把两个集合中的元素结合
  * Created by gouyangyang on 2018/9/20/020.
  */
object Map_Tuple2 {
  def main(args: Array[String]): Unit = {
    val map = Map("book" -> 10, "gun" -> 18, "ipad" -> 1000) // 默认的情况下是不可变得Map 即：immutable.Map
    for ((k, v) <- map) yield (k, v * 0.9) //把Map中三个元素分别映射到 k,v

    // 下面是可变的Map
    val scres = scala.collection.mutable.Map("scala" -> 7, "Hadoop" -> 8, "Spark" -> 10)
    val hadoopScore = scres.getOrElse("Hadoop", 0) //getOrElse() 如果没有“Hadoop” 就会返回 0，如果有就返回Hadoop的键值 8
    scres += ("R" -> 9) //增加键值对
    scres -= "Hadoop" //删除键值对
    val sortedScore = scala.collection.immutable.SortedMap("scala" -> 7, "Hadoop" -> 8, "Spark" -> 10) //对词典进行排序

    // 元组操作
    val tuple = (1, 2, 3.14, "Rocky", "spark") //可以把不同的类型作为集合的记录
    val third = tuple._3 //返回第三个元素
    //println (third)
    val (first, second, thirda, fourth, fifth) = tuple // 可以tuple元组的值赋值给元组，他们分别对应比如：first 对应 1 。。。。。
    val (f, s, _, _, _) = tuple //如果我们不需要这么多值可以用下划线_做为占位符， 但占位符是必要的
    println(s)

    // Zip操作
    val symbols = Array("[", "-", "]") //> symbols  : Array[String] = Array([, -, ])
    val counts = Array(2, 5, 2) //> counts  : Array[Int] = Array(2, 5, 2)
    val pairs = symbols.zip(counts) //> pairs  : Array[(String, Int)] = Array(([,2), (-,5), (],2))
  }
}
