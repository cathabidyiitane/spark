package thirtytwo

/**
  * @author gouyangyang on 2018/10/22/022 21:14
  *         Scala列表有三个基本操作：
  *         head 返回列表第一个元素
  *         tail 返回一个列表，包含除了第一元素之外的其他元素
  *         isEmpty 在列表为空时返回true
  *         对于Scala列表的任何操作都可以使用这三个基本操作来表达。实例如下:
  */
object Test {
  def main(args: Array[String]): Unit = {
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val nums = Nil

    println("第一网站是 : " + site.head)

    println("最后一个网站是 : " + site.tail)

    println("查看列表 site 是否为空 : " + site.isEmpty)

    println("查看 nums 是否为空 : " + nums.isEmpty)
    println(nums.foreach(site))

    for (nums1 <- nums) {
      println(nums1)
    }
  }
}
