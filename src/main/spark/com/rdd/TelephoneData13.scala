package com.rdd

import java.util
import java.util.Properties
import org.apache.spark.sql.types.{DataTypes, StructField}
import org.apache.spark.sql.{Row, SQLContext, SaveMode}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/6/10/010.
  */
object TelephoneData13 {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("TelephoneData13")
    val sc = new SparkContext(conf)
    val sQLContext = new SQLContext(sc)
    val df = sQLContext.read.format("com.databricks.spark.csv").option("sep", ",").option("header", "true")
      .load("E:\\code\\scala\\data\\hangzhou\\*.csv")
    df.foreach(x => println(x))
    df.printSchema()
    df.show(1000, false)
    val temp = df.rdd.map(line => {
      Row(
        line.getString(0).toInt,
        line.getString(1).toString,
        line.getString(2).toInt,
        line.getString(3).toString,
        line.getString(4).toString,
        line.getString(5).toString,
        line.getString(6).toString,
        line.getString(7).toString,
        line.getString(8).toString,
        line.getString(9).toString,
        line.getString(10).toString,
        line.getString(11).toString)
    })
    val fields = new util.ArrayList[StructField]()
    fields.add(DataTypes.createStructField("id", DataTypes.IntegerType, true))
    fields.add(DataTypes.createStructField("caseID", DataTypes.StringType, true))
    fields.add(DataTypes.createStructField("evID", DataTypes.IntegerType, true))
    fields.add(DataTypes.createStructField("localNum", DataTypes.StringType, true))
    fields.add(DataTypes.createStructField("startTime", DataTypes.StringType, true))
    fields.add(DataTypes.createStructField("position", DataTypes.StringType, true))
    fields.add(DataTypes.createStructField("method", DataTypes.StringType, true))
    fields.add(DataTypes.createStructField("dialNumber", DataTypes.StringType, true))
    fields.add(DataTypes.createStructField("callDuration", DataTypes.StringType, true))
    fields.add(DataTypes.createStructField("starFlag", DataTypes.StringType, true))
    fields.add(DataTypes.createStructField("week", DataTypes.StringType, true))
    fields.add(DataTypes.createStructField("hours", DataTypes.StringType, true))

    var prop = new Properties()
    prop.setProperty("user", "root")
    prop.setProperty("password", "123456")

    val st = DataTypes.createStructType(fields)
    val newdf = sQLContext.createDataFrame(temp, st)
    df.registerTempTable("calllistbean_bak")
    val sqlcommand = "select caseID,evID,localNum,startTime,position,method,dialNumber,callDuration,starFlag,week,hours from calllistbean_bak"
    val dataResult = sQLContext.sql(sqlcommand).write.mode(SaveMode.Append).jdbc("jdbc:mysql://172.16.102.180:3306/bdcloud", "calllistbean_bak", prop)
    newdf.show()
    sc.stop()
  }

}
