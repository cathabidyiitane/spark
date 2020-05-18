package wj.com.dt.scala.hello

/**
  * Created by gouyangyang on 2018/4/27/027.
  */
object Test2 {

  def main(args: Array[String]): Unit = {
    val arr = "1,2".split(",")
    val a:Int = 1
    println(arr.contains(a))  //false
  }
}
