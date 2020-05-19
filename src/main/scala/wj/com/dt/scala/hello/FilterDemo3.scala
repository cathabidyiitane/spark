package wj.com.dt.scala.hello

/**
  * Created by gouyangyang on 2018/4/28/028.
  */
object FilterDemo3 {

  def main(args: Array[String]): Unit = {
    val colors1 = Set("Blue", "Green", "Red", "yellow")
    val colors2 = Set("White", "Black")
    val combinedSet = colors1 ++ colors2
    println(combinedSet mkString ",")
  }
}
