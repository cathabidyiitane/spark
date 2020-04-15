package wj.com.dt.scala.hello

/**
  * Created by gouyangyang on 2018/3/25/025.
  */
object MapOperations {

  def main(args: Array[String]): Unit = {


    val ages = Map("Rocky" -> 27, "Spark" -> 5)

    for ((k, v) <- ages) {
      println("Key is" + k + ",value is" + v)

    }

    for ((k, _) <- ages) {
      print("Key is" + k)
    }
  }

}
