/**
  * http://blog.csdn.net/pzw_0612/article/details/47700593
  * Created by gouyangyang on 2018/3/16/016.
  */
object ListBuffer {
  def main(args: Array[String]): Unit = {
    val data = 1 to 20000
    val currntTime = System.currentTimeMillis()
    increase_for(data.toList)
    println("used time=" + (System.currentTimeMillis() - currntTime))
  }
  def increase_for(list: List[Int]): List[Int] = {
    var result = List[Int]()
    for (element <- list) {
      result = result ::: List(element)
    }
    result
  }
}
