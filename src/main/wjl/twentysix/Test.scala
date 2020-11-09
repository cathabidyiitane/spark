package twentysix

/**
  * @author gouyangyang on 2018/10/12/012 17:00
  */
object Test {
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def main(args: Array[String]): Unit = {
    println(matchTest(1))
  }
}
