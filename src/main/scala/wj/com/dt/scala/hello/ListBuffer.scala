package wj.com.dt.scala.hello

import scala.collection.mutable.ListBuffer

/**
  * Created by gouyangyang on 2018/4/27/027.
  */
object  ListBuffer {
  def main(args: Array[String]): Unit = {
        val listBuffer = new ListBuffer[Int]
        listBuffer += 1
        listBuffer += 2
        println(listBuffer.++("3"))
       println(listBuffer.++("3").length)


//    val data = 1 to 20000
//    val currntTime =System.currentTimeMillis()
//    increase_for(data.toList)
//    println("used time=" + (System.currentTimeMillis() - currntTime))
//
//  }
//  //循环
//  def increase_for(list:List[Int]) :List[Int] = {
//    var result = List[Int]()
//    for(element <- list){
//      result = result::: List(element)
//    }
//    result
  }
}