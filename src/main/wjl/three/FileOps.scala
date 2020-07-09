package three

import scala.io.Source


/**
  * Created by gouyangyang on 2018/6/10/010.
  */
object FileOps {
  def main(args: Array[String]): Unit = {
//    val file = Source.fromFile("E:\\BaiduNetdiskDownload\\wangwenjun.txt")
    val file2 = Source.fromURL("http://www.hao123.com/")
    for (element <- file2) {
      print(element)
    }
  }

}
