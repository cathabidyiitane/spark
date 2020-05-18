package wj.com.dt.scala.hello

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/4/26/026.
  */
object GroupByDemo {
  def main(args: Array[String]): Unit = {
    var sparkConf = new SparkConf().setAppName("GroupByDemo").setMaster("local[1]")
    var sc = new SparkContext(sparkConf)
    val a = sc.parallelize(List(1,2,3,4,5),1)
    val b = a.map((_,"b"))
    val c = a.map((_,"c"))
    println(b.cogroup(c).collect()).toString
  }
}
