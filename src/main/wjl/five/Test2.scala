package five

import scala.Array._

/**
  *
  * 多维数据
  * Created by gouyangyang on 2018/9/20/020.
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    var myMatrix = ofDim[Int](3, 3)
    // 创建矩阵[Int](3,3)
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }
    // 打印二维阵列
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }
  }
}
