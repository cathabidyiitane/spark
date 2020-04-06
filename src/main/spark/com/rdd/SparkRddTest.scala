package com.rdd

/**
  * Created by gouyangyang on 2018/3/16/016.
  * http://blog.csdn.net/pzw_0612/article/details/47700593
  */
object SparkRddTest {
  def main(args: Array[String]) {

    val data = 1 to 20000

    val currntTime = System.currentTimeMillis()
    increase(data.toList)
    println("used time=" + (System.currentTimeMillis() - currntTime))

  }

  def increase(list: List[Int]): List[Int] = list match {
    case List() => List()
    case head2 :: tail => (head2 + 1) :: increase(tail)
  }
}
