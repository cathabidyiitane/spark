package nineteen

/**
  * https://blog.csdn.net/qq_32023541/article/details/79549770
  * 序列模式
  *
  * @author gouyangyang on 2018/9/26/026 15:53
  */
object ScalaExample3 {
  val arrInt = Array(1, 2, 3, 4)

  def patternMatching(x: AnyRef) = x match {
    //序列模式，与构建序列的作用相反，用于对序列中的元素内容进行析取
    case Array(first, second) => println(s"序列中第一个元素=$first,第二个元素=$second")
    //first,second 分别匹配序列中的第一、二个元素，_* 匹配序列中剩余其他元素
    case Array(first, _, three, _*) => println(s"序列中第一个元素=$first，第三个元素=$three")
    case _ =>
  }

  patternMatching(arrInt)
}
