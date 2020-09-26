package com.rdd

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/8/30/030.
  * https://www.cnblogs.com/bonelee/p/7111395.html
  * reduceByKey更适合在大数据集上。这是因为spark 知道它可以在每个分区移动数据之前将输出数据与一个共用的key结合
  * 借助下图可以理解在reduceByKey里发生了什么，在数据对被搬移前，同一台机器上同样的key是怎么被组合的(reduceByKey中的 lamdba 函数).
  * 然后lamdba  函数在每个分区上被再次调用来将所有值的reduce成最终结果
  */
object ByKey {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("ByKey").setMaster("local")
    val sc = new SparkContext(conf)
    val words = Array("one", "two", "two", "three", "three", "three")
    val wordsRDD = sc.parallelize(words).map(word => (word, 1))
    //val wordsCountWithReduce = wordsRDD.reduceByKey(_ + _).collect().foreach(println)
    val wordsCountWithGroup = wordsRDD.groupByKey().map(w => (w._1, w._2.sum)).collect().foreach(println)
  }
}
