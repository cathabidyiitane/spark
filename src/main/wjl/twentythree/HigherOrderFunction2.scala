package twentythree

/**
  * @author gouyangyang on 2018/10/12/012 14:30
  */
object HigherOrderFunction2 {

  //定义普通函数
  def add(left: Double, right: Double): Double = {
    left + right
  }

  //作为值的函数
  val valueAdd = add _ //使用" _"匹配参数
  //测试匿名函数
  val anonymousFunctionAdd = (left: Double, right: Double) => println(s"anonymousFunctionAdd:left add right equal ${left + right}")
  val left = 2.34
  val right = 6.78

  //测试高阶函数
  def higherOrderFunction(f: (Double) => Double) = f(3 * left)

  //高级函数变形
  def anotherHigherOrderFunction(left: Double) = (right: Double) => left * right

  def main(args: Array[String]): Unit = {
    // 调用值为值的函数
    valueAdd(2.67, 4.54)
    // 调用匿名函数
    anonymousFunctionAdd(3.6, 4.5)
    //调用高阶函数
    println(higherOrderFunction(x => 3 * x).formatted("%.2f"))
    //调用高级函数变形
    val another = anotherHigherOrderFunction(left)
    println(another(right).formatted("%.2f"))
  }
}
