package twentythree
/**
  * @author gouyangyang on 2018/10/12/012 14:18
  */
object Test {
  def main(args: Array[String]): Unit = {
    println( apply( layout, 10) )
  }
  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  def apply(f: Int => String, v: Int) = f(v)
  def layout[A](x: A) = "[" + x.toString() + "]"
}
