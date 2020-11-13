package thirtyone

/**
  * @author gouyangyang on 2018/10/22/022 21:10
  */
object Test4 {
  def main(args: Array[String]): Unit = {
    // 虽然 Scala 可以不定义变量的类型，不过为了清楚些，我还是
    // 把他显示的定义上了

    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")

    println(value1) // Some("value1")
    println(value2) // None
  }
}
