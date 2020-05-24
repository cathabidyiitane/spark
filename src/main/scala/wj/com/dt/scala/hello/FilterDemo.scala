package wj.com.dt.scala.hello

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/4/26/026.
  */
object FilterDemo {


  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Rddmap").setMaster("local")
    val sc = new SparkContext(sparkConf)

    val  rdd = List.range(1,10)
    val enevs = rdd.filter(_%2==0)
    println(enevs)
    println(enevs.mkString)
  }
}
