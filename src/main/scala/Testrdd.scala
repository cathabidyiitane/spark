import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/3/20/020.
  * https://www.cnblogs.com/sharpxiajun/p/5506822.html
  * 第一类方式从内存里构造RDD，使用的方法：makeRDD和parallelize方法
  * 第二类方式是通过文件系统构造RDD
  *
  */
object Testrdd {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Testrdd").setMaster("local")
    val sc = new SparkContext(sparkConf)

    val rdd01 = sc.makeRDD(List(1, 2, 3, 4, 5, 6, 4, 9, 8, 7, 66, 6, 0))
    // val r01 = rdd01.map { x => x * x }
    println(rdd01.collect().toString)
    println(rdd01.distinct.collect().mkString(","))
  }
}
