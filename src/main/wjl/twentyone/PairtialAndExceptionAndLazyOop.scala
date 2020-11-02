package twentyone

import java.io.IOException

/**
  * https://blog.csdn.net/paicmis/article/details/77626220
  * scala 函数和偏函数
  * @author gouyangyang on 2018/10/12/012 10:17
  */
object PairtialAndExceptionAndLazyOop {

  def main(args: Array[String]): Unit = {
    val sample = 1 to 10;

    val isEven: PartialFunction[Int, String] = { //2个参数一个输入 一个输出
      case x if x % 2 == 0 => (x + " is even")
      // case _=> x + " is Oldd"
    }
    val isOldd: PartialFunction[Int, String] = { //2个参数一个输入 一个输出
      case x if x % 2 == 1 => (x + " is oldd")
    }

    println(isEven(4)) //这个不会抛出异常
    val evemnumber = sample collect isEven //这个是调用 collect方法
    evemnumber.foreach(println)

    val numbers = sample map (isEven orElse isOldd) //这个是调用 collect方法,
    numbers.foreach(println)
    exception

    lazy val x = 3 // 定义的时候x是没有赋值的，这个是惰性计算的
    println("x===" + x) //这里 x才赋值
  }

  override def hashCode(): Int = super.hashCode()

  def exception: Unit = { //异常和Java里面的异常类似，没有太多的区别
    try {
      1 / 0
    } catch {
      case indexOutOf: IndexOutOfBoundsException => println("IndexOutOfBoundsException" + indexOutOf.toString)
      case arithmeticException: ArithmeticException => println("ArithmeticException" + arithmeticException.toString)
      case iOException: IOException => println("IOException" + iOException.toString)
      case _: Exception => println("the other execption")
    }
  }
}
