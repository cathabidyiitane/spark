package wj.com.dt.scala.hello

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/4/26/026.
  */
object Rddmap {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Rddmap").setMaster("local")
    val sc = new SparkContext(sparkConf)
    val rdd = sc.parallelize(List("coffee panda", "happy panda", "happiest panda party"))
    rdd.flatMap(x=>x.split(" ")).collect
  }
}
