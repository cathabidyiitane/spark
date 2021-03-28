package kxscala.ten

/**
  * https://www.cnblogs.com/HeQiangJava/p/6711527.html
  *
  * @author gouyangyang on 2018/12/28/028 11:17
  *         Scala 中的Trait是一种特殊的概念
  *         首先我们可以将Trait作为接口来使用,此时的Trait就与java中的接口类似
  *         在Trait中可以定义抽象方法，与抽象类中的抽象方法是一样的，只要不给出具体的实现即可
  *         类可以使用extends关键字继承trait，注意，这里不是implement，而是extends，在scala 中没有implement概念，无论继承还是trait,统一都是extends
  *         类继承trait后,必须实现其中的抽象方法，实现时不需要使用override关键字
  *         scala不支持对类进行多继承，但是支持多继承trait,使用with关键即可
  */
trait HelloTrait {
  def sayHello(name: String)
}

trait MakeFriendsTrait {
  def makeFriends(p: Person)
}

class Person(val name: String) extends HelloTrait with MakeFriendsTrait with Cloneable with Serializable {

  def sayHello(name: String) = println("Hello, " + name)

  def makeFriends(p: Person) = println("Hello, my name is " + name + ", your name is " + p.name)
}