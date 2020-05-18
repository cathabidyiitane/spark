package wj.com.dt.scala.hello

import scala.io.Source


/**
  * Created by gouyangyang on 2018/3/25/025.
  */
object FileOps {

  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("D:\\github_project\\sparkorscala\\data\\text")
    // val file  = Source.fromURL("http://spark.apache.org/")
    for (elemnt <- file.getLines) {
      println(elemnt)
    }
  }

}
