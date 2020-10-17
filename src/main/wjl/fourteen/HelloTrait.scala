package fourteen

/**
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


