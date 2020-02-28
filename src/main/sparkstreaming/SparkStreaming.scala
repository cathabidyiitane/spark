import org.apache.spark.streaming.{StreamingContext, _}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * @ Created by gouyy on 2017-12-07.
  */
object SparkStreaming {

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("SparkStreaming").setMaster("local[0]")
    val sc = new SparkContext(sparkConf)
    val ssc = new StreamingContext(sc, Seconds(1))
    val lines = ssc.socketTextStream("master", 9999)

    val words = lines.flatMap(_.split(" "))
    val pairs = words.map(word => (word, 1))
    val wordCounts = pairs.reduceByKey(_ + _)
    // Print the first ten elements of each RDD generated in this DStream to the console
    wordCounts.print()

    ssc.start() // Start the computation
    ssc.awaitTermination() // Wait for the computation to terminate
  }
}
