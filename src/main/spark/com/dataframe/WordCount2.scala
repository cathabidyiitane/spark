package com.dataframe
import org.apache.spark.{SparkContext, SparkConf}
/**
  * @ Created by gouyy on 2017-12-03.
  */
object WordCount2 {
  def main(args: Array[String]): Unit = {

    /**
      *第一步：创建spark的配置对象SparkConf，设置spark程序运行的信息
      * 例如 setAppName 来设置应用程序的名称，在程序运行界面可以看到该名称
      *
      *
      *
      *
      */
    val conf = new SparkConf().setAppName("WordCount2").setMaster("local")




  }
}
