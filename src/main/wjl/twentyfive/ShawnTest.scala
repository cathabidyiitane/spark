package twentyfive
/**
  * @author gouyangyang on 2018/10/12/012 17:21
  */
object ShawnTest {
  def main(args: Array[String]): Unit = {
    val a = "red"
    a match {
      case "red" =>
        println("stop")
      case "green" =>
        println("go")
      case "yellow" =>
        println("wait")
      case _ =>
        println("unknown sign")
    }
  }
}
