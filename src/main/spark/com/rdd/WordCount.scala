package com.rdd
import org.apache.spark.{SparkConf, SparkContext}
/**
  * Created by gouyangyang on 2018/5/3/003.
  */
object WordCount {
  def main(args: Array[String]): Unit = {
    if (args.length < 1) {
      System.err.println("Usage: <file>")
      System.exit(1)
    }
    val conf = new SparkConf()
    val sc = new SparkContext(conf)
    val rdd= sc.textFile(args(0))
    rdd.count()
    sc.stop()
  }
}
