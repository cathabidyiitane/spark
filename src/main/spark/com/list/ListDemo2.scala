package com.list

/**
  * http://blog.csdn.net/pzw_0612/article/details/47700593
  * @ Created by gouyy on 2017-12-19.
  */
object ListDemo2 {

  //  def increase(list: List[Int]): List[Int] = list match {
  //    case List() => List()
  //    case head2 :: tail => (head2 + 1) :: increase(tail)
  //  }
  //
  //  def main(args: Array[String]): Unit = {
  //    val data = 1 to 2000
  //    val currntTime = System.currentTimeMillis()
  //    increase(data.toList)
  //    println("used time=" + (System.currentTimeMillis() - currntTime))
  //  }


  def main(args: Array[String]): Unit = {
    val data = 1 to 2000
    val currntTime = System.currentTimeMillis()
    increase_for(data.toList)
    println("used time=" + (System.currentTimeMillis() - currntTime))
  }

  def increase_for(list: List[Int]): List[Int] = {
    var result = List[Int]()
    for (element <- list) {
      result = result ::: List(element)
    }
    result
  }
}
