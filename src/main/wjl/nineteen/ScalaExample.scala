package nineteen

/**
  * https://blog.csdn.net/qq_32023541/article/details/79549770    模式匹配
  * 常量模式 和 变量模式
  * @author gouyangyang on 2018/9/26/026 14:11
  */
object ScalaExample {
  for (i <- 1 to 5) {
    i match {
      case 1 => println(1)
      case 2 => println(2)
      case 3 => println(3)
      case _ => println("其他")
    }
  }

  //还可以加入表达式，变量模式
  //  i match {
  //    case x if (x % 2 == 0) => println(s"$x 能够被 2 整除")
  //    //其他不操作
  //    case _ =>
  //  }
}