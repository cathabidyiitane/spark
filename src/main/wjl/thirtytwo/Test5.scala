package thirtytwo

/**
  * @author gouyangyang on 2018/10/22/022 21:48
  */
object Test5 {
  def main(args: Array[String]): Unit = {
    val bigData = List("Hadoop", "Spark")
    val data = List(1, 2, 3)
    // List的第一种申明方式
    val bigData_Core = "Hadoop" :: ("Spark" :: Nil)
    val data_Int = 1 :: 2 :: 3 :: Nil
    // List第二种申明方式
    println(data.isEmpty)
    println(data.head)
    println(data.tail.head)
    //调用List的isEmpty、head、tail方法
    val List(a, b) = bigData
    println("a : " + a + " === " + " b: " + b) //a=Hadoop,b=Spark
    val x :: y :: rest = data
    println("x : " + x + " === " + " y: " + y + " === " + rest)
    //   注:其中List的head为第一个值,tail为除head外其他的值List排序
    val shuffledData = List(6, 3, 5, 6, 2, 9, 1)
    println(sortList(shuffledData))

    def sortList(list: List[Int]): List[Int] = list match {
      case List() => List()
      case head :: tail => compute(head, sortList(tail))
    }

    //计算list的值
    def compute(data: Int, dataSet: List[Int]): List[Int] = dataSet match {
      case List() => List(data)
      case head :: tail => if (data <= head) data :: dataSet
      else head :: compute(data, tail)
    }
  }
}
