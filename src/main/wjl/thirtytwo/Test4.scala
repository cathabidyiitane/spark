package thirtytwo
/**
  * @author gouyangyang on 2018/10/22/022 21:43
  */
object Test4 {
  def main(args: Array[String]): Unit = {
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    println("site 反转前 : " + site)
    println("site 反转后 : " + site.reverse)
  }
}
