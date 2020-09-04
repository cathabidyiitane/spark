package com.rdd

import java.util.Properties

import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{SQLContext, SaveMode}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/6/10/010.
  */
//case class Call()
object QASYY2 {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("QASYY2").setMaster("local")
    val sc = new SparkContext(sparkConf)
    val sQLContext = new SQLContext(sc)
    val schemaString = "id call_type source bill_type call_flag call_date call_time callDuration from_num_attr from_num_attr_cn localNum to_num_attr to_num_attr_cn dialNumber method call_location call_location_cn imsi switch_id from_num_location village_code to_num_location to_location to_location_cn caseID evID starFlag"
    val fields = schemaString.split(" ").map(fieldName => fieldName match {
      //case "id" => StructField(fieldName, LongType, false)
      //case "evID" => StructField(fieldName,  LongType, true)
      //case "starFlag" => StructField(fieldName,  LongType, true)
      case _ => StructField(fieldName, StringType, true)
    })
    val customSchema = StructType(fields)
    val callDFCsv = sQLContext.read.format("csv")
      .schema(customSchema)
      .option("sep", ",")
      .option("header", "true")
      .load("D:\\github_project\\sparkorscala\\data\\666666666666.csv")
    //callDFCsv.foreach(x => println(x))
    callDFCsv.registerTempTable("calllistbean_bak")
    //1.清洗源
    val purgeSourceDF = sQLContext.sql("SELECT caseID,evID,starFlag," +
      "concat_ws(' ',call_date,call_time) AS startTime," +
      "callDuration,localNum,dialNumber,method," +
      "concat_ws(',',from_num_location,village_code) AS position," +
      "substring(call_time,0,2) AS hours," +
      //      "dayofweek(call_date) AS week " +
      "date_format(call_date,'EE') AS week " +
      "FROM calllistbean_bak ")
    purgeSourceDF.foreach(x => println(x))
    purgeSourceDF.show()
    val fillColumnsValues = Map(
      "caseID" -> "42",
      "evID" -> "42",
      "starFlag" -> "-1"
    )

    // fillColumnsValues.foreach(x => println(x))
    //2.填充Null列
    val fillPurgedDF = purgeSourceDF.na.fill(fillColumnsValues)
    fillPurgedDF.show()
    //3.注意：向JDBC写入的时候使用连接池、按照分区写入最好，使用JDBC的方式连接数据库
//    val jdbcConnProp = new Properties()
//    jdbcConnProp.put("user", "root")
//    jdbcConnProp.put("password", "123456")
//    val sqlcommand = "select caseID,evID,localNum,startTime,position,method,dialNumber,callDuration,starFlag,week,hours from calllistbean_bak"
//    fillPurgedDF.write.mode(SaveMode.Append).jdbc("jdbc:mysql://172.16.102.180:3306/bdcloud", "calllistbean_bak", jdbcConnProp)
    sc.stop()
  }
}
