package thirtyone

/**
  * @author gouyangyang on 2018/10/22/022 20:43
  */
object Test {
  def main(args: Array[String]): Unit = {
    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")
    println("sites.get( \"runoob\" ) : " + sites.get("runoob")) // Some(www.runoob.com)
    println("sites.get( \"baidu\" ) : " + sites.get("baidu")) //  None
  }
}
