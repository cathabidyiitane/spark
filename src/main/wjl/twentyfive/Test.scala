package twentyfive

/**
  * @author gouyangyang on 2018/10/12/012 17:03
  */
object Test {
  def main(args: Array[String]): Unit = {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }
}
