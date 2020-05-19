package wj.com.dt.scala.hello

/**
  * Created by gouyangyang on 2018/4/28/028.
  */
object Slice2 {
  def main(args: Array[String]): Unit = {
    val nums = List(1,2,3,4,5,6,7,8,9)
    val sliced = nums.slice(1,8)  //List(3,4)
    println(sliced)
  }
}
