package kxscala.ten


/**
  * https://www.cnblogs.com/HeQiangJava/p/6711527.html
  * 在Trait中定义具体方法
  *
  * @author gouyangyang on 2018/12/28/028 11:38
  */
trait Logger {
  def log(message: String) = println(message)

  class Person(val name: String) extends Logger {
    def makeFriends(p: Person): Unit = {
      println("Hi, I'm " + name + ", I'm glad to make friends with you, " + p.name)
      log("makeFriends methdo is invoked with parameter Person[name=" + p.name + "]")
    }
  }

}