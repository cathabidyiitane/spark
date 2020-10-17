package fourteen

/**
  * @author gouyangyang on 2018/9/26/026 09:46
  */
/**
  * Scala Trait(特征) 相当于 Java 的接口，实际上它比接口还功能强大。
  * 与接口不同的是，它还可以定义属性和方法的实现。
  * 一般情况下Scala的类只能够继承单一父类，但是如果是 Trait(特征) 的话就可以继承多个，从结果来看就是实现了多重继承。
  * Trait(特征) 定义的方式与类类似，但它使用的关键字是 trait，如下所示：
  *
  * 以上Trait(特征)由两个方法组成：isEqual 和 isNotEqual。isEqual 方法没有定义方法的实现，isNotEqual定义了方法的实现。子类继承特征可以实现未被实现的方法。所以其实 Scala Trait(特征)更像 Java 的抽象类。
  * 以下演示了特征的完整实例：
  */
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}

object Test {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}
