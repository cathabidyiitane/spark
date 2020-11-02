package twentythree

/**
  * 头等函数，函数是一个值
  *
  * @author gouyangyang on 2018/10/12/012 14:11
  */
object FunctionTest {

  def main(args: Array[String]): Unit = {

    //fn = n
    def sum1(a: Int, b: Int): Int = {
      if (a > b) 0 else a + sum1(a + 1, b)
    }

    //fn = 2n
    def sum2(a: Int, b: Int): Int = {
      if (a > b) 0 else 2 * a + sum2(a + 1, b)
    }

    //  将fn进行抽象，改进
    def f1(a: Int) = a;

    def f2(a: Int) = 2 * a

    //fn = n
    def sum11(a: Int, b: Int): Int = {
      if (a > b) 0 else f1(a) + sum11(a + 1, b)
    }

    //fn = 2n
    def sum22(a: Int, b: Int): Int = {
      if (a > b) 0 else f2(a) + sum22(a + 1, b)
    }

    //通过上面减少写fn可能出错的过程，但是需要定义多个函数f1,f2
    //  再次改进
    def sum(f: Int => Int, a: Int, b: Int): Int = {
      if (a > b) 0 else f(a) + sum(f, a + 1, b)
    }

    def f11(a: Int) = a;

    def f22(a: Int) = 2 * a

    //fn = n
    def sum111(a: Int, b: Int): Int = sum(f11, a, b)

    //fn = 2n
    def sum222(a: Int, b: Int): Int = sum(f22, a, b)

    //  总结：函数作为参数进行传递，函数能调用满足参数要求的不同函数作为参数
    //  f11,f22都是函数可以被调用。

    //  匿名函数
    //  匿名函数的作用域很小，往往只在参数使用，作用范围就是调用该函数的函数体
    //  函数可以赋值给变量
    val f111 = (a: Int) => a
    val f222 = (a: Int) => 2 * a
    val f333 = (a: Int) => 3 * a

    //  定义函数mul(a:Int)这个函数没有返回类型，等号右边是匿名函数，这可以知道，用函数生成函数
    def mul(a: Int) = (b: Int) => b * a

    val f1111 = mul(1)
    val f2222 = mul(2)
    val f3333 = mul(3)

    //输入参数为f:Int => Int
    //  返回值为(Int,Int) => Int的函数
    //  Int={表示匿名函数的真实内容
    def sum4(f: Int => Int): (Int, Int) => Int = {
      def sum5(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum5(a + 1, b)
      sum5
    }

    def sum44(f: Int => Int): (Int, Int) => Int = {
      def sum55(a: Int, b: Int): Int = sum(f, a, b);
      sum55
    }

    val f41 = sum4(f1111)
    val f42 = sum4(f2222)
    val f43 = sum4(f3333)

    val f441 = sum44(f1111)
    val f442 = sum44(f2222)
    val f443 = sum44(f3333)

    //柯里化：指将接受两个参数的函数变成新的接收一个参数的函数过程
    //  调用一次函数，传入两个参数
    def mul2(a: Int, b: Int) = a * b

    //  mul2:(Int,Int) =>Int
    //柯里化定义
    def mul22(a: Int)(b: Int) = a * b

    //解释，用下面的借代
    //  def first(a:Int)=(b:Int) =>a*b
    //  def second = first(a)
    //  second:(Int) =>Int

    //柯里化可以对多个参数进行柯里化
    //  def A(a:T1,b:T2,c:T3,D:T4) =E
    //  def A(a:T1)(b:T2)(c:T3)(D:T4) =E

    //  对于前面的求和进行柯里化
    def sum5(f: Int => Int)(a: Int, b: Int): Int = {
      if (a > b) 0 else f(a) + sum5(f)(a + 1, b)
    }

    def f51(a: Int) = a

    def f52(a: Int) = 2 * a

    val f551 = sum5(f51)(1, 5)
    val f552 = sum5(f52)(1, 5)

    val f6 = sum5(f2) _


    def main(args: Array[String]) {
      //  mul2:(Int,Int) =>Int
      println(sum1(1, 5))

      println(sum2(1, 5))

      println(sum11(1, 5))

      println(sum22(1, 5))

      println(sum111(1, 5))

      println(sum222(1, 5))

      println(f41(1, 5))
      println(f42(1, 5))
      println(f43(1, 5))

      println(f441(1, 5))
      println(f442(1, 5))
      println(f443(1, 5))
      //    柯里化
      println(mul2(2, 5))
      println(mul22(2)(5))

      println(f551)
      println(f552)
      println(f6)
    }
  }
}
