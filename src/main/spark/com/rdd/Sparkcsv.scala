package com.rdd

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.unsafe.types.UTF8String
/**
  * Created by gouyangyang on 2018/6/6/006.
  */
object Sparkcsv {
  def main(args: Array[String]): Unit = {
    val sparConf = new SparkConf().setAppName("Sparkcsv").setMaster("local")
    val sc = new SparkContext(sparConf)
    val sql = new SQLContext(sc)
    val rdd = sql.read.format("com.databricks.spark.csv").option("sep", ",").option("header", "true")
      .load("D:\\github_project\\sparkorscala\\data\\yy2.csv")
    rdd.foreach(x => println(x))
   // rdd.printSchema()
//    rdd.show()
  }
}
