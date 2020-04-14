/**
  * Created by gouyangyang on 2018/3/21/021.
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    //    val dim_info_spliter = "\\u0001"
    //    val dim_info_spliter = "\001"
    //    println(dim_info_spliter)
    val a = "Hello world".filter(_ != 'H').map(_.toUpper)
    print(a)
  }


//  def main(args: Array[String]): Unit = {
//    val bro_path= args(0)
//    print(bro_path)
//  }
}
