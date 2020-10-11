package five

import scala.Array._

/**
  * 合并数据
  * Created by gouyangyang on 2018/9/20/020.
  */
object Test3 {

  def main(args: Array[String]): Unit = {


    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 = concat(myList1, myList2)


    // 输出所有数据元素
    for (x <- myList3) {
      println(x)
    }
  }
}
