package com.action

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/8/8/008.
  */
object FilterTest {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("FilterTest").setMaster("local")
    val sc = new SparkContext(conf)
    val lines = sc.textFile("D:\\github_project\\sparkorscala\\data\\sample.txt").filter(line => line.contains("zks"))
    //lines.collect().foreach(println(_))
    lines.foreach(x => println(x))
  }
}

//aa bb cc aa aa aa dd dd ee ee ee ee
//ff aa bb zks
//ee kks
//ee  zz zks

// 结果
//ff aa bb zks
//ee  zz zks