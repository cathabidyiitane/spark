package wj.com.dt.scala.hello
/**
  * Created by gouyangyang on 2018/4/28/028.
  */
object FilterDemo2 {

  def main(args: Array[String]): Unit = {
    val colors1 = Set("Blue", "Green", "Red", "yellow")
    val filteredSet = colors1 filter(_ contains "1")
    println(filteredSet mkString ",")
  }
}
