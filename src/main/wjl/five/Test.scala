package five
/**
  * Created by gouyangyang on 2018/9/20/020.
  */
object Test {
  def main(args: Array[String]): Unit = {
    // 输出所有数组元素
    val myList = Array(1.9, 2.9, 3.4, 3.5)
    for (list <- myList) {
      println(list)
    }
    // 计算所有数组元素
    var total = 0.0;
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i)
    }
    println("总和为 " + total)

    // 查找数据中最大的元素
    var max = myList(0)
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i)
    }
    println("最大值为" + max)
  }
}
