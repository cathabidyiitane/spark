package nineteen

/**
  * https://blog.csdn.net/qq_32023541/article/details/79549770
  * 构造函数模式匹配
  *
  * @author gouyangyang on 2018/9/26/026 14:32
  */
object ScalaExample2 {
//
//  // 定义一个样例类
//  case class Dog(val name: String, val age: Int)
//
//  // 利用构造函数创建对象
//  val dog = Dog("Pet", 2)
//
//  def patternMatching(x: AnyRef) = x match {
//    case Dog(name, age) => println(s"Dog name = $name,age = $age")
//    case _ =>
//  }
//
//  patternMatching(dog)
//}
//
////注意前面构造函数匹配用的是样例类 case class，如果普通类则需要在伴生对象中定义 unapply 方法
//
//object ScalaExample {
//
//  //定义普通类 Dog
//  class Dog(val name: String, val age: Int)
//
//  //Dog类的伴生对象
//  object Dog {
//    //手动实现 unapply 方法
//    def unapply(dog: Dog): Option[(String, Int)] = {
//      if (dog != null) Some(dog.name, dog.age) else None
//    }
//  }
//
//  //利用构造函数创建对象，因为 Dog 是普通的类且伴生对象没有定义 apply，所以必须用显式的 new 来创建对象
//  val dog = new Dog("Pet", 2)
//  def patternMatching(x: AnyRef) = x match {
//    //因为在 Dog 的伴生对象中实现了 unapply 方法，此处可以使用构造函数模式
//    case Dog(name, age) => println(s"Dog = $name,age = $age")
//    case _ =>
//  }
//
//  patternMatching(dog)
}