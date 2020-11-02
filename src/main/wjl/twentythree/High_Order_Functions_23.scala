package twentythree

/**
  * https://blog.csdn.net/KongMingJue/article/details/77045173
  * Scala高阶函数实战详解
  * @author gouyangyang on 2018/10/12/012 13:59
  */
object High_Order_Functions_23 {
  def main(args: Array[String]): Unit = {
    //7
    (1 to 9).map("*" * _).foreach {
      println _
    } //1是对象 to是方法 1 to 9是一个集合 1,2,3,4...
    print()
    (1 to 9).filter(_ % 2 == 0).foreach(println) //过滤出集合中的偶数
    println
    println((1 to 9).reduceLeft(_ * _)) // 1*2*3*...*9
    println
    "Spark is the most exciting thing happening in big data today".split(" ").sortWith(_.length < _.length).foreach(println) //按单词的长度升序排列 }}
  }
}
