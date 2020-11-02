package twentythree

/**
  * 偏函数就是让一个函数接收和处理其参数定义域范围内的子集。
  *
  * @author gouyangyang on 2018/10/12/012 15:10
  */
object Test2 {

  def main(args: Array[String]): Unit = {
    //    val data = List(1, 2, 3, 4, 5)
    //    data.foreach(print _) //_代表参数列表，是下面写法的简化形式
    //    println()
    //    data.foreach(x => println(x))
    //    data.foreach(print) //这是最优化的写法
    def sum(a: Int, b: Int, c: Int) = a + b + c
    println(sum(2, 4, 6))   //输出 12
    val fp_a = sum     _ //fp_a是指针，指向了sum函数。需要传入3个参数。偏函数会以sum()的代码生成一个类，里面有一个apply方法
    println(fp_a(2, 4, 1))   //输出7  内部调用了apply(),和下面的写法是一个意思。
    println(fp_a.apply(9, 2, 4))  //输出15
    val fp_b = sum(1, _: Int, 3)   //需要传入1个参数。可以传递部分函数，必须指定类型Int
    println(fp_b(2))    //输出6
    println(fp_b(10))   //输出14
  }
}
