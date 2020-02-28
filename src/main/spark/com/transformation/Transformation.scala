package com.transformation

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}
/**
  * @ Created by gouyy on 2017-12-06.
  */
object Transformation {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("SparkflatMap").setMaster("local[0]")
    val sc = new SparkContext(sparkConf)
    val sqlContext = new SQLContext(sc)
    val a = sc.parallelize(List("dog", "salmon", "salmon", "rat", "elephant"), 3)
    val b = a.map(_.length)
    val c = a.zip(b)
    c.collect
    sc.stop()
  }
}