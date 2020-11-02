package twentythree

/**
  * https://blog.csdn.net/yyywyr/article/details/50281819
  * 高阶函数
  * @author gouyangyang on 2018/10/12/012 14:50
  */
object HighOrderFuncTest {
  def main(args: Array[String]): Unit = {
    println("高阶函数第一种--函数作为参数：")

    // 第一种:函数作为参数
    def convertIntToString(f: (Int) => String) = f(4)

    println(convertIntToString { x => x + ",I am from Int." })
    println("高阶函数第二种--函数的返回值是函数：")

    def mulBy(factor: Double) = (x: Double) => factor * x

    val q = mulBy(10)
    println(q(5))

    println("Scala常用高阶函数之map")
    Array("x", "y", "z").map(x => x * 2).foreach(println)
    Array("x", "y", "z").map(_ * 2).foreach(println)
    println("Scala常用高阶函数之reduce:")
    println(Array(1, 2, 3, 4, 5).reduce(_ + _))
  }
}
