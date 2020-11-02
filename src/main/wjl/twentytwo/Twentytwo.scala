package twentytwo

/**
  * https://blog.csdn.net/bluejoe2000/article/details/51533621
  * 闭包是一个函数，返回值依赖于声明在函数外部的一个或者多个变量。
  * 闭包通常来讲可以简单的认为是可以访问一个函数里面局部的另一个函数
  *
  *
  * 如下面匿名的函数
  * val multiplier =(i:Int)=>i*10
  *
  * 函数体内有一个变量i，它作为函数的一个参数，如下面的的另一个代码:
  *
  * val multiplier =(i:Int) => i * factor
  *
  * 在multiplier  中有两个变量:i 是函数的形式参数,在multiplier 函数被调用时,被赋予一个新的值，然而，
  * factor不是形式参数，而是自由变量，考虑下面代码
  * val factor =3
  * val multiplier =(i:Int)=> i*factor
  *
  * 这里我们引入了一个自由变量factor,这个变量定义在函数外面。
  * 这样定义的函数multiplier 成为一个"闭包"，因为他引用到函数外面的变量，定义函数的过程将这个自由变量捕获而构成一个封闭的函数
  *
  *
  *
  *
  * @author gouyangyang on 2018/10/12/012 10:46
  */
object Twentytwo {

  def main(args: Array[String]): Unit = {

    println("muliplier(1) value = " + multiplier(1))
    println("muliplier(2) value = " + multiplier(5))
  }

  var factor = 3
  val multiplier = (i: Int) => i * factor
}
