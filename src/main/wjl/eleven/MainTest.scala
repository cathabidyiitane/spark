package eleven

/**
  * @author gouyangyang on 2018/9/25/025 13:19
  */

class ClassApplyTest { //类的apply方法调用示例
  def apply(param: String): String = {
    println("apply method called,the paramter is " + param);
    "Hello,world"; //返回值
  }
}


object MainTest {
  def main(args: Array[String]): Unit = {

  }


}
