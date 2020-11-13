package thirtytwo

import scala.collection.mutable.{ArrayBuffer, Buffer}

/**
  * @author gouyangyang on 2018/10/23/023 08:48
  */
object ArrayLearning {

  def main(args: Array[String]): Unit = {

  }

  private def useZipUnzip = {
    val nums = List(1, 2, 3, 4)
    val chars = List('a', 'b', 'c', 'd')
    val combinList = nums.zip(chars)

    println(combinList)
    println(combinList.unzip)
  }

  private def ArrayBufferOps = {
    //创建可变数组
    val strArrayVar = ArrayBuffer[String]()
    //在尾部添加元素
    strArrayVar += "aaa"
    println(strArrayVar)

    strArrayVar += ("bbb", "ccc")

    println(strArrayVar)

    //追加任意集合
    strArrayVar ++= List("ddd", "eee")
    println(strArrayVar)

    //删除尾部3个元素
    strArrayVar.trimEnd(3)
    println(strArrayVar)

    //可变和不可变数组转换
    val arr: Array[String] = strArrayVar.toArray
    val arrBuffer: Buffer[String] = arr.toBuffer

  }

  private def arrayOps = {
    // 创建定长数组
    val numberArray = new Array[Int](10)
    val stringArray = new Array[String](10)

    // 数组赋值
    stringArray(0) = "hello"
    println(stringArray(0))

    //用Array apply方法创建数组
    val strArray = Array("aaa", "bbb")
  }

  private def listOps = {
    val xss = List(List(1, 2, 3), List("a", "b", "c"))
    val fList: List[Any] = xss.flatten
    println(fList)
    println(List.concat(List(1, 2, 3), List(4, 5, 6)))
    println(List(1, 2, 3) ::: List(4, 5, 6) ::: Nil)
  }
}
