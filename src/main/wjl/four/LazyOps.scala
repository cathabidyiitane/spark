package four

import scala.io.Source


/**
  * Created by gouyangyang on 2018/6/10/010.
  */
object LazyOps {

  def main(args: Array[String]): Unit = {
    lazy val file = Source.fromFile("E:\\BaiduNetdiskDownload\\wangwenjun.txt")
    println("Scala")
    for (line<-file.getLines) println(line)
  }

}
