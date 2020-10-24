package nineteen

/**
  * 元组模式
  * https://blog.csdn.net/qq_32023541/article/details/79549770
  *
  * @author gouyangyang on 2018/9/26/026 16:19
  */
object ScalaExample5 {
  //定义一个元组
  val tupleInt = (1, 2, 3, 4)

  def patternMatching(x: AnyRef) = x match {
    //元组模式，匹配两个元素的元组
    case (first, second) => println(s"元组中第一个元素=$first,第二个元素=$second")
    //first,three 分别匹配元组中第一、三个元素
    case (first, _, three, _) => println(s"元组中第一个元素=$first,第三个元素=$three")
    //元组模式中不能用 _* 的匹配模式
    //case(first,_,three,_*) =>  错误
    case _ =>
  }

  patternMatching(tupleInt)
}
