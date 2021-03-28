package com.examples.spark

import org.apache.spark._

import scala.math.random

/**
  * @author gouyangyang on 2018/11/17/017 21:51
  *         在一个边长为2的正方形内画个圆，正方形的面积 S1=4，圆的半径 r=1，面积 S2=πr^2=π现在只需要计算出S2就可以知道π，
  *         这里取圆心为坐标轴原点，在正方向中不断的随机选点，总共选n个点，
  *         计算在圆内的点的数目为count，则 S2=S1*count/n，然后就出来了<br>
  *         -- 蒙特-卡罗方法
  **/
object SparkPi {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Spark Pi").setMaster("local[2]")
    val spark = new SparkContext(conf)
    val slices = if (args.length > 0) args(0).toInt else 2
    val n = math.min(100000L * slices, Int.MaxValue).toInt // avoid overflow
    val count = spark.parallelize(1 until n, slices).map { i =>
      val x = random * 2 - 1
      val y = random * 2 - 1
      if (x * x + y * y < 1) 1 else 0
    }.reduce(_ + _)
    println("Pi is roughly " + 4.0 * count / n)
    spark.stop()
  }
}
