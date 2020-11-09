package twentyseven

/**
  * @author gouyangyang on 2018/10/12/012 17:55
  */
object Pattern_Match_More {

  def main(args: Array[String]): Unit = {
    /**
      * 通过模式匹配判断参数的类型
      *
      * @param t
      * @return
      */
    def match_type(t: Any) = t match {
      case p: Int => println("It is Integer") //这里的p变量 val p: Int  t会赋值给变量p
      case p: String => println("It is String, the content is " + p)
      case m: Map[_, _] => m.foreach(println) //val m: Map[_, _]
      case _ => println("Unknow type!!!")
    }

    match_type(2) // It is Intege
    match_type("Spark") //It is String, the content is Spark
    match_type(Map("Scala" -> "Spark")) //(Scala,Spark)
    match_type(Map("Scala" -> "Spark")) //(Scala,Spark)

    /**
      * 模式匹配数组
      */
    def match_array(arr: Any) = arr match {
      case Array(0) => println("Array" + "0")
      case Array(x, y) => println("Array" + x + " " + y) //匹配有两个元素的数组
      case Array(0, _*) => println("Array" + "0 ...") //匹配至少是1个元素，并且第一个元素为0的数组  _*表示后面有许多元素
      case _ => println("something else")
    }

    match_array(Array(0)) //Array0
    match_array(Array(0, 1)) //Array0 1
    match_array(Array(0, 1, 2, 3, 4, 5, 6)) //Array0 ...
  }
}
