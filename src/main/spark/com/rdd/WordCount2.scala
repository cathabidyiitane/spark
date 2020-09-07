package com.rdd

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/5/15/015.
  */
object WordCount2 {
  def main(args: Array[String]): Unit = {
    /**
      * 创建sparkconf
      * 创建sparkContontext
      **/
    val sparkConf = new SparkConf().setAppName("WordCount2").setMaster("local")
    val sc = new SparkContext(sparkConf)
    val lines = sc.textFile("D:\\github_project\\sparkorscala\\data\\infos.txt")
    val words = lines.flatMap(_.split(" "))
    val wordTuple = words.map((_, 1))
    val wcRDD = wordTuple.reduceByKey((_ + _))
    wcRDD.foreach(println)
    sc.stop()
  }
}
