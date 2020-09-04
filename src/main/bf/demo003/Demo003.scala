package demo003

import java.util.Properties

import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/5/21/021.
  */
object Demo003 {
  //  def main(args: Array[String]): Unit = {
  //    val name1,name2:String ="100";
  //    val name3=100;
  //    println(name1,name2)
  //    println(name3)
  //  }
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Demo003")
    val sc = new SparkContext(conf)
    val sqlContext = new HiveContext(sc) // 或者SQLContext

    // 写好JDBC连接相关信息
    val url = "jdbc:mysql://localhost:3306/sakila"
    val table = "address"
    val props = new Properties()
    props.setProperty("user", "root")
    props.setProperty("password", "123456")
    props.setProperty("driver", "com.mysql.jdbc.Driver")
    // 开始读取数据，并显示
    sqlContext.read.jdbc(url, table, props).show()
    sc.stop()
  }
}
