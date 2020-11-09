package twentynine

import org.apache.hadoop.yarn.webapp.ResponseInfo.Item

/**
  * https://blog.csdn.net/qq_38063522/article/details/80932386
  * @author gouyangyang on 2018/10/18/018 16:38
  *         Scala中没有静态修饰符static，所以object全部都是静态的。对象可以和类一样的名字，如果在某一各类中声明了与该类相同的名字，则称该object为该类的“伴生对象”。类和伴生对象可以相互访问他们的似有属性，但是它们必须在一个源文件当中。类只会被编译，不会被执行。要执行，必须在Object中
  *         class 和 object 区别
  *         单例对象可以不能带参数，类可以
  *         Case class
  *         case class被成为样例类，是一种特殊的类，他们经过优化被用于模式匹配
  *         作用：1. 用于消息的传递  2.用于模式匹配
  *         区别：1. 初始化的时候可以不用new，但是普通类必须加new
  * 2.默认实现了equals、hashCode方法、
  *
  * 3. 默认是可以序列化的，实现了Serializable
  *
  * 4.case class 构造函数参数是public的，我们可以直接访问
  *
  * 5. case class默认情况下不能修改属性值
  *
  * 5. 最重要的功能，支持模式匹配，这也是定义case class的重要原因
  *         *
  *         val person  = Person("Li Ming",16)
  *         person match {
  *         case Person(name,_) => println....
  *         case + => ....... }
  *         Case object
  *         case object 和 case class没有什么很大差别
  *         可以這么总结一句话，当Person有参数的时候，用case class ，当Person没有参数的时候那么用case object。這一样意义在于区分 有参和无参
  */

//abstract class Person
//case class Student(age: Int) extends Person //默认val，所以特别适合于消息之间的传递
//case class Worker(age: Int, salary: Double) extends Person
//case object Shared extends Person
//object Case_class_object_29 {
//  def main(args: Array[String]): Unit = {
//    //这里会从person中汲取出 age并复制给 Student.age
//    def caseOps(person: Person) = person match {
//      case Student(age) => println("I am " + age + " years old!")
//      case Worker(_, salary) => println("Wow, I got " + salary + "salary")
//      case Shared => println("No property")
//    }
//    caseOps(Student(19))
//    caseOps(Shared)
//    val worker = Worker(10, 1000.2)
//    val worker2 = worker.copy(salary = 10)
//    def recursiveCase(item: Item) = item match {
//      case Bundle(_, _, art@Book(_, _), rest@_*) => println("给当前实例Book一个引用名字 art ：" + art.des)
//      case Bundle(_, _, Book(desc, _), _*) => println("Book with des:" + desc)
//      case _ => println("Oops")
//    }
//    recursiveCase(
//      Bundle("Spark 1.0", 30.0, Book("Scala,yes", 18.0), Bundle("", 28.0, Book("java", 10), Book("c++", 20))))
//  }
//}
