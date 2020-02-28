package com.action

import org.apache.spark.{SparkConf, SparkContext}

/**
  * @ Created by gouyy on 2017-12-18.
  */
object HelloSpark {
  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      System.err.print("Usage: HelloSpark  <Input> <Output>")
      System.exit(1)
    }

    val conf = new SparkConf().setAppName("HelloSpark").setMaster("local[0]")
    val sc = new SparkContext(conf)
    //session查询次数排行榜
    val rdd1 = sc.textFile(args(0)).map(_.split("\t")).filter(_.length == 6)
    val rdd2 = rdd1.map(x => (x(1), 1)).reduceByKey(_ + _).map(x => (x._2, x._1)).sortByKey(false).map(x => (x._2, x._1))
    rdd2.saveAsTextFile(args(1))
    sc.textFile(args(0)).map(_.split(" ")).filter(_.length == 6).map(x => (x(1), 1)).reduceByKey(_ + _).map(x => (x._2, x._1)).sortByKey(false).map(x => (x._2, x._1)).saveAsTextFile(args(1))
    sc.textFile(args(0)).map(_.split("\t")).filter(_.length == 6).map(x => (x(1), 1)).reduceByKey(_ + _).map(x => (x._2, x._1)).sortByKey(false).map(x => (x._2, x._1)).saveAsTextFile(args(1))
    sc.stop()
  }
}
