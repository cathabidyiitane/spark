package wj.com.dt.scala.hello

/**
  * Created by gouyangyang on 2018/3/24/024.
  */
object TupleOps {

  def main(args: Array[String]): Unit = {
    //Tuple可以作为集合存储不同类型的数据，初始化实例如下
    val tuple = (100, "Scala", "Spark")
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
  }
}
