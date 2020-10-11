package five

import scala.Array._

/**
  * 创建区间数组
  * Created by gouyangyang on 2018/9/20/020.
  */
object Test4 {

  def main(args: Array[String]): Unit = {
    var myList1 = range(10, 20, 1)
    var myList2 = range(10, 20)

    // 输出所有数组元素
    for (x <- myList1) {
      println(" " + x)
    }

    for (x <- myList2) {
      print(" " + x)
    }
  }
}
