package nineteen
/**
  * @author gouyangyang on 2018/9/26/026 13:56
  */
object Test {
  def main(args: Array[String]): Unit = {
    //    val pattern = "Scala".r
    //    val str = "Scala is Scalable and cool"
    //    println(pattern findFirstIn str)
    //    val pattern = new Regex("(S|s)cala")            //首字母可以是大写 S 或小写 s
    //    val str = "Scala is scalable and cool"
    //    println((pattern findAllIn str).mkString(","))  // 使用逗号 , 连接返回结果
    val pattern = "(S|s)cala".r
    val str = "Scala is scalable and cool"
    println(pattern replaceFirstIn(str, "Java"))
  }
}


