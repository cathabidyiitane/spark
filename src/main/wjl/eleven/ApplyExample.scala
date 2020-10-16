package eleven

/**
  * @author gouyangyang on 2018/9/25/025 13:26
  * https://www.jb51.net/article/114632.htm
  */
class ApplyTest {

  def apply() {
    println("This is a class,apply()...")
  }
}

object ApplyTest {
  def apply(): Unit = {
    println("This is an object, apply()...")
    new ApplyTest()
  }
}


object ApplyExample {
  def main(args: Array[String]): Unit = {
    var at=ApplyTest()
//    at()
  }
}
