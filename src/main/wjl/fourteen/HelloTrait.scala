package fourteen

/**
  * https://www.cnblogs.com/HeQiangJava/p/6711527.html
  *
  * scala 的Triat是一种特殊的概念
  * 首先我们可以将Triat作为接口来使用，此时的Triat就像java中的接口非常类似
  * 在triat中可以定义抽象方法，就像抽象类中的抽象方法一样，只要不给出方法的具体实现即可
  * 类可以使用extends关键字继承trait，注意，这里不是implement，而是extends,在scala中没有implement的概念，无论继承类还是trait，统一都是extends
  * 类继承triat后，必须实现其中的抽象方法，实现时不需要使用override 关键字
  * scala不支持对类进行对继承，但是支持多重继承trait，使用with关键字即可
  *
  * @author gouyangyang on 2018/9/26/026 10:11
  */
trait HelloTrait {
  def sayHello(name: String)
}

trait MakeFriendsTrait {
  def makeFriends(p: Person)
}

class Person(val name: String) extends HelloTrait with MakeFriendsTrait with Cloneable with Serializable {
  def sayHello(name: String) = println("Hello," + name)

  def makeFriends(p: Person) = println("Hello, my name is \" + name + \", your name is " + name)
}


// 在Trait 中定义具体方法
// scala 中的Trait可以不是只定义抽象方法，还可以定义具体方法，此时trait更像是包含了通用工具方法的东西
// 有一个转有的名词来形容这种情况，就是说trait混入了类
// 举例子来说 Trait中可以包含一些很多类都通用的功能方法，比如打印日志等等，spark中就使用了trait来定义了通用的日志打印方法

trait Logger {
  def log(message: String): Unit = {
    println(message)
  }

  //  class Person(val name: String) extends Logger {
  //    def makeFriends(p: Person): Unit = {
  //      println("Hi, I'm " + name + ", I'm glad to make friends with you, " + p.name)
  //      log("makeFriends methdo is invoked with parameter Person[name=" + p.name + "]")
  //    }
}

// 在Trait 中定义具体字段
// scala 中的Triat可以定义具体的field，此时继承trait的类自动获得了trait 中定义的field
// 但是这种获取field的方式与继承class是不同的，如果是继承class获取的field,实际是定义在父类中的；而继承trait获取的field，就直接被添加到了类中
trait Person {
  val eyeNum: Int = 2
}


class Student(val name: String) extends Person {
  def sayHello = println("Hi, I'm " + name + ", I have " + eyeNum + " eyes.")
}

}



