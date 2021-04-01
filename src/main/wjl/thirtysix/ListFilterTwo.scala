package thirtysix

/**
  * @author gouyangyang on 2019/3/8/008 13:13
  */
object ListFilterTwo {
  def main(args: Array[String]): Unit = {
    println(List(1, 2, 3, 4, 5) partition (_ % 2 == 0))
    println(List(1, 2, 3, 4, 5) find (_ % 2 == 0)) //运行结果：some（2）
    println(List(1, 2, 3, 4, 5) find (_ <= 0)) //运行结果：none
    println(List(1, 2, 3, 4, 5) takeWhile (_ < 4))
    println(List(1, 2, 3, 4, 5) dropWhile (_ < 4))
    println(List(1, 2, 3, 4, 5) span (_ < 4)) //结果：（list（1,2,3），list（4,5））
    def hastotallyZeroRow(m: List[List[Int]]) = m exists (row => row forall (_ == 0))

    //判断矩阵中元素是不是都满足条件==0，如果满足返回true，不满足返回false
    val m = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
    println(hastotallyZeroRow(m))
  }
}
