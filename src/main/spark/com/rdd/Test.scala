package com.rdd

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{DataFrame, SQLContext}
import org.apache.spark.sql.functions._
import org.json.Test
//import org.junit.{After, Before, Test}
//import org.junit.Assert.assertEquals

/**
  * Created by gouyangyang on 2018/8/16/016.
  */
object Test {
  @transient var sc: SparkContext = _
  @transient var sqlContext:SQLContext = _
//  @Before
  def init(): Unit ={
    val conf = new SparkConf().setAppName("Test").setMaster("local")
    sc = new SparkContext(conf)
    sqlContext = new org.apache.spark.sql.SQLContext(sc)
  }
  //@Test
  def TestMapFun(): Unit ={
    val df = sqlContext.read.json("D:\\github_project\\sparkorscala\\data\\people_Array.json")
    df.show()
    df.printSchema()

    val dfScore = df.select(df("name"),explode(df("myScore"))).toDF("name","myScore")
    val dfMyScore = dfScore.select("name","myScore.score1", "myScore.score2")
    dfMyScore.show()

    dfMyScore.registerTempTable("table1")
    val result = sqlContext.sql("select name,avg(hwScore_Std),avg(exScore_Std) from table1")
//    assertEquals(7,dfMyScore.count())
  }
}
