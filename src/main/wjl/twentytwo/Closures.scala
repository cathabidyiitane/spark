package twentytwo

/**
  * https://www.jianshu.com/p/8f24150fad2a
  * 闭包简单的说就是函数内部的函数不在其中作用时，依然可以从外部访问，听上去有点抽象；
  * 我们定义了一个函数 makeAdd，输入参数是 Int 类型，返回的是一个函数（其实可以看成函数，后面我们会深入去研究到底是什么），
  * 同样我们定义了一个普通的函数 normalAdd 来进行比较，main 方法中，首先我们通过调用 makeAdd 来定义了两个 val：addOne 和 addTwo 并分别传入 1 和 2，
  * 然后执行并打印 addOne(1) 和 addTwo(2)，运行的结果是 2 和 3。
  *
  * @author gouyangyang on 2018/10/12/012 11:49
  */
object Closures {
  def main(args: Array[String]): Unit = {
    val addOne = makeAdd(1)
    val addTwo = makeAdd(2)

    println(addOne(1))
    println(addTwo(1))
  }

  def makeAdd(more: Int) = (x: Int) => x + more

  def normalAdd(a: Int, b: Int) = a + b
}
