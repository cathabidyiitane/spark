package com.rdd

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}
/**
  * @ Created by gouyy on 2017-12-18.
  */
object RDDDemo {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("RDDDemo").setMaster("local")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    val lines = sc.textFile("D:\\github_project\\sparkorscala\\data\\sample.txt").filter(line => line.contains("zks"))
    lines.foreach(println)
    sc.stop()
  }
}
