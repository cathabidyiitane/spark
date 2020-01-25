package com.dataframe

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

/**
  * @ Created by gouyy on 2017-12-02.
  */
object DataFrameOperation {
  def main(args: Array[String]) {
    /**
      * Spark SQL编程的入口点：SQLContext， 首先要创建一个SparkContext
      */
    val sparkConf = new SparkConf().setAppName("DataFrameOperation").setMaster("local[2]")
    val sparkContext = new SparkContext(sparkConf)
    val sqlContext = new SQLContext(sparkContext)
    //涉及隐式转换，建议sqlContext new出来立刻写上
    //第一步：通过SQLContext来读取json文件
    val jsonDF = sqlContext.read.format("json").load("D:\\github_project\\sparkorscala\\data\\people.json")
    jsonDF.show
    //    jsonDF.write
    jsonDF.printSchema()
    //    jsonDF.select("name").show()
    //    jsonDF.select("name", "age").show()
    //    jsonDF.select($"name").show()
    //    jsonDF.select('name).show()
    //jsonDF.col("age") 是选择一个df中的列
    //    jsonDF.select(jsonDF.col("age"), jsonDF.col("age") + 1).show()
    // 系统清理工作，一定要完成
    sparkContext.stop()
  }
}
