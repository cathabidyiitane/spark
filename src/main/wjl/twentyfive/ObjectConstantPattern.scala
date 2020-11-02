package twentyfive

/**
  * @author gouyangyang on 2018/10/12/012 17:12
  */
object ObjectConstantPattern {
  def main(args: Array[String]): Unit = {
    //模式匹配结果作为函数返回值
    def patternShow(x: Any) = x match {
      case 5 => "五"
      case true => "真"
      case "test" => "字符串"
      case null => "null值"
      case Nil => "空列表"
      case _ => "其他常量"
    }

    println(patternShow(5))
    println(patternShow(true))
    println(patternShow(List()))
  }
}
