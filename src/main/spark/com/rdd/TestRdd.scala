package com.rdd

import org.apache.spark.{SparkConf, SparkContext}

/**
  * https://www.cnblogs.com/sharpxiajun/p/5506822.html
  * Created by gouyangyang on 2018/8/14/014.
  *
  * 主要讲解rdd 的操作，RDD 是spark的数据类型，RDD是一个弹性的分布式数据集，什么有向无环图，本文暂时不去展开这些高深的概念
  * 阅读的时候可以把RDD当做一个数组，这样理解RDD是有很大的帮助
  *
  *
  * spark 中的计算都是操作RDD进行，
  * 1.如何构建一个RDD  一个是从外部文件hdfs，txt，csv等，另一个是从内存中创建rdd
  * 从内存中创建rdd  使用的方法makeRDD和parallelize方法，
  *
  */
object TestRdd {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("TestRdd")
    val sc = new SparkContext(conf)
    val rdd01 = sc.makeRDD(List(1, 2, 3, 4, 5, 6))
    val r01 = rdd01.map { x => x * x }
    println(r01.collect().mkString(","))
  }
}
