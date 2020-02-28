package com.list

import org.apache.log4j.Logger
/**
  * @ Created by gouyy on 2017-12-17.
  */
object ListDemo {
  def main(args: Array[String]): Unit = {
    //    val data = 1 to 2000000
    //
    //    val currntTime = System.currentTimeMillis()
    //    increase_ListBuffer(data.toList)
    //    println("used time=" + (System.currentTimeMillis() - currntTime))
    //  }
    //
    //  def increase_ListBuffer(list: List[Int]): List[Int] = {
    //
    //    val result = ListBuffer[Int]()
    //    for (element <- list) {
    //      result += element + 1
    //    }
    //    result.toList

//    val data = 1 to 20000
//
//    val currntTime = System.currentTimeMillis()
//    increase(data.toList)
//    println("used time=" + (System.currentTimeMillis() - currntTime))
//
//
//    def increase(list: List[Int]): List[Int] = list match {
//      case List() => List()
//      case head2 :: tail => (head2 + 1) :: increase(tail)
//    }

    val  loggered = Logger.getLogger(getClass.getClass)
    def checkArgs(args: Array[String]): Boolean = {
      if (args.length == 5) {
        true
      }
      else {
        loggered.info("arguments input error, arguments length : " + args.length)
        false
      }
    }
  }
}
