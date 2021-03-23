import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by gouyangyang on 2018/4/12/012.
  */
object Text {

  def main(args: Array[String]) {
    //创建环境变量
    val conf = new SparkConf().setMaster("local[2]").setAppName("Text")
    //创建环境变量实例
    val sc = new SparkContext(conf)
    //读取文件 并行化HDFS文件，注意文件的里面的单词以换行
    val data = sc.textFile("D:\\github_project\\sparkorscala\\data\\text")
    /**
      * flatMap是将文件按照“\t”分片
      * map 和 reduceByKey使得每一个相同的字母相加
      * collection 是actionc操作使得job运行
      * foreach 按行打印
      */
    data.flatMap(_.split("\t").map((_, 1))).reduceByKey(_ + _).collect().foreach(println)
  }
}
