package kxscala.ten

/**
  * https://www.cnblogs.com/HeQiangJava/p/6711527.html
  *
  * 有时候我们在创建类的对象时，指定该对象混入某个trait，就只有这个对象混入该trait的方法,而类的其他对象则没有
  *
  * 为实例混入trait
  *
  * @author gouyangyang on 2018/12/28/028 15:19
  */
trait Logged {

  def log(msg: String) {}
}

trait MyLogger extends Logged {
  override def log(msg: String) {
    println("log: " + msg)
  }

  class Person(val name: String) extends Logged {
    def sayHello: Unit = {
      println("Hi, I'm " + name);
      log("sayHello is invoked!")
    }

    val p1 = new Person("leo")
    p1.sayHello

    val p2 = new Person("jack") with MyLogger
    p2.sayHello

  }

}
